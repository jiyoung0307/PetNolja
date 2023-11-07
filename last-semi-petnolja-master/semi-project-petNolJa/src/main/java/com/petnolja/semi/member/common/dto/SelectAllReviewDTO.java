package com.petnolja.semi.member.common.dto;

import java.io.Serializable;

public class SelectAllReviewDTO implements Serializable {

	private static final long serialVersionUID = 6375741453549939939L;
	
	private int reviewNo;
	private int reviewRate;
	private String memberId;
	private String reviewContents;
	private int memberNo;
	public SelectAllReviewDTO() {
		super();
	}
	public SelectAllReviewDTO(int reviewNo, int reviewRate, String memberId, String reviewContents, int memberNo) {
		super();
		this.reviewNo = reviewNo;
		this.reviewRate = reviewRate;
		this.memberId = memberId;
		this.reviewContents = reviewContents;
		this.memberNo = memberNo;
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
	public String getReviewContents() {
		return reviewContents;
	}
	public void setReviewContents(String reviewContents) {
		this.reviewContents = reviewContents;
	}
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "SelectAllReviewDTO [reviewNo=" + reviewNo + ", reviewRate=" + reviewRate + ", memberId=" + memberId
				+ ", reviewContents=" + reviewContents + ", memberNo=" + memberNo + "]";
	}

	
}
