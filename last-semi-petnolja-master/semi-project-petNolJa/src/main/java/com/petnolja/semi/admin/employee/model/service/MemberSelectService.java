package com.petnolja.semi.admin.employee.model.service;

import static com.petnolja.semi.common.mybatis.Template.getSqlSession;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.petnolja.semi.admin.employee.model.dao.MemberSelectDAO;
import com.petnolja.semi.member.common.dto.MemberDTO;

public class MemberSelectService {
	private MemberSelectDAO memberSelectDAO;
	
	public List<MemberDTO> selectMember() {
		SqlSession sqlSession = getSqlSession();
		
		memberSelectDAO = sqlSession.getMapper(MemberSelectDAO.class);
		
		List<MemberDTO> memList = memberSelectDAO.selectMember();
		
		sqlSession.close();
		
		return memList;
	}
}
