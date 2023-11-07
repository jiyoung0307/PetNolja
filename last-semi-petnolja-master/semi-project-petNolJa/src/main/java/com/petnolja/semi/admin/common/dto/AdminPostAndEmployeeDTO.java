package com.petnolja.semi.admin.common.dto;

import java.io.Serializable;
import java.sql.Date;

public class AdminPostAndEmployeeDTO implements Serializable{
	private static final long serialVersionUID = -7107639851839075050L;
	
	private int adminpostNo;
	private String adminpostTitle;
	private String adminpostContents;
	private java.sql.Date adminpostDate;
	private java.sql.Date adminpostUpdate;
	private java.sql.Date adminEventExpire;
	private int adminCategoryNo;
	private EmployeeDTO emp;
	
	public AdminPostAndEmployeeDTO() {
	}
	
	public AdminPostAndEmployeeDTO(int adminpostNo, String adminpostTitle, String adminpostContents, Date adminpostDate,
			Date adminpostUpdate, Date adminEventExpire, int adminCategoryNo, EmployeeDTO emp) {
		this.adminpostNo = adminpostNo;
		this.adminpostTitle = adminpostTitle;
		this.adminpostContents = adminpostContents;
		this.adminpostDate = adminpostDate;
		this.adminpostUpdate = adminpostUpdate;
		this.adminEventExpire = adminEventExpire;
		this.adminCategoryNo = adminCategoryNo;
		this.emp = emp;
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
	public EmployeeDTO getEmp() {
		return emp;
	}
	public void setEmp(EmployeeDTO emp) {
		this.emp = emp;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		return "AdminPostAndEmployeeDTO [adminpostNo=" + adminpostNo + ", adminpostTitle=" + adminpostTitle
				+ ", adminpostContents=" + adminpostContents + ", adminpostDate=" + adminpostDate + ", adminpostUpdate="
				+ adminpostUpdate + ", adminEventExpire=" + adminEventExpire + ", adminCategoryNo=" + adminCategoryNo
				+ ", emp=" + emp + "]";
	}
	
}
