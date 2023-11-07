package com.petnolja.semi.member.reservation.model.dao;

import java.util.List;
import java.util.Map;

import com.petnolja.semi.member.common.dto.MemberCouponDTO;
import com.petnolja.semi.member.common.dto.PaymentDTO;
import com.petnolja.semi.member.common.dto.PetDTO;
import com.petnolja.semi.member.common.dto.PetsitterReservationDTO;
import com.petnolja.semi.member.common.dto.ReservationDTO;
import com.petnolja.semi.member.common.dto.ReservationPetDTO;
import com.petnolja.semi.member.common.dto.RoomDTO;

public interface ReservationDAO {

	List<RoomDTO> selectAllRoomPost();
	
	RoomDTO selectRoomReservationInfo(int roomNo);

	int selectTotalCount(String checkIn);

	List<PetsitterReservationDTO> selectPetsitterListReservation(Map<String, String> condition);
	
	List<PetDTO> selectPetList(int userNo);

	List<MemberCouponDTO> selectAllMemberCoupon(int userNo);

	PetsitterReservationDTO selectPetsitterInfo(int petsitterNo);

	int insertReservationRoomIn(Map<String, String> log);

	int insertReservationRoomOut(Map<String, String> log);

	int insertReservationPetsitterIn(Map<String, String> log);

	int insertReservationPetsitterOut(Map<String, String> log);

	int selectDateMinus(Map<String, String> log);

	int insertReservation(ReservationDTO reservationInfo);

	int updateCouponUsed(Map<String, Integer> resource);

	int insertReservationPet(ReservationPetDTO pet);

	int insertPointLog(Map<String, Integer> resource);

	int updatePointMember(Map<String, Integer> resource);

	int selectUseCouponPrice(int useCouponNo);

	int selectReservationNo();

	int insertPayment(PaymentDTO payment);

}
