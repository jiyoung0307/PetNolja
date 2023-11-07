package com.petnolja.semi.member.common.dto;

public class LocationDTO {
	private int locationPostNo;
	private String locationPostTitle;
	private String locationPostLtitle;
	private String locationOldPost;
	private String locationNewPost;
	private String telePhoneNumber;
	private int empId;
	private int locationPostCategory;
	
	public LocationDTO() {
	}
	public int getLocationPostNO() {
		return locationPostNo;
	}
	public void setLocationPostNO(int locationPostNO) {
		this.locationPostNo = locationPostNO;
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
	@Override
	public String toString() {
		return "LocationDTO [locationPostNO=" + locationPostNo + ", locationPostTitle=" + locationPostTitle
				+ ", locationPostLtitle=" + locationPostLtitle + ", locationOldPost=" + locationOldPost
				+ ", locationNewPost=" + locationNewPost + ", telePhoneNumber=" + telePhoneNumber + ", empId=" + empId
				+ ", locationPostCategory=" + locationPostCategory + "]";
	}
	
}
