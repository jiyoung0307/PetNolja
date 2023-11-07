package com.petnolja.semi.member.post.model.service;

import static com.petnolja.semi.common.mybatis.Template.getSqlSession;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.petnolja.semi.admin.common.dto.AdminPostDTO;
import com.petnolja.semi.member.post.model.dao.NoticeSelectDAO;

public class NoticeSelectService {
	private NoticeSelectDAO noticeSelectDAO;
	
	public List<AdminPostDTO> selectAllNotice() {
		SqlSession sqlSession = getSqlSession();
		noticeSelectDAO = sqlSession.getMapper(NoticeSelectDAO.class);
		
		List<AdminPostDTO> noticeList = noticeSelectDAO.selectAllNotice();
		
		
		sqlSession.close();
		
		return noticeList;
	}

}
