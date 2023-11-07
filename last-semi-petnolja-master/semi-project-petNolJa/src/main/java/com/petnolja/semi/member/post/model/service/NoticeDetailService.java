package com.petnolja.semi.member.post.model.service;

import com.petnolja.semi.member.post.model.dao.NoticeSelectDAO;
import static com.petnolja.semi.common.mybatis.Template.getSqlSession;

import org.apache.ibatis.session.SqlSession;

import com.petnolja.semi.admin.common.dto.AdminPostDTO;
public class NoticeDetailService {
private NoticeSelectDAO mapper;

public AdminPostDTO noticeDetail(String noticeNo) {
	SqlSession sqlSession = getSqlSession();
	
	mapper = sqlSession.getMapper(NoticeSelectDAO.class);
	AdminPostDTO noticeDTO = mapper.noticeDetail(noticeNo);
	
	return noticeDTO;
}

}
