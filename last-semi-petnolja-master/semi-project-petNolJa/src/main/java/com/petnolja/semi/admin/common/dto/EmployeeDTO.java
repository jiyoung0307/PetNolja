package com.petnolja.semi.admin.common.dto;

import java.io.Serializable;
import java.sql.Date;

public class EmployeeDTO implements Serializable {
	private static final long serialVersionUID = -7849144287639021701L;
	
	private int empId;
	private String empName;
	private String no;
	private String empEmail;
	private String empPhone;
	private int salary;
	private double bonus;
	private java.sql.Date hireDate;
	private java.sql.Date leaveDate;
	private String dropYN;
	private int deptCode;
	private int jopCode;
	private String password;
	private String deptName;
	private String jobName;
	public EmployeeDTO() {
		super();
	}
	public EmployeeDTO(int empId, String empName, String no, String empEmail, String empPhone, int salary, double bonus,
			Date hireDate, Date leaveDate, String dropYN, int deptCode, int jopCode, String password, String deptName,
			String jobName) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.no = no;
		this.empEmail = empEmail;
		this.empPhone = empPhone;
		this.salary = salary;
		this.bonus = bonus;
		this.hireDate = hireDate;
		this.leaveDate = leaveDate;
		this.dropYN = dropYN;
		this.deptCode = deptCode;
		this.jopCode = jopCode;
		this.password = password;
		this.deptName = deptName;
		this.jobName = jobName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public java.sql.Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(java.sql.Date hireDate) {
		this.hireDate = hireDate;
	}
	public java.sql.Date getLeaveDate() {
		return leaveDate;
	}
	public void setLeaveDate(java.sql.Date leaveDate) {
		this.leaveDate = leaveDate;
	}
	public String getDropYN() {
		return dropYN;
	}
	public void setDropYN(String dropYN) {
		this.dropYN = dropYN;
	}
	public int getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(int deptCode) {
		this.deptCode = deptCode;
	}
	public int getJopCode() {
		return jopCode;
	}
	public void setJopCode(int jopCode) {
		this.jopCode = jopCode;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [empId=" + empId + ", empName=" + empName + ", no=" + no + ", empEmail=" + empEmail
				+ ", empPhone=" + empPhone + ", salary=" + salary + ", bonus=" + bonus + ", hireDate=" + hireDate
				+ ", leaveDate=" + leaveDate + ", dropYN=" + dropYN + ", deptCode=" + deptCode + ", jopCode=" + jopCode
				+ ", password=" + password + ", deptName=" + deptName + ", jobName=" + jobName + ", getEmpId()="
				+ getEmpId() + ", getEmpName()=" + getEmpName() + ", getNo()=" + getNo() + ", getEmpEmail()="
				+ getEmpEmail() + ", getEmpPhone()=" + getEmpPhone() + ", getSalary()=" + getSalary() + ", getBonus()="
				+ getBonus() + ", getHireDate()=" + getHireDate() + ", getLeaveDate()=" + getLeaveDate()
				+ ", getDropYN()=" + getDropYN() + ", getDeptCode()=" + getDeptCode() + ", getJopCode()=" + getJopCode()
				+ ", getPassword()=" + getPassword() + ", getDeptName()=" + getDeptName() + ", getJobName()="
				+ getJobName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	
}