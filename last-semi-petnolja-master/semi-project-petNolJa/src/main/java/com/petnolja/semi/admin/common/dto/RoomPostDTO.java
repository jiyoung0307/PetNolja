package com.petnolja.semi.admin.common.dto;

import java.io.Serializable;
import java.sql.Date;

public class RoomPostDTO implements Serializable{
	private static final long serialVersionUID = 7141774594342003418L;
	
	private int roomPostNo;
	private String roomPostTitle;
	private String roomPostContents;
	private java.sql.Date roomPostDate;
	private String roomPostAble;
	private int empId;
	private AdminPictureDTO adminPicture;
	
	public RoomPostDTO() {
	}

	public RoomPostDTO(int roomPostNo, String roomPostTitle, String roomPostContents, Date roomPostDate,
			String roomPostAble, int empId, AdminPictureDTO adminPicture) {
		this.roomPostNo = roomPostNo;
		this.roomPostTitle = roomPostTitle;
		this.roomPostContents = roomPostContents;
		this.roomPostDate = roomPostDate;
		this.roomPostAble = roomPostAble;
		this.empId = empId;
		this.adminPicture = adminPicture;
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

	public java.sql.Date getRoomPostDate() {
		return roomPostDate;
	}

	public void setRoomPostDate(java.sql.Date roomPostDate) {
		this.roomPostDate = roomPostDate;
	}

	public String getRoomPostAble() {
		return roomPostAble;
	}

	public void setRoomPostAble(String roomPostAble) {
		this.roomPostAble = roomPostAble;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public AdminPictureDTO getAdminPicture() {
		return adminPicture;
	}

	public void setAdminPicture(AdminPictureDTO adminPicture) {
		this.adminPicture = adminPicture;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "RoomPostDTO [roomPostNo=" + roomPostNo + ", roomPostTitle=" + roomPostTitle + ", roomPostContents="
				+ roomPostContents + ", roomPostDate=" + roomPostDate + ", roomPostAble=" + roomPostAble + ", empId="
				+ empId + ", adminPicture=" + adminPicture + "]";
	}
	
}
