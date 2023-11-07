package com.petnolja.semi.admin.common.dto;

import java.sql.Date;

public class WithdrawMemberDTO {
	
	
	private int withdrawmemberNo;
	private String withdrawId;	
	private String withdrawPwd;	
	private String withdrawName;	
	private String withdrawBirth;	
	private String withdrawNumber;	
	private String withdrawWEmail;	
	private java.sql.Date withdrawDate;
	private int GradeNo;
	
	public WithdrawMemberDTO(int withdrawmemberNo, String withdrawId, String withdrawPwd, String withdrawName,
			String withdrawBirth, String withdrawNumber, String withdrawWEmail, Date withdrawDate, int gradeNo) {
		super();
		this.withdrawmemberNo = withdrawmemberNo;
		this.withdrawId = withdrawId;
		this.withdrawPwd = withdrawPwd;
		this.withdrawName = withdrawName;
		this.withdrawBirth = withdrawBirth;
		this.withdrawNumber = withdrawNumber;
		this.withdrawWEmail = withdrawWEmail;
		this.withdrawDate = withdrawDate;
		GradeNo = gradeNo;
	
	}

	public WithdrawMemberDTO() {
		
	}

	public int getWithdrawmemberNo() {
		return withdrawmemberNo;
	}

	public void setWithdrawmemberNo(int withdrawmemberNo) {
		this.withdrawmemberNo = withdrawmemberNo;
	}

	public String getWithdrawId() {
		return withdrawId;
	}

	public void setWithdrawId(String withdrawId) {
		this.withdrawId = withdrawId;
	}

	public String getWithdrawPwd() {
		return withdrawPwd;
	}

	public void setWithdrawPwd(String withdrawPwd) {
		this.withdrawPwd = withdrawPwd;
	}

	public String getWithdrawName() {
		return withdrawName;
	}

	public void setWithdrawName(String withdrawName) {
		this.withdrawName = withdrawName;
	}

	public String getWithdrawBirth() {
		return withdrawBirth;
	}

	public void setWithdrawBirth(String withdrawBirth) {
		this.withdrawBirth = withdrawBirth;
	}

	public String getWithdrawNumber() {
		return withdrawNumber;
	}

	public void setWithdrawNumber(String withdrawNumber) {
		this.withdrawNumber = withdrawNumber;
	}

	public String getWithdrawWEmail() {
		return withdrawWEmail;
	}

	public void setWithdrawWEmail(String withdrawWEmail) {
		this.withdrawWEmail = withdrawWEmail;
	}

	public java.sql.Date getWithdrawDate() {
		return withdrawDate;
	}

	public void setWithdrawDate(java.sql.Date withdrawDate) {
		this.withdrawDate = withdrawDate;
	}

	public int getGradeNo() {
		return GradeNo;
	}

	public void setGradeNo(int gradeNo) {
		GradeNo = gradeNo;
	}

	@Override
	public String toString() {
		return "WithdrawMemberDTO [withdrawmemberNo=" + withdrawmemberNo + ", withdrawId=" + withdrawId
				+ ", withdrawPwd=" + withdrawPwd + ", withdrawName=" + withdrawName + ", withdrawBirth=" + withdrawBirth
				+ ", withdrawNumber=" + withdrawNumber + ", withdrawWEmail=" + withdrawWEmail + ", withdrawDate="
				+ withdrawDate + ", GradeNo=" + GradeNo + "]";
	}	
	
	
}
