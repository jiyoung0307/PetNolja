package com.petnolja.semi.member.post.model.dao;

import java.util.List;

import com.petnolja.semi.member.common.dto.QuestionDTO;

public interface QuestionDAO {

	public int questionInsert(QuestionDTO questionInsert);

	public int questionUpdate(QuestionDTO questionUpdate);

	public List<QuestionDTO> selectQuestion(int memberNo);

}
