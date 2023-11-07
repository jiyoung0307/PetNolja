package com.petnolja.semi.member.reservation.model.service;

import static com.petnolja.semi.common.mybatis.Template.getSqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.petnolja.semi.common.paging.SelectCriteria;
import com.petnolja.semi.member.common.dto.MemberCouponDTO;
import com.petnolja.semi.member.common.dto.PaymentDTO;
import com.petnolja.semi.member.common.dto.PetDTO;
import com.petnolja.semi.member.common.dto.PetsitterReservationDTO;
import com.petnolja.semi.member.common.dto.ReservationDTO;
import com.petnolja.semi.member.common.dto.ReservationPetDTO;
import com.petnolja.semi.member.common.dto.RoomDTO;
import com.petnolja.semi.member.reservation.model.dao.ReservationDAO;

public class ReservationService {
	private ReservationDAO reservationDAO;
	
	public List<RoomDTO> selectAllRoomPost() {
		SqlSession sqlSession = getSqlSession();
		reservationDAO = sqlSession.getMapper(ReservationDAO.class);
		
		List<RoomDTO> roomList = reservationDAO.selectAllRoomPost();
		
		sqlSession.close();
		return roomList;
	}

	public RoomDTO selectRoomReservationInfo(int roomNo) {
		SqlSession sqlSession = getSqlSession();
		reservationDAO = sqlSession.getMapper(ReservationDAO.class);
		
		RoomDTO roomInfo = reservationDAO.selectRoomReservationInfo(roomNo);
		
		sqlSession.close();
		return roomInfo;
	}
	
	/* 예약 가능한 펫시터의 수 */
	public int selectTotalCount(String checkIn) {
		SqlSession sqlSession = getSqlSession();
		reservationDAO = sqlSession.getMapper(ReservationDAO.class);
		
		int totalCount = reservationDAO.selectTotalCount(checkIn);
		
		sqlSession.close();
		
		return totalCount;
	}
	
	/* 전체 펫시터 목록 */
	public List<PetsitterReservationDTO> selectPetsitterList(SelectCriteria selectCriteria, String checkIn) {
		SqlSession sqlSession = getSqlSession();
		reservationDAO = sqlSession.getMapper(ReservationDAO.class);
		
		Map<String, String> condition = new HashMap<String, String>();
		condition.put("startRow", String.valueOf(selectCriteria.getStartRow()));
		condition.put("endRow", String.valueOf(selectCriteria.getEndRow()));
		condition.put("checkIn", checkIn);
		
		List<PetsitterReservationDTO> petsitterList = reservationDAO.selectPetsitterListReservation(condition);
		
		sqlSession.close();
		return petsitterList;
	}
	
	public List<PetDTO> selectPetList(int userNo) {
		SqlSession sqlSession = getSqlSession();
		reservationDAO = sqlSession.getMapper(ReservationDAO.class);
		
		List<PetDTO> petList = reservationDAO.selectPetList(userNo);
		
		sqlSession.close();
		return petList;
	}

	public List<MemberCouponDTO> selectAllMemberCoupon(int userNo) {
		SqlSession sqlSession = getSqlSession();
		reservationDAO = sqlSession.getMapper(ReservationDAO.class);
		
		List<MemberCouponDTO> couponList = reservationDAO.selectAllMemberCoupon(userNo);
		
		sqlSession.close();
		return couponList;
	}

	public PetsitterReservationDTO selectPetsitterInfo(int petsitterNo) {
		SqlSession sqlSession = getSqlSession();
		reservationDAO = sqlSession.getMapper(ReservationDAO.class);
		
		PetsitterReservationDTO petsitterInfo = reservationDAO.selectPetsitterInfo(petsitterNo);
		
		sqlSession.close();
		return petsitterInfo;
	}

