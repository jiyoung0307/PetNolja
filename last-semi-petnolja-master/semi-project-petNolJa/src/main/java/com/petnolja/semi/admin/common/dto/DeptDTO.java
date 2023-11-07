package com.petnolja.semi.admin.common.dto;

import java.io.Serializable;

public class DeptDTO implements Serializable{

	private static final long serialVersionUID = 5765427358245147019L;
	
	private int deptNo;
	private String deptName;
	private String deptYn;
	
	public DeptDTO() {
	}

	public DeptDTO(int deptNo, String deptName, String deptYn) {
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.deptYn = deptYn;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptYn() {
		return deptYn;
	}

	public void setDeptYn(String deptYn) {
		this.deptYn = deptYn;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "DeptDTO [deptNo=" + deptNo + ", deptName=" + deptName + ", deptYn=" + deptYn + "]";
	}
	
	
	
}
