package com.petnolja.semi.admin.post.model.service;

import static com.petnolja.semi.common.mybatis.Template.getSqlSession;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.petnolja.semi.admin.common.dto.AdminPictureDTO;
import com.petnolja.semi.admin.common.dto.RoomPostAndAdminPictureDTO;
import com.petnolja.semi.admin.common.dto.RoomPostDTO;
import com.petnolja.semi.admin.post.model.dao.AdminPostDAO;

public class InsertRoomPostService {

	private AdminPostDAO mapper;

	public int insertRoomPost(RoomPostDTO insertRoomPostDTO) {
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(AdminPostDAO.class);

		int result = mapper.inserRoomPost(insertRoomPostDTO);

		if (result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		sqlSession.close();
		return result;
	}

	public int insertThumbnail(RoomPostAndAdminPictureDTO thumbnail) {

		/* Connection 생성 */
		SqlSession sqlSession = getSqlSession();

		mapper = sqlSession.getMapper(AdminPostDAO.class);

		/* 최종적으로 반환할 result 선언 */
		int result = 0;

		/* 먼저 board 테이블부터 thumbnail 내용부터 insert 한다. */
		System.out.println("thumbnail 잘있니? " + thumbnail);
		int boardResult = mapper.insertThumbnailContent(thumbnail);
		System.out.println("boardResult 잘나왔니? " + boardResult);
		System.out.println("boardResult : " + thumbnail);

		/* Attachment 리스트를 불러온다. */
		List<AdminPictureDTO> fileList = thumbnail.getAdminPictureList();

		/* fileList에 boardNo값을 넣는다. */
		for (int i = 0; i < fileList.size(); i++) {
			fileList.get(i).setRoomPostNo(thumbnail.getRoomPostNo());
		}

		/* Attachment 테이블에 list size만큼 insert 한다. */
		int attachmentResult = 0;
		for (int i = 0; i < fileList.size(); i++) {
			System.out.println("fileList 잘있니? " + fileList);
			attachmentResult += mapper.insertAttachment(fileList.get(i));
			System.out.println("attachmentResult 잘나왔니? " + attachmentResult);
		}

		/* 모든 결과가 성공이면 트랜젝션을 완료한다. */
		if (boardResult > 0 && attachmentResult == fileList.size()) {
			sqlSession.commit();
			result = 1;
		} else {
			sqlSession.rollback();
		}

		/* Connection을 닫는다. */
		sqlSession.close();

		/* 수행 결과를 리턴한다. */
		return result;

	}

}
