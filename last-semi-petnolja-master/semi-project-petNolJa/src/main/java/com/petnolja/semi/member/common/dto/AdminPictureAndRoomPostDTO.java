package com.petnolja.semi.member.common.dto;

import java.sql.Date;

import com.petnolja.semi.admin.common.dto.RoomPostDTO;

public class AdminPictureAndRoomPostDTO {

	private int pictureNo;
	private String pictureName;
	private String pictureModifyName;
	private java.sql.Date pictureSaveTime;
	private String pictureSaveRoute;
	private RoomPostDTO roomPostDTO;
	public AdminPictureAndRoomPostDTO() {
		super();
	}
	public AdminPictureAndRoomPostDTO(int pictureNo, String pictureName, String pictureModifyName, Date pictureSaveTime,
			String pictureSaveRoute, RoomPostDTO roomPostDTO) {
		super();
		this.pictureNo = pictureNo;
		this.pictureName = pictureName;
		this.pictureModifyName = pictureModifyName;
		this.pictureSaveTime = pictureSaveTime;
		this.pictureSaveRoute = pictureSaveRoute;
		this.roomPostDTO = roomPostDTO;
	}
	public int getPictureNo() {
		return pictureNo;
	}
	public void setPictureNo(int pictureNo) {
		this.pictureNo = pictureNo;
	}
	public String getPictureName() {
		return pictureName;
	}
	public void setPictureName(String pictureName) {
		this.pictureName = pictureName;
	}
	public String getPictureModifyName() {
		return pictureModifyName;
	}
	public void setPictureModifyName(String pictureModifyName) {
		this.pictureModifyName = pictureModifyName;
	}
	public java.sql.Date getPictureSaveTime() {
		return pictureSaveTime;
	}
	public void setPictureSaveTime(java.sql.Date pictureSaveTime) {
		this.pictureSaveTime = pictureSaveTime;
	}
	public String getPictureSaveRoute() {
		return pictureSaveRoute;
	}
	public void setPictureSaveRoute(String pictureSaveRoute) {
		this.pictureSaveRoute = pictureSaveRoute;
	}
	public RoomPostDTO getRoomPostDTO() {
		return roomPostDTO;
	}
	public void setRoomPostDTO(RoomPostDTO roomPostDTO) {
		this.roomPostDTO = roomPostDTO;
	}
	@Override
	public String toString() {
		return "AdminPictureAndRoomPostDTO [pictureNo=" + pictureNo + ", pictureName=" + pictureName
				+ ", pictureModifyName=" + pictureModifyName + ", pictureSaveTime=" + pictureSaveTime
				+ ", pictureSaveRoute=" + pictureSaveRoute + ", roomPostDTO=" + roomPostDTO + "]";
	}
	
	
	
	
	
	
}
