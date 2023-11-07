package com.petnolja.semi.member.common.dto;

public class UpdateReviewTextDTO {

	private int reviewNo; 
	private int reviewRate;
	private String reviewContents;
	private String userPicName;
	public UpdateReviewTextDTO() {
		super();
	}
	public UpdateReviewTextDTO(int reviewNo, int reviewRate, String reviewContents, String userPicName) {
		super();
		this.reviewNo = reviewNo;
		this.reviewRate = reviewRate;
		this.reviewContents = reviewContents;
		this.userPicName = userPicName;
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
	public String getReviewContents() {
		return reviewContents;
	}
	public void setReviewContents(String reviewContents) {
		this.reviewContents = reviewContents;
	}
	public String getUserPicName() {
		return userPicName;
	}
	public void setUserPicName(String userPicName) {
		this.userPicName = userPicName;
	}
	@Override
	public String toString() {
		return "UpdateReviewTextDTO [reviewNo=" + reviewNo + ", reviewRate=" + reviewRate + ", reviewContents="
				+ reviewContents + ", userPicName=" + userPicName + "]";
	}	
	
	
}
