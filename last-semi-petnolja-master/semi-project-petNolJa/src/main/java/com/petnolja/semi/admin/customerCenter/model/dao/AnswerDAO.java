package com.petnolja.semi.admin.customerCenter.model.dao;

import java.util.List;

import com.petnolja.semi.admin.common.dto.AnswerDTO;
import com.petnolja.semi.admin.common.dto.QuestionDTO;

public interface AnswerDAO {

	List<QuestionDTO> selectAllQuestion();

	int answerInsert(AnswerDTO answerInsert);

	int answerUpdate(AnswerDTO answerUpdate);

}