	public int insertReservationAll(ReservationDTO reservationInfo) {
		int result = 0;
		SqlSession sqlSession = getSqlSession();
		reservationDAO = sqlSession.getMapper(ReservationDAO.class);
		
		
		Map<String, String> log = new HashMap<String, String>();
		log.put("roomNo", String.valueOf(reservationInfo.getRoom().getRoomNo()));
		log.put("checkIn", String.valueOf(reservationInfo.getReservationCheckIn()));
		log.put("checkOut", String.valueOf(reservationInfo.getReservationCheckOut()));
		log.put("empNo", String.valueOf(reservationInfo.getPetsitter().getEmpId()));
		int reservationResult = reservationDAO.insertReservation(reservationInfo);
		int roomLogResultIn = 0;
		int petsitterResultIn = 0;
		int dateMin = reservationDAO.selectDateMinus(log);
//		if(dateMin > 0) {
//			for(int i = 0; i < dateMin; i++) {
//				log.put("plusDate", String.valueOf(i));
//				roomLogResultIn = reservationDAO.insertReservationRoomIn(log);
//				petsitterResultIn = reservationDAO.insertReservationPetsitterIn(log);
//			}
//		} else {
			roomLogResultIn = reservationDAO.insertReservationRoomIn(log);
			petsitterResultIn = reservationDAO.insertReservationPetsitterIn(log);
//		}
		int roomLogResultOut = reservationDAO.insertReservationRoomOut(log);
		int petsitterResultOut = reservationDAO.insertReservationPetsitterOut(log);
		
		System.out.println("reservationResult" + reservationResult);
		System.out.println("roomLogResultIn" + roomLogResultIn);
		System.out.println("petsitterResultIn" + petsitterResultIn);
		System.out.println("roomLogResultOut" + roomLogResultOut);
		System.out.println("petsitterResultOut" + petsitterResultOut);
		
		if(reservationResult > 0) {
			sqlSession.commit();
			result = 1;
		} else {
			sqlSession.rollback();
		}
		sqlSession.close();
		
		return result;
	}

	public int updateCouponUsed(int userNo, int useCouponNo) {
		SqlSession sqlSession = getSqlSession();
		reservationDAO = sqlSession.getMapper(ReservationDAO.class);
		
		Map<String, Integer> resource = new HashMap<String, Integer>();
		resource.put("userNo", userNo);
		resource.put("useCouponNo", useCouponNo);
		
		int result = reservationDAO.updateCouponUsed(resource);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		sqlSession.close();
		return result;
	}

	public int insertReservationPet(ReservationPetDTO pet) {
		SqlSession sqlSession = getSqlSession();
		reservationDAO = sqlSession.getMapper(ReservationDAO.class);
		int reservationNo = reservationDAO.selectReservationNo();
		pet.setReservationNo(reservationNo);
		System.out.println("reservationNo" + reservationNo);
		int result = reservationDAO.insertReservationPet(pet);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		sqlSession.close();
		return result;
	}

	public int insertPointLog(int userNo, int usePoint) {
		SqlSession sqlSession = getSqlSession();
		reservationDAO = sqlSession.getMapper(ReservationDAO.class);
		
		Map<String, Integer> resource = new HashMap<String, Integer>();
		resource.put("userNo", userNo);
		resource.put("usePoint", usePoint);
		
		int result = 0;
		int pointLogResult = reservationDAO.insertPointLog(resource);
		int pointResult = reservationDAO.updatePointMember(resource);
		
		if(pointLogResult > 0 && pointResult > 0) {
			sqlSession.commit();
			result = 1;
		} else {
			sqlSession.rollback();
		}
		sqlSession.close();
		return result;
	}

	public int selectUseCouponPrice(int useCouponNo) {
		SqlSession sqlSession = getSqlSession();
		reservationDAO = sqlSession.getMapper(ReservationDAO.class);
		
		int couponPrice = reservationDAO.selectUseCouponPrice(useCouponNo);
		
		sqlSession.close();
		return couponPrice;
	}

	public int insertPayment(PaymentDTO payment) {
		SqlSession sqlSession = getSqlSession();
		reservationDAO = sqlSession.getMapper(ReservationDAO.class);
		
		int reservationNo = reservationDAO.selectReservationNo();
		payment.setReservationNo(reservationNo);
		System.out.println("reservationNo" + reservationNo);
		int paymentResult = reservationDAO.insertPayment(payment);
		
		if(paymentResult > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		sqlSession.close();
		return paymentResult;
	}


}
