package com.petnolja.semi.member.common.dto;

import java.io.Serializable;

public class PetDTO implements Serializable{

	private static final long serialVersionUID = -1352342925581201179L;
	
	private int petNo;
	private String petKind;
	private String petNumber;
	private String petName;
	private int petAge;
	private int petWeight;
	private String petType;
	private String petSex;
	private String perioVaccinate;
	private String rabiesVaccinate;
	private String petNeuter;
	private String petCharacter;
	private String petHealth;
	private String petEtc;
	private int memberNo;
	
	public PetDTO() {
	}

	public PetDTO(int petNo, String petKind, String petNumber, String petName, int petAge, int petWeight,
			String petType, String petSex, String perioVaccinate, String rabiesVaccinate, String petNeuter,
			String petCharacter, String petHealth, String petEtc, int memberNo) {
		super();
		this.petNo = petNo;
		this.petKind = petKind;
		this.petNumber = petNumber;
		this.petName = petName;
		this.petAge = petAge;
		this.petWeight = petWeight;
		this.petType = petType;
		this.petSex = petSex;
		this.perioVaccinate = perioVaccinate;
		this.rabiesVaccinate = rabiesVaccinate;
		this.petNeuter = petNeuter;
		this.petCharacter = petCharacter;
		this.petHealth = petHealth;
		this.petEtc = petEtc;
		this.memberNo = memberNo;
	}

	public int getPetNo() {
		return petNo;
	}

	public void setPetNo(int petNo) {
		this.petNo = petNo;
	}

	public String getPetKind() {
		return petKind;
	}

	public void setPetKind(String petKind) {
		this.petKind = petKind;
	}

	public String getPetNumber() {
		return petNumber;
	}

	public void setPetNumber(String petNumber) {
		this.petNumber = petNumber;
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

	public String getPetHealth() {
		return petHealth;
	}

	public void setPetHealth(String petHealth) {
		this.petHealth = petHealth;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "PetDTO [petNo=" + petNo + ", petKind=" + petKind + ", petNumber=" + petNumber + ", petName=" + petName
				+ ", petAge=" + petAge + ", petWeight=" + petWeight + ", petType=" + petType + ", petSex=" + petSex
				+ ", perioVaccinate=" + perioVaccinate + ", rabiesVaccinate=" + rabiesVaccinate + ", petNeuter="
				+ petNeuter + ", petCharacter=" + petCharacter + ", petHealth=" + petHealth + ", petEtc=" + petEtc
				+ ", memberNo=" + memberNo + "]";
	}
	
	
	
}	
	