package com.petnolja.semi.member.post.model.dao;

import java.util.List;

import com.petnolja.semi.admin.common.dto.AdminPostDTO;
import com.petnolja.semi.member.common.dto.QuestionDTO;

public interface FaqSelectDAO {

	List<AdminPostDTO> selectFaq();

	AdminPostDTO faqDetail(String faqNo);
	
}
