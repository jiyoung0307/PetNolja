package com.petnolja.semi.member.regist.model.service;

import static com.petnolja.semi.common.mybatis.Template.getSqlSession;

import org.apache.ibatis.session.SqlSession;

import com.petnolja.semi.member.common.dto.MemberDTO;
import com.petnolja.semi.member.regist.model.dao.MemberDAO;

public class FindIdService {

	private MemberDAO mapper;
	public MemberDTO findId(MemberDTO memberDTO) {
		
		SqlSession sqlSession = getSqlSession();
		
		mapper = sqlSession.getMapper(MemberDAO.class);
		MemberDTO memberInfo = mapper.findId(memberDTO);
		System.out.println("memberInfo" + memberInfo);
		sqlSession.close();
		
		return memberInfo;
	}

}
