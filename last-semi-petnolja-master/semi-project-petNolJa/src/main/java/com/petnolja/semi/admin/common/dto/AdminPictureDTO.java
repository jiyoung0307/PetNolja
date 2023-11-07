package com.petnolja.semi.admin.common.dto;

import java.io.Serializable;

public class AdminPictureDTO implements Serializable {
	private static final long serialVersionUID = 3459601316077376396L;
	
	private int adminPictureNo;
	private String adminPictureName;
	private String adminPictureModifyName;
	private String adminPictureSaveTime;
	private String adminPictureSaveRoute;
	private String adminThumbnailPictureSaveRoute;
	private int roomPostNo;
	private int petsitterPostNo;
	
	public AdminPictureDTO() {
	}
	
	public AdminPictureDTO(int adminPictureNo, String adminPictureName, String adminPictureModifyName,
			String adminPictureSaveTime, String adminPictureSaveRoute, String adminThumbnailPictureSaveRoute,
			int roomPostNo, int petsitterPostNo) {
		this.adminPictureNo = adminPictureNo;
		this.adminPictureName = adminPictureName;
		this.adminPictureModifyName = adminPictureModifyName;
		this.adminPictureSaveTime = adminPictureSaveTime;
		this.adminPictureSaveRoute = adminPictureSaveRoute;
		this.adminThumbnailPictureSaveRoute = adminThumbnailPictureSaveRoute;
		this.roomPostNo = roomPostNo;
		this.petsitterPostNo = petsitterPostNo;
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
	public String getAdminPictureSaveTime() {
		return adminPictureSaveTime;
	}
	public void setAdminPictureSaveTime(String adminPictureSaveTime) {
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
	public int getRoomPostNo() {
		return roomPostNo;
	}
	public void setRoomPostNo(int roomPostNo) {
		this.roomPostNo = roomPostNo;
	}
	public int getPetsitterPostNo() {
		return petsitterPostNo;
	}
	public void setPetsitterPostNo(int petsitterPostNo) {
		this.petsitterPostNo = petsitterPostNo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		return "AdminPictureDTO [adminPictureNo=" + adminPictureNo + ", adminPictureName=" + adminPictureName
				+ ", adminPictureModifyName=" + adminPictureModifyName + ", adminPictureSaveTime="
				+ adminPictureSaveTime + ", adminPictureSaveRoute=" + adminPictureSaveRoute
				+ ", adminThumbnailPictureSaveRoute=" + adminThumbnailPictureSaveRoute + ", roomPostNo=" + roomPostNo
				+ ", petsitterPostNo=" + petsitterPostNo + "]";
	}
}
