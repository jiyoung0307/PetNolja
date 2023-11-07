package com.petnolja.semi.admin.common.dto;

import java.io.Serializable;
import java.sql.Date;

public class PetsitterLogDTO implements Serializable {
	private static final long serialVersionUID = -7451315653807466820L;
	
	private int petsitterLogNo;
	private java.sql.Date petsitterLogDate;
	private String petsiteerLogCheck;
	private int empId;
	
	public PetsitterLogDTO() {
	}
	
	public PetsitterLogDTO(int petsitterLogNo, Date petsitterLogDate, String petsiteerLogCheck, int empId) {
		this.petsitterLogNo = petsitterLogNo;
		this.petsitterLogDate = petsitterLogDate;
		this.petsiteerLogCheck = petsiteerLogCheck;
		this.empId = empId;
	}
	
	public int getPetsitterLogNo() {
		return petsitterLogNo;
	}
	public void setPetsitterLogNo(int petsitterLogNo) {
		this.petsitterLogNo = petsitterLogNo;
	}
	public java.sql.Date getPetsitterLogDate() {
		return petsitterLogDate;
	}
	public void setPetsitterLogDate(java.sql.Date petsitterLogDate) {
		this.petsitterLogDate = petsitterLogDate;
	}
	public String getPetsiteerLogCheck() {
		return petsiteerLogCheck;
	}
	public void setPetsiteerLogCheck(String petsiteerLogCheck) {
		this.petsiteerLogCheck = petsiteerLogCheck;
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
		return "PetsitterLogDTO [petsitterLogNo=" + petsitterLogNo + ", petsitterLogDate=" + petsitterLogDate
				+ ", petsiteerLogCheck=" + petsiteerLogCheck + ", empId=" + empId + "]";
	}
}
