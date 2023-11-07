package com.petnolja.semi.admin.common.dto;

import java.io.Serializable;

public class LocationPostDTO implements Serializable{

	private static final long serialVersionUID = 5440957797211593298L;
	
	private int locationPostNo;
	private String locationPostTitle;
	private String locationPostLtitle;
	private String locationOldPost;
	private String locationNewPost;
	private String telePhoneNumber;
	private int empId; // 작성자도 이번엔 포함을 해야겠다(조금 더 생각을 해봐야겠다.)
	private int locationPostCategory;
	
	public LocationPostDTO() {
		super();
	}

	public int getLocationPostNo() {
		return locationPostNo;
	}

	public void setLocationPostNo(int locationPostNo) {
		this.locationPostNo = locationPostNo;
	}

	public String getLocationPostTitle() {
		return locationPostTitle;
	}

	public void setLocationPostTitle(String locationPostTitle) {
		this.locationPostTitle = locationPostTitle;
	}

	public String getLocationPostLtitle() {
		return locationPostLtitle;
	}

	public void setLocationPostLtitle(String locationPostLtitle) {
		this.locationPostLtitle = locationPostLtitle;
	}

	public String getLocationOldPost() {
		return locationOldPost;
	}

	public void setLocationOldPost(String locationOldPost) {
		this.locationOldPost = locationOldPost;
	}

	public String getLocationNewPost() {
		return locationNewPost;
	}

	public void setLocationNewPost(String locationNewPost) {
		this.locationNewPost = locationNewPost;
	}

	public String getTelePhoneNumber() {
		return telePhoneNumber;
	}

	public void setTelePhoneNumber(String telePhoneNumber) {
		this.telePhoneNumber = telePhoneNumber;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getLocationPostCategory() {
		return locationPostCategory;
	}

	public void setLocationPostCategory(int locationPostCategory) {
		this.locationPostCategory = locationPostCategory;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "LocationPostDTO [locationPostNo=" + locationPostNo + ", locationPostTitle=" + locationPostTitle
				+ ", locationPostLtitle=" + locationPostLtitle + ", locationOldPost=" + locationOldPost
				+ ", locationNewPost=" + locationNewPost + ", telePhoneNumber=" + telePhoneNumber + ", empId=" + empId
				+ ", locationPostCategory=" + locationPostCategory + "]";
	}
	

}
