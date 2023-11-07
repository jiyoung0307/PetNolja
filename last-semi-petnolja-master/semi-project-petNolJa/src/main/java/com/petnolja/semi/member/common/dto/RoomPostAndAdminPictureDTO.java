package com.petnolja.semi.member.common.dto;

import java.sql.Date;
import java.util.List;

public class RoomPostAndAdminPictureDTO {
	private int roomPostNo;
	private String roomPostTitle;
	private String roomPostContents;
	private java.sql.Date roomPostDate;
	private String roomPostAble;
	private int empId;
	private List<AdminPictureDTO> adminPictureDTO;
	public RoomPostAndAdminPictureDTO() {
		super();
	}
	public RoomPostAndAdminPictureDTO(int roomPostNo, String roomPostTitle, String roomPostContents, Date roomPostDate,
			String roomPostAble, int empId, List<AdminPictureDTO> adminPictureDTO) {
		super();
		this.roomPostNo = roomPostNo;
		this.roomPostTitle = roomPostTitle;
		this.roomPostContents = roomPostContents;
		this.roomPostDate = roomPostDate;
		this.roomPostAble = roomPostAble;
		this.empId = empId;
		this.adminPictureDTO = adminPictureDTO;
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
	public List<AdminPictureDTO> getAdminPictureDTO() {
		return adminPictureDTO;
	}
	public void setAdminPictureDTO(List<AdminPictureDTO> adminPictureDTO) {
		this.adminPictureDTO = adminPictureDTO;
	}
	@Override
	public String toString() {
		return "RoomPostAndAdminPictureDTO [roomPostNo=" + roomPostNo + ", roomPostTitle=" + roomPostTitle
				+ ", roomPostContents=" + roomPostContents + ", roomPostDate=" + roomPostDate + ", roomPostAble="
				+ roomPostAble + ", empId=" + empId + ", adminPictureDTO=" + adminPictureDTO + "]";
	}
	
	

	
	
}
