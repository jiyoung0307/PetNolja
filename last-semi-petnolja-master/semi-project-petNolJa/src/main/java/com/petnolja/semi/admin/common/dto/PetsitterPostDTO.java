package com.petnolja.semi.admin.common.dto;

import java.io.Serializable;
import java.sql.Date;

public class PetsitterPostDTO implements Serializable {
	private static final long serialVersionUID = -7914384255882585381L;
	
	private int petsitterPostNo;
	private String petsitterPostTitle;
	private String petsitterPostCareer;
	private String petsitterPostContents;
	private java.sql.Date petsitterCreateDate;
	private java.sql.Date petsitterModifyDate;
	private int petsitterPostCount;
	private String petsitterPostStatus;
	private int empId;										// 작성자
	private EmployeeDTO emp;								// 작성자
	private AdminPictureDTO adminPicture;
	
	public PetsitterPostDTO() {
	}

	public PetsitterPostDTO(int petsitterPostNo, String petsitterPostTitle, String petsitterPostCareer,
			String petsitterPostContents, Date petsitterCreateDate, Date petsitterModifyDate, int petsitterPostCount,
			String petsitterPostStatus, int empId, EmployeeDTO emp, AdminPictureDTO adminPicture) {
		this.petsitterPostNo = petsitterPostNo;
		this.petsitterPostTitle = petsitterPostTitle;
		this.petsitterPostCareer = petsitterPostCareer;
		this.petsitterPostContents = petsitterPostContents;
		this.petsitterCreateDate = petsitterCreateDate;
		this.petsitterModifyDate = petsitterModifyDate;
		this.petsitterPostCount = petsitterPostCount;
		this.petsitterPostStatus = petsitterPostStatus;
		this.empId = empId;
		this.emp = emp;
		this.adminPicture = adminPicture;
	}

	public int getPetsitterPostNo() {
		return petsitterPostNo;
	}

	public void setPetsitterPostNo(int petsitterPostNo) {
		this.petsitterPostNo = petsitterPostNo;
	}

	public String getPetsitterPostTitle() {
		return petsitterPostTitle;
	}

	public void setPetsitterPostTitle(String petsitterPostTitle) {
		this.petsitterPostTitle = petsitterPostTitle;
	}

	public String getPetsitterPostCareer() {
		return petsitterPostCareer;
	}

	public void setPetsitterPostCareer(String petsitterPostCareer) {
		this.petsitterPostCareer = petsitterPostCareer;
	}

	public String getPetsitterPostContents() {
		return petsitterPostContents;
	}

	public void setPetsitterPostContents(String petsitterPostContents) {
		this.petsitterPostContents = petsitterPostContents;
	}

	public java.sql.Date getPetsitterCreateDate() {
		return petsitterCreateDate;
	}

	public void setPetsitterCreateDate(java.sql.Date petsitterCreateDate) {
		this.petsitterCreateDate = petsitterCreateDate;
	}

	public java.sql.Date getPetsitterModifyDate() {
		return petsitterModifyDate;
	}

	public void setPetsitterModifyDate(java.sql.Date petsitterModifyDate) {
		this.petsitterModifyDate = petsitterModifyDate;
	}

	public int getPetsitterPostCount() {
		return petsitterPostCount;
	}

	public void setPetsitterPostCount(int petsitterPostCount) {
		this.petsitterPostCount = petsitterPostCount;
	}

	public String getPetsitterPostStatus() {
		return petsitterPostStatus;
	}

	public void setPetsitterPostStatus(String petsitterPostStatus) {
		this.petsitterPostStatus = petsitterPostStatus;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public EmployeeDTO getEmp() {
		return emp;
	}

	public void setEmp(EmployeeDTO emp) {
		this.emp = emp;
	}

	public AdminPictureDTO getAdminPicture() {
		return adminPicture;
	}

	public void setAdminPicture(AdminPictureDTO adminPicture) {
		this.adminPicture = adminPicture;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "PetsitterPostDTO [petsitterPostNo=" + petsitterPostNo + ", petsitterPostTitle=" + petsitterPostTitle
				+ ", petsitterPostCareer=" + petsitterPostCareer + ", petsitterPostContents=" + petsitterPostContents
				+ ", petsitterCreateDate=" + petsitterCreateDate + ", petsitterModifyDate=" + petsitterModifyDate
				+ ", petsitterPostCount=" + petsitterPostCount + ", petsitterPostStatus=" + petsitterPostStatus
				+ ", empId=" + empId + ", emp=" + emp + ", adminPicture=" + adminPicture + "]";
	}
	
}
