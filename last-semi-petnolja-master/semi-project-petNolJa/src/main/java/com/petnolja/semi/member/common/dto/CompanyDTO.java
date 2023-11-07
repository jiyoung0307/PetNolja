package com.petnolja.semi.member.common.dto;

public class CompanyDTO {
	private int hotelPostPicNo;
	private String hotelPostTitle;
	private String hotelPostLtitle;
	private String hotelPostContentsFirst;
	private String hotelPostContentsTwo;
	private String hotelPostContentsThird;
	private int empId;
	private int hotelPostCategoryNo;
	
	public CompanyDTO() {
		super();
	}

	public int getHotelPostPicNo() {
		return hotelPostPicNo;
	}

	public void setHotelPostPicNo(int hotelPostPicNo) {
		this.hotelPostPicNo = hotelPostPicNo;
	}

	public String getHotelPostTitle() {
		return hotelPostTitle;
	}

	public void setHotelPostTitle(String hotelPostTitle) {
		this.hotelPostTitle = hotelPostTitle;
	}

	public String getHotelPostLtitle() {
		return hotelPostLtitle;
	}

	public void setHotelPostLtitle(String hotelPostLtitle) {
		this.hotelPostLtitle = hotelPostLtitle;
	}

	public String getHotelPostContentsFirst() {
		return hotelPostContentsFirst;
	}

	public void setHotelPostContentsFirst(String hotelPostContentsFirst) {
		this.hotelPostContentsFirst = hotelPostContentsFirst;
	}

	public String getHotelPostContentsTwo() {
		return hotelPostContentsTwo;
	}

	public void setHotelPostContentsTwo(String hotelPostContentsTwo) {
		this.hotelPostContentsTwo = hotelPostContentsTwo;
	}

	public String getHotelPostContentsThird() {
		return hotelPostContentsThird;
	}

	public void setHotelPostContentsThird(String hotelPostContentsThird) {
		this.hotelPostContentsThird = hotelPostContentsThird;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getHotelPostCategoryNo() {
		return hotelPostCategoryNo;
	}

	public void setHotelPostCategoryNo(int hotelPostCategoryNo) {
		this.hotelPostCategoryNo = hotelPostCategoryNo;
	}

	@Override
	public String toString() {
		return "CompanyDTO [hotelPostPicNo=" + hotelPostPicNo + ", hotelPostTitle=" + hotelPostTitle
				+ ", hotelPostLtitle=" + hotelPostLtitle + ", hotelPostContentsFirst=" + hotelPostContentsFirst
				+ ", hotelPostContentsTwo=" + hotelPostContentsTwo + ", hotelPostContentsThird="
				+ hotelPostContentsThird + ", empId=" + empId + ", hotelPostCategoryNo=" + hotelPostCategoryNo + "]";
	}
	
	

	
}
