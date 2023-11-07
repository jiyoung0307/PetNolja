package com.petnolja.semi.admin.common.dto;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

public class PetsitterDTO implements Serializable{
	private static final long serialVersionUID = 3011316236840840440L;
	
	private int empId;
	private String petsitterAble;
	private int abilityCode;
	private String empName;
	private String empEmail;
	private String empPhone;
	private String dropYn;
	private String abilityDef;
	private String abilityFirst;
	private String abilitySecond;
	private int abilityMoney;
	private String petsitterPostTitle;
	private String petsitterPostCareer;
	private String petsitterPostContents;
	private java.sql.Date petsitterPostCreateDate;
	private java.sql.Date petsitterPostModifyDate;
	private int petsitterPostCount;
	private String petsitterPostStatus;
	private int adminPictureNo;
	private String adminPictureName;
	private String adminPictureModifyName;
	private java.sql.Date adminPictureSaveTime;
	private String adminPictureSaveRoute;
	private String adminThumbnailPictureSaveRoute;
	private List<PetsitterLogDTO> petsitterLog;
	
	public PetsitterDTO() {
	}

	public PetsitterDTO(int empId, String petsitterAble, int abilityCode, String empName, String empEmail,
			String empPhone, String dropYn, String abilityDef, String abilityFirst, String abilitySecond,
			int abilityMoney, String petsitterPostTitle, String petsitterPostCareer, String petsitterPostContents,
			Date petsitterPostCreateDate, Date petsitterPostModifyDate, int petsitterPostCount,
			String petsitterPostStatus, int adminPictureNo, String adminPictureName, String adminPictureModifyName,
			Date adminPictureSaveTime, String adminPictureSaveRoute, String adminThumbnailPictureSaveRoute,
			List<PetsitterLogDTO> petsitterLog) {
		this.empId = empId;
		this.petsitterAble = petsitterAble;
		this.abilityCode = abilityCode;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empPhone = empPhone;
		this.dropYn = dropYn;
		this.abilityDef = abilityDef;
		this.abilityFirst = abilityFirst;
		this.abilitySecond = abilitySecond;
		this.abilityMoney = abilityMoney;
		this.petsitterPostTitle = petsitterPostTitle;
		this.petsitterPostCareer = petsitterPostCareer;
		this.petsitterPostContents = petsitterPostContents;
		this.petsitterPostCreateDate = petsitterPostCreateDate;
		this.petsitterPostModifyDate = petsitterPostModifyDate;
		this.petsitterPostCount = petsitterPostCount;
		this.petsitterPostStatus = petsitterPostStatus;
		this.adminPictureNo = adminPictureNo;
		this.adminPictureName = adminPictureName;
		this.adminPictureModifyName = adminPictureModifyName;
		this.adminPictureSaveTime = adminPictureSaveTime;
		this.adminPictureSaveRoute = adminPictureSaveRoute;
		this.adminThumbnailPictureSaveRoute = adminThumbnailPictureSaveRoute;
		this.petsitterLog = petsitterLog;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getPetsitterAble() {
		return petsitterAble;
	}

	public void setPetsitterAble(String petsitterAble) {
		this.petsitterAble = petsitterAble;
	}

	public int getAbilityCode() {
		return abilityCode;
	}

	public void setAbilityCode(int abilityCode) {
		this.abilityCode = abilityCode;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpPhone() {
		return empPhone;
	}

	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}

	public String getDropYn() {
		return dropYn;
	}

	public void setDropYn(String dropYn) {
		this.dropYn = dropYn;
	}

	public String getAbilityDef() {
		return abilityDef;
	}

	public void setAbilityDef(String abilityDef) {
		this.abilityDef = abilityDef;
	}

	public String getAbilityFirst() {
		return abilityFirst;
	}

	public void setAbilityFirst(String abilityFirst) {
		this.abilityFirst = abilityFirst;
	}

	public String getAbilitySecond() {
		return abilitySecond;
	}

	public void setAbilitySecond(String abilitySecond) {
		this.abilitySecond = abilitySecond;
	}

	public int getAbilityMoney() {
		return abilityMoney;
	}

	public void setAbilityMoney(int abilityMoney) {
		this.abilityMoney = abilityMoney;
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

	public java.sql.Date getPetsitterPostCreateDate() {
		return petsitterPostCreateDate;
	}

	public void setPetsitterPostCreateDate(java.sql.Date petsitterPostCreateDate) {
		this.petsitterPostCreateDate = petsitterPostCreateDate;
	}

	public java.sql.Date getPetsitterPostModifyDate() {
		return petsitterPostModifyDate;
	}

	public void setPetsitterPostModifyDate(java.sql.Date petsitterPostModifyDate) {
		this.petsitterPostModifyDate = petsitterPostModifyDate;
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

	public int getAdminPictureNo() {
		return adminPictureNo;
	}

	public void setAdminPictureNo(int adminPictureNo) {
		this.adminPictureNo = adminPictureNo;
	}

	public String getAdminPictureName() {
		return adminPictureName;
	}

	public void setAdminPictureName(String adminPictureName) {
		this.adminPictureName = adminPictureName;
	}

	public String getAdminPictureModifyName() {
		return adminPictureModifyName;
	}

	public void setAdminPictureModifyName(String adminPictureModifyName) {
		this.adminPictureModifyName = adminPictureModifyName;
	}

	public java.sql.Date getAdminPictureSaveTime() {
		return adminPictureSaveTime;
	}

	public void setAdminPictureSaveTime(java.sql.Date adminPictureSaveTime) {
		this.adminPictureSaveTime = adminPictureSaveTime;
	}

	public String getAdminPictureSaveRoute() {
		return adminPictureSaveRoute;
	}

	public void setAdminPictureSaveRoute(String adminPictureSaveRoute) {
		this.adminPictureSaveRoute = adminPictureSaveRoute;
	}

	public String getAdminThumbnailPictureSaveRoute() {
		return adminThumbnailPictureSaveRoute;
	}

	public void setAdminThumbnailPictureSaveRoute(String adminThumbnailPictureSaveRoute) {
		this.adminThumbnailPictureSaveRoute = adminThumbnailPictureSaveRoute;
	}

	public List<PetsitterLogDTO> getPetsitterLog() {
		return petsitterLog;
	}

	public void setPetsitterLog(List<PetsitterLogDTO> petsitterLog) {
		this.petsitterLog = petsitterLog;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "PetsitterDTO [empId=" + empId + ", petsitterAble=" + petsitterAble + ", abilityCode=" + abilityCode
				+ ", empName=" + empName + ", empEmail=" + empEmail + ", empPhone=" + empPhone + ", dropYn=" + dropYn
				+ ", abilityDef=" + abilityDef + ", abilityFirst=" + abilityFirst + ", abilitySecond=" + abilitySecond
				+ ", abilityMoney=" + abilityMoney + ", petsitterPostTitle=" + petsitterPostTitle
				+ ", petsitterPostCareer=" + petsitterPostCareer + ", petsitterPostContents=" + petsitterPostContents
				+ ", petsitterPostCreateDate=" + petsitterPostCreateDate + ", petsitterPostModifyDate="
				+ petsitterPostModifyDate + ", petsitterPostCount=" + petsitterPostCount + ", petsitterPostStatus="
				+ petsitterPostStatus + ", adminPictureNo=" + adminPictureNo + ", adminPictureName=" + adminPictureName
				+ ", adminPictureModifyName=" + adminPictureModifyName + ", adminPictureSaveTime="
				+ adminPictureSaveTime + ", adminPictureSaveRoute=" + adminPictureSaveRoute
				+ ", adminThumbnailPictureSaveRoute=" + adminThumbnailPictureSaveRoute + ", petsitterLog="
				+ petsitterLog + "]";
	}
	
}
