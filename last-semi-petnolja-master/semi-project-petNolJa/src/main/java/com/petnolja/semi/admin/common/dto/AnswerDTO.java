package com.petnolja.semi.admin.common.dto;

import java.io.Serializable;

public class AnswerDTO implements Serializable{

	private static final long serialVersionUID = 2923853149636243184L;
	
	private int answerNo;
	private String answerTitle;
	private String answerContents;
	private int empId;
	private int questionNo;
	
	public AnswerDTO() {
	}

	public AnswerDTO(int answerNo, String answerTitle, String answerContents, int empId, int questionNo) {
		this.answerNo = answerNo;
		this.answerTitle = answerTitle;
		this.answerContents = answerContents;
		this.empId = empId;
		this.questionNo = questionNo;
	}

	public int getAnswerNo() {
		return answerNo;
	}

	public void setAnswerNo(int answerNo) {
		this.answerNo = answerNo;
	}

	public String getAnswerTitle() {
		return answerTitle;
	}

	public void setAnswerTitle(String answerTitle) {
		this.answerTitle = answerTitle;
	}

	public String getAnswerContents() {
		return answerContents;
	}

	public void setAnswerContents(String answerContents) {
		this.answerContents = answerContents;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getQuestionNo() {
		return questionNo;
	}

	public void setQuestionNo(int questionNo) {
		this.questionNo = questionNo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "AnswerDTO [answerNo=" + answerNo + ", answerTitle=" + answerTitle + ", answerContents=" + answerContents
				+ ", empId=" + empId + ", questionNo=" + questionNo + "]";
	}
	
	
}
