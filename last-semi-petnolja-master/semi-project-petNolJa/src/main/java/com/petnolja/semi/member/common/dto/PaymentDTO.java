package com.petnolja.semi.member.common.dto;

import java.io.Serializable;
import java.sql.Date;

public class PaymentDTO implements Serializable{
	private static final long serialVersionUID = 1473746032388361856L;
	
	private int reservationNo;
	private java.sql.Date paymentDate;
	private int paymentPrice;
	private int paymentPointPrice;
	private int paymentCouponPrice;
	private int userNo;
	private CouponDTO coupon;
	
	public PaymentDTO() {
	}

	public PaymentDTO(int reservationNo, Date paymentDate, int paymentPrice, int paymentPointPrice,
			int paymentCouponPrice, int userNo, CouponDTO coupon) {
		this.reservationNo = reservationNo;
		this.paymentDate = paymentDate;
		this.paymentPrice = paymentPrice;
		this.paymentPointPrice = paymentPointPrice;
		this.paymentCouponPrice = paymentCouponPrice;
		this.userNo = userNo;
		this.coupon = coupon;
	}

	public int getReservationNo() {
		return reservationNo;
	}

	public void setReservationNo(int reservationNo) {
		this.reservationNo = reservationNo;
	}

	public java.sql.Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(java.sql.Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public int getPaymentPrice() {
		return paymentPrice;
	}

	public void setPaymentPrice(int paymentPrice) {
		this.paymentPrice = paymentPrice;
	}

	public int getPaymentPointPrice() {
		return paymentPointPrice;
	}

	public void setPaymentPointPrice(int paymentPointPrice) {
		this.paymentPointPrice = paymentPointPrice;
	}

	public int getPaymentCouponPrice() {
		return paymentCouponPrice;
	}

	public void setPaymentCouponPrice(int paymentCouponPrice) {
		this.paymentCouponPrice = paymentCouponPrice;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
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
		return "PaymentDTO [reservationNo=" + reservationNo + ", paymentDate=" + paymentDate + ", paymentPrice="
				+ paymentPrice + ", paymentPointPrice=" + paymentPointPrice + ", paymentCouponPrice="
				+ paymentCouponPrice + ", userNo=" + userNo + ", coupon=" + coupon + "]";
	}
	
}
