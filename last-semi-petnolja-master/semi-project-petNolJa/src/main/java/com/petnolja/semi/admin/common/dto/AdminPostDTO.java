package com.petnolja.semi.admin.common.dto;

import java.io.Serializable;
import java.sql.Date;

public class AdminPostDTO implements Serializable{

	private static final long serialVersionUID = -3989958833858824406L;
	
	private int adminpostNo;
	private String adminpostTitle;
	private String adminpostContents;
	private java.sql.Date adminpostDate;
	private java.sql.Date adminpostUpdate;
	private java.sql.Date adminEventExpire;
	private int adminCategoryNo;
	private int empId;
	
	public AdminPostDTO() {
	}
	
	public AdminPostDTO(int adminpostNo, String adminpostTitle, String adminpostContents, Date adminpostDate,
			Date adminpostUpdate, Date adminEventExpire, int adminCategoryNo, int empId) {
		this.adminpostNo = adminpostNo;
		this.adminpostTitle = adminpostTitle;
		this.adminpostContents = adminpostContents;
		this.adminpostDate = adminpostDate;
		this.adminpostUpdate = adminpostUpdate;
		this.adminEventExpire = adminEventExpire;
		this.adminCategoryNo = adminCategoryNo;
		this.empId = empId;
	}
	public int getAdminpostNo() {
		return adminpostNo;
	}
	public void setAdminpostNo(int adminpostNo) {
		this.adminpostNo = adminpostNo;
	}
	public String getAdminpostTitle() {
		return adminpostTitle;
	}
	public void setAdminpostTitle(String adminpostTitle) {
		this.adminpostTitle = adminpostTitle;
	}
	public String getAdminpostContents() {
		return adminpostContents;
	}
	public void setAdminpostContents(String adminpostContents) {
		this.adminpostContents = adminpostContents;
	}
	public java.sql.Date getAdminpostDate() {
		return adminpostDate;
	}
	public void setAdminpostDate(java.sql.Date adminpostDate) {
		this.adminpostDate = adminpostDate;
	}
	public java.sql.Date getAdminpostUpdate() {
		return adminpostUpdate;
	}
	public void setAdminpostUpdate(java.sql.Date adminpostUpdate) {
		this.adminpostUpdate = adminpostUpdate;
	}
	public java.sql.Date getAdminEventExpire() {
		return adminEventExpire;
	}
	public void setAdminEventExpire(java.sql.Date adminEventExpire) {
		this.adminEventExpire = adminEventExpire;
	}
	public int getAdminCategoryNo() {
		return adminCategoryNo;
	}
	public void setAdminCategoryNo(int adminCategoryNo) {
		this.adminCategoryNo = adminCategoryNo;
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
		return "AdminPostDTO [adminpostNo=" + adminpostNo + ", adminpostTitle=" + adminpostTitle
				+ ", adminpostContents=" + adminpostContents + ", adminpostDate=" + adminpostDate + ", adminpostUpdate="
				+ adminpostUpdate + ", adminEventExpire=" + adminEventExpire + ", adminCategoryNo=" + adminCategoryNo
				+ ", empId=" + empId + "]";
	}
}
