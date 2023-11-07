package com.petnolja.semi.member.common.dto;

import java.io.Serializable;
import java.sql.Date;

public class CouponDTO implements Serializable {
	private static final long serialVersionUID = 5266807327384298781L;
	
	private int couponNo;
	private String couponName;
	private String couponContents;
	private int couponDiscountPrice;
	private java.sql.Date couponStartDate;
	private java.sql.Date couponEndDate;
	private int empId;
	
	public CouponDTO() {
	}
   
	public CouponDTO(int couponNo, String couponName, String couponContents, int couponDiscountPrice,
			Date couponStartDate, Date couponEndDate, int empId) {
		this.couponNo = couponNo;
		this.couponName = couponName;
		this.couponContents = couponContents;
		this.couponDiscountPrice = couponDiscountPrice;
		this.couponStartDate = couponStartDate;
		this.couponEndDate = couponEndDate;
		this.empId = empId;
	}

	public int getCouponNo() {
		return couponNo;
	}

	public void setCouponNo(int couponNo) {
		this.couponNo = couponNo;
	}

	public String getCouponName() {
		return couponName;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public String getCouponContents() {
		return couponContents;
	}

	public void setCouponContents(String couponContents) {
		this.couponContents = couponContents;
	}

	public int getCouponDiscountPrice() {
		return couponDiscountPrice;
	}

	public void setCouponDiscountPrice(int couponDiscountPrice) {
		this.couponDiscountPrice = couponDiscountPrice;
	}

	public java.sql.Date getCouponStartDate() {
		return couponStartDate;
	}

	public void setCouponStartDate(java.sql.Date couponStartDate) {
		this.couponStartDate = couponStartDate;
	}

	public java.sql.Date getCouponEndDate() {
		return couponEndDate;
	}

	public void setCouponEndDate(java.sql.Date couponEndDate) {
		this.couponEndDate = couponEndDate;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "CouponDTO [couponNo=" + couponNo + ", couponName=" + couponName + ", couponContents=" + couponContents
				+ ", couponDiscountPrice=" + couponDiscountPrice + ", couponStartDate=" + couponStartDate
				+ ", couponEndDate=" + couponEndDate + ", empId=" + empId + "]";
	}
	
}
