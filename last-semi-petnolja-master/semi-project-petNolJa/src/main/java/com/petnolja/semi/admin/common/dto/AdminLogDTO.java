package com.petnolja.semi.admin.common.dto;

import java.io.Serializable;
import java.sql.Date;

public class AdminLogDTO implements Serializable {

	private static final long serialVersionUID = 8952697756541804965L;
	
	private int adminlogNo;
	private String adminlogDate;
	private int empId;
	public AdminLogDTO() {
		super();
	}
	public AdminLogDTO(int adminlogNo, String adminlogDate, int empId) {
		super();
		this.adminlogNo = adminlogNo;
		this.adminlogDate = adminlogDate;
		this.empId = empId;
	}
	public int getAdminlogNo() {
		return adminlogNo;
	}
	public void setAdminlogNo(int adminlogNo) {
		this.adminlogNo = adminlogNo;
	}
	public String getAdminlogDate() {
		return adminlogDate;
	}
	public void setAdminlogDate(String adminlogDate) {
		this.adminlogDate = adminlogDate;
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
		return "AdminLogDTO [adminlogNo=" + adminlogNo + ", adminlogDate=" + adminlogDate + ", empId=" + empId + "]";
	}
	
	
	
	
}