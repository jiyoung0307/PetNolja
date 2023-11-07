package com.petnolja.semi.admin.employee.model.dao;

import java.util.List;

import com.petnolja.semi.member.common.dto.MemberDTO;

/* interface 이름이랑 xml 파일명 다르면 안됨!!@!@ 주의!!@!@ */
public interface MemberSelectDAO {

	List<MemberDTO> selectMember();

}