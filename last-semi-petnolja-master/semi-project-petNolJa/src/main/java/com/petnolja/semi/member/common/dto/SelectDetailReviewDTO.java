package com.petnolja.semi.member.common.dto;

import java.sql.Date;

public class SelectDetailReviewDTO {

	private int reviewNo;
	private int reviewRate;
	private String memberId;
	private String gradeName;
	private java.sql.Date reviewDate; 
	private java.sql.Date checkIn; 
	private java.sql.Date checkOut; 
	private String reviewContents;
	private String userPicSaveRoute;
	private String roomName; 
	private String empName;
	
	public SelectDetailReviewDTO() {
	}
	public SelectDetailReviewDTO(int reviewRate, int reviewNo, String memberId, String gradeName, Date reviewDate,
			Date checkIn, Date checkOut, String reviewContents, String userPicSaveRoute, String roomName,
			String empName) {
		this.reviewRate = reviewRate;
		this.reviewNo = reviewNo;
		this.memberId = memberId;
		this.gradeName = gradeName;
		this.reviewDate = reviewDate;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.reviewContents = reviewContents;
		this.userPicSaveRoute = userPicSaveRoute;
		this.roomName = roomName;
		this.empName = empName;
	}
	public int getReviewRate() {
		return reviewRate;
	}
	public void setReviewRate(int reviewRate) {
		this.reviewRate = reviewRate;
	}
	public int getReviewNo() {
		return reviewNo;
	}
	public void setReviewNo(int reviewNo) {
		this.reviewNo = reviewNo;
	}
	public String getmemberId() {
		return memberId;
	}
	public void setmemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getGradeName() {
		return gradeName;
	}
	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}
	public java.sql.Date getReviewDate() {
		return reviewDate;
	}
	public void setReviewDate(java.sql.Date reviewDate) {
		this.reviewDate = reviewDate;
	}
	public java.sql.Date getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(java.sql.Date checkIn) {
		this.checkIn = checkIn;
	}
	public java.sql.Date getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(java.sql.Date checkOut) {
		this.checkOut = checkOut;
	}
	public String getReviewContents() {
		return reviewContents;
	}
	public void setReviewContents(String reviewContents) {
		this.reviewContents = reviewContents;
	}
	public String getUserPicSaveRoute() {
		return userPicSaveRoute;
	}
	public void setUserPicSaveRoute(String userPicSaveRoute) {
		this.userPicSaveRoute = userPicSaveRoute;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "selectDetailReview [reviewRate=" + reviewRate + ", reviewNo=" + reviewNo + ", memberId=" + memberId
				+ ", gradeName=" + gradeName + ", reviewDate=" + reviewDate + ", checkIn=" + checkIn + ", checkOut="
				+ checkOut + ", reviewContents=" + reviewContents + ", userPicSaveRoute=" + userPicSaveRoute
				+ ", roomName=" + roomName + ", empName=" + empName + "]";
	}



}