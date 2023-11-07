package com.petnolja.semi.admin.customerCenter.model.service;

import org.apache.ibatis.session.SqlSession;

import com.petnolja.semi.admin.common.dto.AnswerDTO;
import com.petnolja.semi.admin.common.dto.QuestionDTO;
import com.petnolja.semi.admin.customerCenter.model.dao.AnswerDAO;

import static com.petnolja.semi.common.mybatis.Template.getSqlSession;

import java.util.List;

public class AnswerService {
	private AnswerDAO answerDAO;
	
	public List<QuestionDTO> selectAllQuestion() {
		SqlSession sqlSession = getSqlSession();
		answerDAO = sqlSession.getMapper(AnswerDAO.class);
		
		List<QuestionDTO> questionList = answerDAO.selectAllQuestion();
		
		sqlSession.close();
		
		return questionList;
	}

	public int answerInsert(AnswerDTO answerInsert) {
		
		SqlSession sqlSession = getSqlSession();
		
		answerDAO = sqlSession.getMapper(AnswerDAO.class);
		
		int result = answerDAO.answerInsert(answerInsert);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		return result;
	}

	public int answerUpdate(AnswerDTO answerUpdate) {
		SqlSession sqlSession = getSqlSession();
		
		answerDAO = sqlSession.getMapper(AnswerDAO.class);
//		System.out.println("AnswerDTO 보유 값" + answerUpdate);
		
		int result = answerDAO.answerUpdate(answerUpdate);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		sqlSession.close();
		
		return result;
	}
}
