package com.petnolja.semi.admin.common.dto;

import java.io.Serializable;

public class AbilityDTO implements Serializable{
	private static final long serialVersionUID = -3722490192219344930L;
	
	private int abilityCode;
	private String abilityDef;
	private String abilityFirst;
	private String abilitySecond;
	private int abilityMoney;
	
	public AbilityDTO() {
	}
	
	public AbilityDTO(int abilityCode, String abilityDef, String abilityFirst, String abilitySecond, int abilityMoney) {
		this.abilityCode = abilityCode;
		this.abilityDef = abilityDef;
		this.abilityFirst = abilityFirst;
		this.abilitySecond = abilitySecond;
		this.abilityMoney = abilityMoney;
	}
	
	public int getAbilityCode() {
		return abilityCode;
	}
	public void setAbilityCode(int abilityCode) {
		this.abilityCode = abilityCode;
	}
	public String getAbilityDef() {
		return abilityDef;
	}
	public void setAbilityDef(String abilityDef) {
		this.abilityDef = abilityDef;
	}
	public String getAbilityFirst() {
		return abilityFirst;
	}
	public void setAbilityFirst(String abilityFirst) {
		this.abilityFirst = abilityFirst;
	}
	public String getAbilitySecond() {
		return abilitySecond;
	}
	public void setAbilitySecond(String abilitySecond) {
		this.abilitySecond = abilitySecond;
	}
	public int getAbilityMoney() {
		return abilityMoney;
	}
	public void setAbilityMoney(int abilityMoney) {
		this.abilityMoney = abilityMoney;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		return "AbilityDTO [abilityCode=" + abilityCode + ", abilityDef=" + abilityDef + ", abilityFirst="
				+ abilityFirst + ", abilitySecond=" + abilitySecond + ", abilityMoney=" + abilityMoney + "]";
	}
}
