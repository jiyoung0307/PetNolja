package com.petnolja.semi.member.common.dto;

import java.sql.Date;

public class UserPictureDTO {
	
	private int picNo;
	private int petNo;
	private int reviewNo;
	private String picName;
	private String modifyName;
	private String userPicSaveRoute;
	private java.sql.Date userPicSaveTime;
	public UserPictureDTO() {
		super();
	}
	public UserPictureDTO(int picNo, int petNo, int reviewNo, String picName, String modifyName,
			String userPicSaveRoute, Date userPicSaveTime) {
		super();
		this.picNo = picNo;
		this.petNo = petNo;
		this.reviewNo = reviewNo;
		this.picName = picName;
		this.modifyName = modifyName;
		this.userPicSaveRoute = userPicSaveRoute;
		this.userPicSaveTime = userPicSaveTime;
	}
	
	public int getPicNo() {
		return picNo;
	}
	public void setPicNo(int picNo) {
		this.picNo = picNo;
	}
	public int getPetNo() {
		return petNo;
	}
	public void setPetNo(int petNo) {
		this.petNo = petNo;
	}
	public int getReviewNo() {
		return reviewNo;
	}
	public void setReviewNo(int reviewNo) {
		this.reviewNo = reviewNo;
	}
	public String getPicName() {
		return picName;
	}
	public void setPicName(String picName) {
		this.picName = picName;
	}
	public String getModifyName() {
		return modifyName;
	}
	public void setModifyName(String modifyName) {
		this.modifyName = modifyName;
	}
	public String getUserPicSaveRoute() {
		return userPicSaveRoute;
	}
	public void setUserPicSaveRoute(String userPicSaveRoute) {
		this.userPicSaveRoute = userPicSaveRoute;
	}
	public java.sql.Date getUserPicSaveTime() {
		return userPicSaveTime;
	}
	public void setUserPicSaveTime(java.sql.Date userPicSaveTime) {
		this.userPicSaveTime = userPicSaveTime;
	}
	@Override
	public String toString() {
		return "UserPictureDTO [picNo=" + picNo + ", petNo=" + petNo + ", reviewNo=" + reviewNo + ", picName=" + picName
				+ ", modifyName=" + modifyName + ", userPicSaveRoute=" + userPicSaveRoute + ", userPicSaveTime="
				+ userPicSaveTime + "]";
	}

	
	
}
