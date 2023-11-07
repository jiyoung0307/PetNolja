package com.petnolja.semi.member.mypage.model.service;

import static com.petnolja.semi.common.mybatis.Template.getSqlSession;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.petnolja.semi.member.common.dto.MemberDTO;
import com.petnolja.semi.member.mypage.model.dao.MemberInfoSelectDAO;

public class MemberInfoSelectService {
	private MemberInfoSelectDAO memberInfoSelectDAO;
	
	public List<MemberDTO> selectInfoMember(){
		SqlSession sqlSession = getSqlSession();
		
		memberInfoSelectDAO = sqlSession.getMapper(MemberInfoSelectDAO.class);
		
		List<MemberDTO> infoMemberList = memberInfoSelectDAO.selectInfoMember();
		
		sqlSession.close();		
		
		return infoMemberList;
	}
}
