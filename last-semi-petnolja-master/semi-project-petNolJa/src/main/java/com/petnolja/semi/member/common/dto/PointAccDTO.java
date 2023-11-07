package com.petnolja.semi.member.common.dto;

import java.sql.Date;

public class PointAccDTO {
	private int pointLogNo;
	private java.sql.Date pointLogDate;
	private String pointLogCheck;
	private int memberNo;
	private int memberPoint;
	private int pointUse;
	
	public PointAccDTO() {
		super();
	}

	public PointAccDTO(int pointLogNo, Date pointLogDate, String pointLogCheck, int memberNo, int memberPoint,
			int pointUse) {
		super();
		this.pointLogNo = pointLogNo;
		this.pointLogDate = pointLogDate;
		this.pointLogCheck = pointLogCheck;
		this.memberNo = memberNo;
		this.memberPoint = memberPoint;
		this.pointUse = pointUse;
	}

	public int getPointLogNo() {
		return pointLogNo;
	}

	public void setPointLogNo(int pointLogNo) {
		this.pointLogNo = pointLogNo;
	}

	public java.sql.Date getPointLogDate() {
		return pointLogDate;
	}

	public void setPointLogDate(java.sql.Date pointLogDate) {
		this.pointLogDate = pointLogDate;
	}

	public String getPointLogCheck() {
		return pointLogCheck;
	}

	public void setPointLogCheck(String pointLogCheck) {
		this.pointLogCheck = pointLogCheck;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public int getMemberPoint() {
		return memberPoint;
	}

	public void setMemberPoint(int memberPoint) {
		this.memberPoint = memberPoint;
	}

	public int getPointUse() {
		return pointUse;
	}

	public void setPointUse(int pointUse) {
		this.pointUse = pointUse;
	}

	@Override
	public String toString() {
		return "PointAccDTO [pointLogNo=" + pointLogNo + ", pointLogDate=" + pointLogDate + ", pointLogCheck="
				+ pointLogCheck + ", memberNo=" + memberNo + ", memberPoint=" + memberPoint + ", pointUse=" + pointUse
				+ "]";
	}
}
