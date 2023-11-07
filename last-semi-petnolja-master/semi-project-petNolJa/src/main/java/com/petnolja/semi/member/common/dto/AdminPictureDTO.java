package com.petnolja.semi.member.common.dto;

import com.petnolja.semi.admin.common.dto.RoomPostDTO;

public class AdminPictureDTO {
	
	
	private int pictureNo;
	private String pictureName;
	private String pictureModifyName;
	private String pictureSaveTime;
	private String pictureSaveRoute;
	
	public AdminPictureDTO() {
		super();
	}
	public AdminPictureDTO(int pictureNo, String pictureName, String pictureModifyName, String pictureSaveTime,
			String pictureSaveRoute) {
		super();
		this.pictureNo = pictureNo;
		this.pictureName = pictureName;
		this.pictureModifyName = pictureModifyName;
		this.pictureSaveTime = pictureSaveTime;
		this.pictureSaveRoute = pictureSaveRoute;
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
	public String getPictureSaveTime() {
		return pictureSaveTime;
	}
	public void setPictureSaveTime(String pictureSaveTime) {
		this.pictureSaveTime = pictureSaveTime;
	}
	public String getPictureSaveRoute() {
		return pictureSaveRoute;
	}
	public void setPictureSaveRoute(String pictureSaveRoute) {
		this.pictureSaveRoute = pictureSaveRoute;
	}
	@Override
	public String toString() {
		return "AdminPictureDTO [pictureNo=" + pictureNo + ", pictureName=" + pictureName + ", pictureModifyName="
				+ pictureModifyName + ", pictureSaveTime=" + pictureSaveTime + ", pictureSaveRoute=" + pictureSaveRoute
				+ "]";
	}
	
	
  
}
