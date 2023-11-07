package com.petnolja.semi.admin.customer.model.dao;

import java.util.List;

import com.petnolja.semi.admin.common.dto.DormanMemberDTO;

public interface DormanSelectDAO {

	public List<DormanMemberDTO> selectDorman();
	
}
