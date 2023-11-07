package com.petnolja.semi.member.common.dto;

import java.io.Serializable;

import com.petnolja.semi.admin.common.dto.AbilityDTO;
import com.petnolja.semi.admin.common.dto.EmployeeDTO;
import com.petnolja.semi.admin.common.dto.PetsitterLogDTO;
import com.petnolja.semi.admin.common.dto.PetsitterPostDTO;

public class PetsitterReservationDTO implements Serializable {
	private static final long serialVersionUID = 6506711439079831626L;
	
	private int empId;
	private String petsitterAble;
	private int abilityCode;
	private EmployeeDTO emp;
	private PetsitterLogDTO petsitterLog;
	private AbilityDTO ability;
	private PetsitterPostDTO petsitterPost;
	
	public PetsitterReservationDTO() {
	}
	
	public PetsitterReservationDTO(int empId, String petsitterAble, int abilityCode, EmployeeDTO emp,
			PetsitterLogDTO petsitterLog, AbilityDTO ability, PetsitterPostDTO petsitterPost) {
		this.empId = empId;
		this.petsitterAble = petsitterAble;
		this.abilityCode = abilityCode;
		this.emp = emp;
		this.petsitterLog = petsitterLog;
		this.ability = ability;
		this.petsitterPost = petsitterPost;
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

	public EmployeeDTO getEmp() {
		return emp;
	}

	public void setEmp(EmployeeDTO emp) {
		this.emp = emp;
	}

	public PetsitterLogDTO getPetsitterLog() {
		return petsitterLog;
	}

	public void setPetsitterLog(PetsitterLogDTO petsitterLog) {
		this.petsitterLog = petsitterLog;
	}

	public AbilityDTO getAbility() {
		return ability;
	}

	public void setAbility(AbilityDTO ability) {
		this.ability = ability;
	}

	public PetsitterPostDTO getPetsitterPost() {
		return petsitterPost;
	}

	public void setPetsitterPost(PetsitterPostDTO petsitterPost) {
		this.petsitterPost = petsitterPost;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "PetsitterReservationDTO [empId=" + empId + ", petsitterAble=" + petsitterAble + ", abilityCode="
				+ abilityCode + ", emp=" + emp + ", petsitterLog=" + petsitterLog + ", ability=" + ability
				+ ", petsitterPost=" + petsitterPost + "]";
	}
	
}
