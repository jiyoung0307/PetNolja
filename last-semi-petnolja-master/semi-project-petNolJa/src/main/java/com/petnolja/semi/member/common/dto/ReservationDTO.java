package com.petnolja.semi.member.common.dto;

import java.io.Serializable;
import java.sql.Date;

public class ReservationDTO implements Serializable {
	private static final long serialVersionUID = 2019936165486863341L;
	
	private int reservationNo;
	private java.sql.Date reservationCheckIn;
	private java.sql.Date reservationCheckOut;
	private int reservationPrice;
	private int reservationAmount;
	private int userNo;
	private PetsitterReservationDTO petsitter;
	private RoomDTO room;
	private PetDTO pet;
	
	public ReservationDTO() {
	}

	public ReservationDTO(int reservationNo, Date reservationCheckIn, Date reservationCheckOut, int reservationPrice,
			int reservationAmount, int userNo, PetsitterReservationDTO petsitter, RoomDTO room, PetDTO pet) {
		this.reservationNo = reservationNo;
		this.reservationCheckIn = reservationCheckIn;
		this.reservationCheckOut = reservationCheckOut;
		this.reservationPrice = reservationPrice;
		this.reservationAmount = reservationAmount;
		this.userNo = userNo;
		this.petsitter = petsitter;
		this.room = room;
		this.pet = pet;
	}

	public int getReservationNo() {
		return reservationNo;
	}

	public void setReservationNo(int reservationNo) {
		this.reservationNo = reservationNo;
	}

	public java.sql.Date getReservationCheckIn() {
		return reservationCheckIn;
	}

	public void setReservationCheckIn(java.sql.Date reservationCheckIn) {
		this.reservationCheckIn = reservationCheckIn;
	}

	public java.sql.Date getReservationCheckOut() {
		return reservationCheckOut;
	}

	public void setReservationCheckOut(java.sql.Date reservationCheckOut) {
		this.reservationCheckOut = reservationCheckOut;
	}

	public int getReservationPrice() {
		return reservationPrice;
	}

	public void setReservationPrice(int reservationPrice) {
		this.reservationPrice = reservationPrice;
	}

	public int getReservationAmount() {
		return reservationAmount;
	}

	public void setReservationAmount(int reservationAmount) {
		this.reservationAmount = reservationAmount;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public PetsitterReservationDTO getPetsitter() {
		return petsitter;
	}

	public void setPetsitter(PetsitterReservationDTO petsitter) {
		this.petsitter = petsitter;
	}

	public RoomDTO getRoom() {
		return room;
	}

	public void setRoom(RoomDTO room) {
		this.room = room;
	}

	public PetDTO getPet() {
		return pet;
	}

	public void setPet(PetDTO pet) {
		this.pet = pet;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "ReservationDTO [reservationNo=" + reservationNo + ", reservationCheckIn=" + reservationCheckIn
				+ ", reservationCheckOut=" + reservationCheckOut + ", reservationPrice=" + reservationPrice
				+ ", reservationAmount=" + reservationAmount + ", userNo=" + userNo + ", petsitter=" + petsitter
				+ ", room=" + room + ", pet=" + pet + "]";
	}
	
}
