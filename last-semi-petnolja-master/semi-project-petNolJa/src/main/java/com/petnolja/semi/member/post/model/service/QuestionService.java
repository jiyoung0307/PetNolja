package com.petnolja.semi.member.post.model.service;

import org.apache.ibatis.session.SqlSession;

import com.petnolja.semi.member.common.dto.QuestionDTO;
import com.petnolja.semi.member.post.model.dao.QuestionDAO;

import static com.petnolja.semi.common.mybatis.Template.getSqlSession;

import java.util.List;

public class QuestionService {
	private QuestionDAO questionDAO;
	
	public int questionInsert(QuestionDTO questionInsert) {
		
		SqlSession sqlSession = getSqlSession();
		
		questionDAO = sqlSession.getMapper(QuestionDAO.class);
		
		int result = questionDAO.questionInsert(questionInsert);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		sqlSession.close();
		
		return result;
	}
	
	public int questionUpdate(QuestionDTO questionUpdate) {
		
		SqlSession sqlSession = getSqlSession();
		
		questionDAO = sqlSession.getMapper(QuestionDAO.class);
		
		int result = questionDAO.questionUpdate(questionUpdate);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		sqlSession.close();
		
		return result;
	}

	public List<QuestionDTO> selectQuestion(int memberNo) {
		SqlSession sqlSession = getSqlSession();
		
		questionDAO = sqlSession.getMapper(QuestionDAO.class);
		
		List<QuestionDTO> questionSelectList = questionDAO.selectQuestion(memberNo);
		
		sqlSession.close();
		
		return questionSelectList;
	}

}
