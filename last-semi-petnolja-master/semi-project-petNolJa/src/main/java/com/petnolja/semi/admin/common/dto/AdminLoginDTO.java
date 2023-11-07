package com.petnolja.semi.admin.common.dto;

import java.io.Serializable;

public class AdminLoginDTO implements Serializable {
	private static final long serialVersionUID = -8244450728832765149L;
	
	private int empId;
	private String empPwd;
	
	public AdminLoginDTO() {
	}
	
	public AdminLoginDTO(int empId, String empPwd) {
		this.empId = empId;
		this.empPwd = empPwd;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpPwd() {
		return empPwd;
	}
	public void setEmpPwd(String empPwd) {
		this.empPwd = empPwd;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		return "AdminLoginDTO [empId=" + empId + ", empPwd=" + empPwd + "]";
	}
}
