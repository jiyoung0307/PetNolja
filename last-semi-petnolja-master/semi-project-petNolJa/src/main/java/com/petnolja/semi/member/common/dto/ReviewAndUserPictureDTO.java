package com.petnolja.semi.member.common.dto;

import java.sql.Date;
import java.util.List;

public class ReviewAndUserPictureDTO {
	private int reviewNo;
	private int reviewRate;
	private String memberId;
	private String gradeName;
	private java.sql.Date reviewDate;
	private java.sql.Date checkIn;
	private java.sql.Date checkOut;
	private String reviewContents;
	private String roomName;
	private String empName;
	private List<UserPictureDTO> userPictureList;
	public ReviewAndUserPictureDTO() {
		super();
	}
	public ReviewAndUserPictureDTO(int reviewNo, int reviewRate, String memberId, String gradeName, Date reviewDate,
			Date checkIn, Date checkOut, String reviewContents, String roomName, String empName,
			List<UserPictureDTO> userPictureList) {
		super();
		this.reviewNo = reviewNo;
		this.reviewRate = reviewRate;
		this.memberId = memberId;
		this.gradeName = gradeName;
		this.reviewDate = reviewDate;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.reviewContents = reviewContents;
		this.roomName = roomName;
		this.empName = empName;
		this.userPictureList = userPictureList;
	}
	public int getReviewNo() {
		return reviewNo;
	}
	public void setReviewNo(int reviewNo) {
		this.reviewNo = reviewNo;
	}
	public int getReviewRate() {
		return reviewRate;
	}
	public void setReviewRate(int reviewRate) {
		this.reviewRate = reviewRate;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
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
	public List<UserPictureDTO> getUserPictureList() {
		return userPictureList;
	}
	public void setUserPictureList(List<UserPictureDTO> userPictureList) {
		this.userPictureList = userPictureList;
	}
	@Override
	public String toString() {
		return "ReviewAndUserPictureDTO [reviewNo=" + reviewNo + ", reviewRate=" + reviewRate + ", memberId=" + memberId
				+ ", gradeName=" + gradeName + ", reviewDate=" + reviewDate + ", checkIn=" + checkIn + ", checkOut="
				+ checkOut + ", reviewContents=" + reviewContents + ", roomName=" + roomName + ", empName=" + empName
				+ ", userPictureList=" + userPictureList + "]";
	}
	
	
}

