package com.petnolja.semi.member.regist.model.service;

import com.petnolja.semi.member.regist.model.dao.MemberDAO;
import com.petnolja.semi.member.common.dto.MemberDTO;
import com.petnolja.semi.member.mypage.model.dao.MyPageDAO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static com.petnolja.semi.common.mybatis.Template.getSqlSession;

import java.util.Map;

public class MemberService {
	private MemberDAO memberDAO;

	public int registMember(MemberDTO registMember) {
		
		/* JDBC에서 한 것 처럼 Connection 대신 Session 열고 닫기! */
		SqlSession sqlSession = getSqlSession();
		
		memberDAO = sqlSession.getMapper(MemberDAO.class);
		
		int result = memberDAO.registMember(registMember);
		
		/* DML(INSERT, UPDATE, DELETE)의 경우 반환 값을 기준으로 트랜젝션(commit/rollback) 처리 꼭 해주기!  */
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		sqlSession.close();
		
		return result;
	}

	public int selectRegistCheck(Map<String, String> memberCheck) {
		SqlSession sqlSession = getSqlSession();
		
		memberDAO = sqlSession.getMapper(MemberDAO.class);
		
		int result = memberDAO.selectRegistCheck(memberCheck);
		
		sqlSession.close();
		
		return result;
	}

	public MemberDTO memberLogInCheck(Map<String, String> logIn) {
		SqlSession sqlSession = getSqlSession();
		memberDAO = sqlSession.getMapper(MemberDAO.class);
		MemberDTO loginMember = null;
		
		String encPwd = memberDAO.selectEncryptedPwd(logIn);
		
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		
		if(passwordEncoder.matches(logIn.get("pwd"), encPwd)) {
			loginMember = memberDAO.selectLogInMember(logIn);
		}
		
		sqlSession.close();
		
		return loginMember;
	}

	public int insertWithdrawMember(MemberDTO memberLogin) {
		SqlSession sqlSession = getSqlSession();
		memberDAO = sqlSession.getMapper(MemberDAO.class);
			
		int result = memberDAO.insertWithdrawMember(memberLogin); 
		
		if(result > 0) {
			sqlSession.commit();
		}else {
			sqlSession.rollback();
		}
		sqlSession.close();
		
		return result;
	}

}
