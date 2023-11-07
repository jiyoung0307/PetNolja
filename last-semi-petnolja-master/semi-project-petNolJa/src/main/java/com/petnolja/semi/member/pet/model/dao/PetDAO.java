package com.petnolja.semi.member.pet.model.dao;

import java.util.List;

import com.petnolja.semi.member.common.dto.PetDTO;

public interface PetDAO {

	List<PetDTO> petSelect(int memberNo);

	int petInsert(PetDTO petInsert);

}
