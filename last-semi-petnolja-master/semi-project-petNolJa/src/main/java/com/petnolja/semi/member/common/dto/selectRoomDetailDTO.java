package com.petnolja.semi.member.common.dto;

public class selectRoomDetailDTO {

	private String pictureSaveRoute;
	private int roomPostNo;
	private String roomPostTitle;
	private String roomPostContents;
	public selectRoomDetailDTO() {
		super();
	}
	public selectRoomDetailDTO(String pictureSaveRoute, int roomPostNo, String roomPostTitle, String roomPostContents) {
		super();
		this.pictureSaveRoute = pictureSaveRoute;
		this.roomPostNo = roomPostNo;
		this.roomPostTitle = roomPostTitle;
		this.roomPostContents = roomPostContents;
	}
	public String getPictureSaveRoute() {
		return pictureSaveRoute;
	}
	public void setPictureSaveRoute(String pictureSaveRoute) {
		this.pictureSaveRoute = pictureSaveRoute;
	}
	public int getRoomPostNo() {
		return roomPostNo;
	}
	public void setRoomPostNo(int roomPostNo) {
		this.roomPostNo = roomPostNo;
	}
	public String getRoomPostTitle() {
		return roomPostTitle;
	}
	public void setRoomPostTitle(String roomPostTitle) {
		this.roomPostTitle = roomPostTitle;
	}
	public String getRoomPostContents() {
		return roomPostContents;
	}
	public void setRoomPostContents(String roomPostContents) {
		this.roomPostContents = roomPostContents;
	}
	@Override
	public String toString() {
		return "selectRoomDetailDTO [pictureSaveRoute=" + pictureSaveRoute + ", roomPostNo=" + roomPostNo
				+ ", roomPostTitle=" + roomPostTitle + ", roomPostContents=" + roomPostContents + "]";
	}

	
}
