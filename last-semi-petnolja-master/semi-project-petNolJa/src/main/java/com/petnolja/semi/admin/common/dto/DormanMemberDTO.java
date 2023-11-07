package com.petnolja.semi.admin.common.dto;

import java.io.Serializable;
import java.sql.Date;

public class DormanMemberDTO implements Serializable{

	private static final long serialVersionUID = 5297197152849688835L;
	
	private int dormanMemberNo ;    
	private String dormanId;
	private String dormanPwd;
	private String dormanName;
	private java.sql.Date dormanBirth;
	private String dormanNumber;
	private String dormanEmail;
	private int dormanAccprice;
	
	public DormanMemberDTO() {
	}

	public DormanMemberDTO(int dormanMemberNo, String dormanId, String dormanPwd, String dormanName, Date dormanBirth,
			String dormanNumber, String dormanEmail, int dormanAccprice) {
		this.dormanMemberNo = dormanMemberNo;
		this.dormanId = dormanId;
		this.dormanPwd = dormanPwd;
		this.dormanName = dormanName;
		this.dormanBirth = dormanBirth;
		this.dormanNumber = dormanNumber;
		this.dormanEmail = dormanEmail;
		this.dormanAccprice = dormanAccprice;
	}

	public int getDormanMemberNo() {
		return dormanMemberNo;
	}

	public void setDormanMemberNo(int dormanMemberNo) {
		this.dormanMemberNo = dormanMemberNo;
	}

	public String getDormanId() {
		return dormanId;
	}

	public void setDormanId(String dormanId) {
		this.dormanId = dormanId;
	}

	public String getDormanPwd() {
		return dormanPwd;
	}

	public void setDormanPwd(String dormanPwd) {
		this.dormanPwd = dormanPwd;
	}

	public String getDormanName() {
		return dormanName;
	}

	public void setDormanName(String dormanName) {
		this.dormanName = dormanName;
	}

	public java.sql.Date getDormanBirth() {
		return dormanBirth;
	}

	public void setDormanBirth(java.sql.Date dormanBirth) {
		this.dormanBirth = dormanBirth;
	}

	public String getDormanNumber() {
		return dormanNumber;
	}

	public void setDormanNumber(String dormanNumber) {
		this.dormanNumber = dormanNumber;
	}

	public String getDormanEmail() {
		return dormanEmail;
	}

	public void setDormanEmail(String dormanEmail) {
		this.dormanEmail = dormanEmail;
	}

	public int getDormanAccprice() {
		return dormanAccprice;
	}

	public void setDormanAccprice(int dormanAccprice) {
		this.dormanAccprice = dormanAccprice;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "DormanMemberDTO [dormanMemberNo=" + dormanMemberNo + ", dormanId=" + dormanId + ", dormanPwd="
				+ dormanPwd + ", dormanName=" + dormanName + ", dormanBirth=" + dormanBirth + ", dormanNumber="
				+ dormanNumber + ", dormanEmail=" + dormanEmail + ", dormanAccprice=" + dormanAccprice + "]";
	}
}
