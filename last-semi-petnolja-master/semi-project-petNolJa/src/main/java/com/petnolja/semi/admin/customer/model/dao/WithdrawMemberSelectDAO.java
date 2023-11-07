package com.petnolja.semi.admin.customer.model.dao;

import java.util.List;

import com.petnolja.semi.admin.common.dto.WithdrawMemberDTO;

public interface WithdrawMemberSelectDAO {

	List<WithdrawMemberDTO> selectwithdrawMember();
}
