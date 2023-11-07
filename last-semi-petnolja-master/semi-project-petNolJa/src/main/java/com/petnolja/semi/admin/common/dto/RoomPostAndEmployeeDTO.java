package com.petnolja.semi.admin.common.dto;

import java.sql.Date;

public class RoomPostAndEmployeeDTO {

	private int roomPostNo;
	private String roomPostTitle;
	private String roomPostContents;
	private java.sql.Date roomPostDate;
	private String roomPostAble;
	private int empId;
	private EmployeeDTO employeeDTO;
	public RoomPostAndEmployeeDTO() {
		super();
	}
	public RoomPostAndEmployeeDTO(int roomPostNo, String roomPostTitle, String roomPostContents, Date roomPostDate,
			String roomPostAble, int empId, EmployeeDTO employeeDTO) {
		super();
		this.roomPostNo = roomPostNo;
		this.roomPostTitle = roomPostTitle;
		this.roomPostContents = roomPostContents;
		this.roomPostDate = roomPostDate;
		this.roomPostAble = roomPostAble;
		this.empId = empId;
		this.employeeDTO = employeeDTO;
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
	public EmployeeDTO getEmployeeDTO() {
		return employeeDTO;
	}
	public void setEmployeeDTO(EmployeeDTO employeeDTO) {
		this.employeeDTO = employeeDTO;
	}
	@Override
	public String toString() {
		return "RoomPostAndEmployeeDTO [roomPostNo=" + roomPostNo + ", roomPostTitle=" + roomPostTitle
				+ ", roomPostContents=" + roomPostContents + ", roomPostDate=" + roomPostDate + ", roomPostAble="
				+ roomPostAble + ", empId=" + empId + ", employeeDTO=" + employeeDTO + "]";
	}
	
	
}
