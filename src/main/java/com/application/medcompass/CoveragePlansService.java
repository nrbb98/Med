package com.application.medcompass;

import java.util.List;
import java.util.Map;

public interface CoveragePlansService {
	
	public void addPlan(List<CoveragePlans> plan);
	//public boolean isValidPlan(CoveragePlans plan);
	public List<CoveragePlans> getAllPlans();
	

}
