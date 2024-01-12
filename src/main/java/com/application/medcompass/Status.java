package com.application.medcompass;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Status {
	
	@Id
	@Column(name = "status_id")
	private String statusId = UUID.randomUUID().toString();
	@Column(name = "type_key")
	private String statusTypeKey;
	@Column(name = "description")
	private String statusDescription;

	
	
}
