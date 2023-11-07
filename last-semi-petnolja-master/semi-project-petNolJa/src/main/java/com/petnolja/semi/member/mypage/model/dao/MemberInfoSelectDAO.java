package com.petnolja.semi.member.mypage.model.dao;

import java.util.List;

import com.petnolja.semi.member.common.dto.MemberCouponDTO;
import com.petnolja.semi.member.common.dto.MemberDTO;
import com.petnolja.semi.member.common.dto.ReservationDTO;

public interface MemberInfoSelectDAO {

	List<MemberDTO> selectInfoMember();

	List<MemberCouponDTO> selectAllCouponList(int userNo);

	List<ReservationDTO> selectUserReservationList(int userNo);


}
