package com.petnolja.semi.member.common.dto;

import java.io.Serializable;

public class QuestionDTO implements Serializable{

	private static final long serialVersionUID = -5561873560937495152L;
	
	private int questionNo;
	private String questionTitle;
	private String questionContents;
	private int memberNo;
	
	public QuestionDTO() {
	}

	public QuestionDTO(int questionNo, String questionTitle, String questionContents, int memberNo) {
		this.questionNo = questionNo;
		this.questionTitle = questionTitle;
		this.questionContents = questionContents;
		this.memberNo = memberNo;
	}

	public int getQuestionNo() {
		return questionNo;
	}

	public void setQuestionNo(int questionNo) {
		this.questionNo = questionNo;
	}

	public String getQuestionTitle() {
		return questionTitle;
	}

	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}

	public String getQuestionContents() {
		return questionContents;
	}

	public void setQuestionContents(String questionContents) {
		this.questionContents = questionContents;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "QuestinoDTO [questionNo=" + questionNo + ", questionTitle=" + questionTitle + ", questionContents="
				+ questionContents + ", memberNo=" + memberNo + "]";
	}
	
	
}
