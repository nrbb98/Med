package com.application.medcompass;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MemberHealthCoverage {
	
	
	@Id
	private String CoverageId = UUID.randomUUID().toString();
	private CoverageType coverageType;
	private List<String> plans = new ArrayList<>();
	private Date effectiveDate;
	private Date reasesDate;
	private Date closeDate;
	private String closureReason;
	

}
