package com.petnolja.semi.admin.common.dto;

import java.io.Serializable;

public class JobDTO implements Serializable{

	private static final long serialVersionUID = -3101096010654395799L;
	
	private int jobNo;
	private String jobName;
	private String jobYn;
	
	public JobDTO() {
	}

	public JobDTO(int jobNo, String jobName, String jobYn) {
		this.jobNo = jobNo;
		this.jobName = jobName;
		this.jobYn = jobYn;
	}

	public int getJobNo() {
		return jobNo;
	}

	public void setJobNo(int jobNo) {
		this.jobNo = jobNo;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getJobYn() {
		return jobYn;
	}

	public void setJobYn(String jobYn) {
		this.jobYn = jobYn;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "JobDTO [jobNo=" + jobNo + ", jobName=" + jobName + ", jobYn=" + jobYn + "]";
	}
	
	
}
