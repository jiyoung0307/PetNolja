package com.petnolja.semi.admin.common.dto;

import java.io.Serializable;

public class SalesDTO implements Serializable{

	private static final long serialVersionUID = 5443294346622669203L;
	
	private int reservationNo;
	private java.sql.Date paymentDate;
	private int paymentPrice;
	private int roomNo;
	
	public SalesDTO() {
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

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "SalesDTO [reservationNo=" + reservationNo + ", paymentDate=" + paymentDate + ", paymentPrice="
				+ paymentPrice + ", roomNo=" + roomNo + "]";
	}
	
}
