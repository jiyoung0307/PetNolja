package com.petnolja.semi.member.common.dto;

import java.io.Serializable;

public class ReservationPetDTO implements Serializable {
	private static final long serialVersionUID = -1563122458927853569L;
	
	private int petNo;
	private String petDoC;	// dog or cat
	private String petName;
	private int petAge;
	private int petWeight;
	private String petType;
	private String petSex;
	private String perioVaccinate;	// 정기접종
	private String rabiesVaccinate;	// 관견병 접종
	private String petNeuter;		// 중성화
	private String petCharacter;
	private String health;
	private String petEtc;
	private int memberNo;
	private int reservationNo;
	
	public ReservationPetDTO() {
	}

	public ReservationPetDTO(int petNo, String petDoC, String petName, int petAge, int petWeight, String petType,
			String petSex, String perioVaccinate, String rabiesVaccinate, String petNeuter, String petCharacter,
			String health, String petEtc, int memberNo, int reservationNo) {
		this.petNo = petNo;
		this.petDoC = petDoC;
		this.petName = petName;
		this.petAge = petAge;
		this.petWeight = petWeight;
		this.petType = petType;
		this.petSex = petSex;
		this.perioVaccinate = perioVaccinate;
		this.rabiesVaccinate = rabiesVaccinate;
		this.petNeuter = petNeuter;
		this.petCharacter = petCharacter;
		this.health = health;
		this.petEtc = petEtc;
		this.memberNo = memberNo;
		this.reservationNo = reservationNo;
	}

	public int getPetNo() {
		return petNo;
	}

	public void setPetNo(int petNo) {
		this.petNo = petNo;
	}

	public String getPetDoC() {
		return petDoC;
	}

	public void setPetDoC(String petDoC) {
		this.petDoC = petDoC;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public int getPetAge() {
		return petAge;
	}

	public void setPetAge(int petAge) {
		this.petAge = petAge;
	}

	public int getPetWeight() {
		return petWeight;
	}

	public void setPetWeight(int petWeight) {
		this.petWeight = petWeight;
	}

	public String getPetType() {
		return petType;
	}

	public void setPetType(String petType) {
		this.petType = petType;
	}

	public String getPetSex() {
		return petSex;
	}

	public void setPetSex(String petSex) {
		this.petSex = petSex;
	}

	public String getPerioVaccinate() {
		return perioVaccinate;
	}

	public void setPerioVaccinate(String perioVaccinate) {
		this.perioVaccinate = perioVaccinate;
	}

	public String getRabiesVaccinate() {
		return rabiesVaccinate;
	}

	public void setRabiesVaccinate(String rabiesVaccinate) {
		this.rabiesVaccinate = rabiesVaccinate;
	}

	public String getPetNeuter() {
		return petNeuter;
	}

	public void setPetNeuter(String petNeuter) {
		this.petNeuter = petNeuter;
	}

	public String getPetCharacter() {
		return petCharacter;
	}

	public void setPetCharacter(String petCharacter) {
		this.petCharacter = petCharacter;
	}

	public String getHealth() {
		return health;
	}

	public void setHealth(String health) {
		this.health = health;
	}

	public String getPetEtc() {
		return petEtc;
	}

	public void setPetEtc(String petEtc) {
		this.petEtc = petEtc;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public int getReservationNo() {
		return reservationNo;
	}

	public void setReservationNo(int reservationNo) {
		this.reservationNo = reservationNo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "ReservationPetDTO [petNo=" + petNo + ", petDoC=" + petDoC + ", petName=" + petName + ", petAge="
				+ petAge + ", petWeight=" + petWeight + ", petType=" + petType + ", petSex=" + petSex
				+ ", perioVaccinate=" + perioVaccinate + ", rabiesVaccinate=" + rabiesVaccinate + ", petNeuter="
				+ petNeuter + ", petCharacter=" + petCharacter + ", health=" + health + ", petEtc=" + petEtc
				+ ", memberNo=" + memberNo + ", reservationNo=" + reservationNo + "]";
	}
	
}
