package com.petnolja.semi.member.mypage.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.petnolja.semi.member.common.dto.MemberCouponDTO;
import com.petnolja.semi.member.common.dto.ReservationDTO;
import com.petnolja.semi.member.mypage.model.dao.MemberInfoSelectDAO;

import static com.petnolja.semi.common.mybatis.Template.getSqlSession;

public class MypageService {
	private MemberInfoSelectDAO memberInfoSelectDAO;
	public List<MemberCouponDTO> selectAllCouponList(int userNo) {
		SqlSession sqlSession = getSqlSession();
		memberInfoSelectDAO = sqlSession.getMapper(MemberInfoSelectDAO.class);
		
		List<MemberCouponDTO> couponList = memberInfoSelectDAO.selectAllCouponList(userNo);
		
		sqlSession.close();
		return couponList;
	}
	public List<ReservationDTO> selectUserReservationList(int userNo) {
		SqlSession sqlSession = getSqlSession();
		memberInfoSelectDAO = sqlSession.getMapper(MemberInfoSelectDAO.class);
		
		List<ReservationDTO> reservationList = memberInfoSelectDAO.selectUserReservationList(userNo);
		
		sqlSession.close();
		return reservationList;
	}

}
