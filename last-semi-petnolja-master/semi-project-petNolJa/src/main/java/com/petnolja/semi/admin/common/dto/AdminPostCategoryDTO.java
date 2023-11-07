package com.petnolja.semi.admin.common.dto;

import java.io.Serializable;

public class AdminPostCategoryDTO implements Serializable{

	private static final long serialVersionUID = 9013511906892528750L;
	
	private int adminCategoryNo;
	private String adminCategoryName;
	
	public AdminPostCategoryDTO() {
	}

	public int getAdminCategoryNo() {
		return adminCategoryNo;
	}

	public void setAdminCategoryNo(int adminCategoryNo) {
		this.adminCategoryNo = adminCategoryNo;
	}

	public String getAdminCategoryName() {
		return adminCategoryName;
	}

	public void setAdminCategoryName(String adminCategoryName) {
		this.adminCategoryName = adminCategoryName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public AdminPostCategoryDTO(int adminCategoryNo, String adminCategoryName) {
		this.adminCategoryNo = adminCategoryNo;
		this.adminCategoryName = adminCategoryName;
	}

	@Override
	public String toString() {
		return "AdminPostCategoryDTO [adminCategoryNo=" + adminCategoryNo + ", adminCategoryName=" + adminCategoryName
				+ "]";
	}
	
	
}
