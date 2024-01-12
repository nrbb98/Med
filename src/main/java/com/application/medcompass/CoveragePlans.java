package com.application.medcompass;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CoveragePlans {
	
	@Id
	private String planId;
	private String planDescription;
	private boolean isActive;
	
	
	public String getPlanId() {
		return planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}
	public String getPlanDescription() {
		return planDescription;
	}
	public void setPlanDescription(String planDescription) {
		this.planDescription = planDescription;
	}
	
	
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
}
