package com.petnolja.semi.member.mypage.model.service;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.petnolja.semi.member.mypage.model.dao.MyPageDAO;

import static com.petnolja.semi.common.mybatis.Template.getSqlSession;
public class UpdateMemberInfoService {

	private MyPageDAO mapper;
	
	public int updateMemberInfo(Map<String, String> updateMemberInfoMap) {
		SqlSession sqlSession = getSqlSession();
		
		mapper = sqlSession.getMapper(MyPageDAO.class);
		
		int result = mapper.updateMemberInfo(updateMemberInfoMap);
		
		if(result > 0) {
			sqlSession.commit();
		}else {
			sqlSession.rollback();
		}
		sqlSession.close();
		
		
		return result;
	}

}
