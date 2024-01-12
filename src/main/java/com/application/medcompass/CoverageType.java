package com.application.medcompass;

import io.micrometer.common.util.StringUtils;

public enum CoverageType {
	
	MEDICAID, COMMERCIAL, STATE_FUNDED, MEDICARE, NONE;
	
	
	public CoverageType getTypeByName(String name) {
		
		for(CoverageType type: CoverageType.values())
			if(StringUtils.isNotEmpty(name) && type.name().equalsIgnoreCase(name))
				return type;
		
	return NONE;
		
	}

}
