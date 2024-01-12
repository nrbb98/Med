package com.application.medcompass;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
//@Component("program")
public class Program {

	@Id
	@Column(name = "program_id")
	private String programId = UUID.randomUUID().toString();
	@Column(name = "type_key")
	@JsonProperty(value = "type")
	private String type;
	@Column(name = "description")
	@JsonProperty(value = "desc")
	private String programDescription;
	@Column(name = "active_flag")
	@JsonProperty(value = "flag")
	private int activeFlag;

	public Program() {

	}

	public Program(String type, String programDescription, int activeFlag) {
		super();
		this.type = type;
		this.programDescription = programDescription;
		this.activeFlag = activeFlag;
	}

	public String getProgramId() {
		return programId;
	}

	public void setProgramId(String programId) {
		this.programId = programId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getProgramDescription() {
		return programDescription;
	}

	public void setProgramDescription(String programDescription) {
		this.programDescription = programDescription;
	}

	public int getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(int activeFlag) {
		this.activeFlag = activeFlag;
	}

}
