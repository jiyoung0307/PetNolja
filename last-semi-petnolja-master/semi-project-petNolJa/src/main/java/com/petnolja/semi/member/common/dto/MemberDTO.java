package com.petnolja.semi.member.common.dto;

import java.io.Serializable;
import java.sql.Date;

public class MemberDTO implements Serializable {
	private static final long serialVersionUID = -4158276778356741358L;
	
	private int memberNo;
	private String memberId;
	private String memberPwd;
	private String memberName;
	private java.sql.Date memberBirth;
	private String memberPhone;
	private String memberEmail;
	private int memberPoint;
	private int gradeNo;
	
	public MemberDTO() {
	}

	public MemberDTO(int memberNo, String memberId, String memberPwd, String memberName, Date memberBirth,
			String memberPhone, String memberEmail, int memberPoint, int gradeNo) {
		this.memberNo = memberNo;
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.memberBirth = memberBirth;
		this.memberPhone = memberPhone;
		this.memberEmail = memberEmail;
		this.memberPoint = memberPoint;
		this.gradeNo = gradeNo;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPwd() {
		return memberPwd;
	}

	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public java.sql.Date getMemberBirth() {
		return memberBirth;
	}

	public void setMemberBirth(java.sql.Date memberBirth) {
		this.memberBirth = memberBirth;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public int getMemberPoint() {
		return memberPoint;
	}

	public void setMemberPoint(int memberPoint) {
		this.memberPoint = memberPoint;
	}

	public int getGradeNo() {
		return gradeNo;
	}

	public void setGradeNo(int gradeNo) {
		this.gradeNo = gradeNo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "MemberDTO [memberNo=" + memberNo + ", memberId=" + memberId + ", memberPwd=" + memberPwd
				+ ", memberName=" + memberName + ", memberBirth=" + memberBirth + ", memberPhone=" + memberPhone
				+ ", memberEmail=" + memberEmail + ", memberPoint=" + memberPoint + ", gradeNo=" + gradeNo + "]";
	}
	
	
}
