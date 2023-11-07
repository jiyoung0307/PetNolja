package com.petnolja.semi.member.common.dto;

import java.io.Serializable;
import java.sql.Date;

public class SelectBestReviewDTO implements Serializable{
	private static final long serialVersionUID = 3986103968747662845L;
	
	private int reviewNo;
	private int reviewRate;
	private String reviewContents;
	private java.sql.Date reviewDate;
	private String userPicSaveRoute;
	private String memberId;
	public SelectBestReviewDTO() {
	}
	public SelectBestReviewDTO(int reviewNo, int reviewRate, String reviewContents, Date reviewDate,
			String userPicSaveRoute, String memberId) {
		this.reviewNo = reviewNo;
		this.reviewRate = reviewRate;
		this.reviewContents = reviewContents;
		this.reviewDate = reviewDate;
		this.userPicSaveRoute = userPicSaveRoute;
		this.memberId = memberId;
	}
	public int getreviewNo() {
		return reviewNo;
	}
	public void setreviewNo(int reviewNo) {
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
	public java.sql.Date getReviewDate() {
		return reviewDate;
	}
	public void setReviewDate(java.sql.Date reviewDate) {
		this.reviewDate = reviewDate;
	}
	public String getUserPicSaveRoute() {
		return userPicSaveRoute;
	}
	public void setUserPicSaveRoute(String userPicSaveRoute) {
		this.userPicSaveRoute = userPicSaveRoute;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "SelectBestReviewDTO [reviewNo=" + reviewNo + ", reviewRate=" + reviewRate + ", reviewContents="
				+ reviewContents + ", reviewDate=" + reviewDate + ", userPicSaveRoute=" + userPicSaveRoute
				+ ", memberId=" + memberId + "]";
	}
	
	
	
}
