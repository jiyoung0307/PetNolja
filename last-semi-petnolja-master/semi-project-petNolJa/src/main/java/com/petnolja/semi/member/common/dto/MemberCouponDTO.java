package com.petnolja.semi.member.common.dto;

import java.io.Serializable;

public class MemberCouponDTO implements Serializable {
	private static final long serialVersionUID = -8167692956149882671L;
	
	private int couponNo;
	private int memberNo;
	private String memberCouponUsed;
	private CouponDTO coupon;
	
	public MemberCouponDTO() {
	}
	
	public MemberCouponDTO(int couponNo, int memberNo, String memberCouponUsed, CouponDTO coupon) {
		this.couponNo = couponNo;
		this.memberNo = memberNo;
		this.memberCouponUsed = memberCouponUsed;
		this.coupon = coupon;
	}

	public int getCouponNo() {
		return couponNo;
	}

	public void setCouponNo(int couponNo) {
		this.couponNo = couponNo;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getMemberCouponUsed() {
		return memberCouponUsed;
	}

	public void setMemberCouponUsed(String memberCouponUsed) {
		this.memberCouponUsed = memberCouponUsed;
	}

	public CouponDTO getCoupon() {
		return coupon;
	}

	public void setCoupon(CouponDTO coupon) {
		this.coupon = coupon;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "MemberCouponDTO [couponNo=" + couponNo + ", memberNo=" + memberNo + ", memberCouponUsed="
				+ memberCouponUsed + ", coupon=" + coupon + "]";
	}
	
}
