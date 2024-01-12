package com.medcompass.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.application.medcompass.CoveragePlans;

public interface PlanRepository extends JpaRepository<CoveragePlans,String> {
	
	List<CoveragePlans> findByPlanId(String planId);
	List<CoveragePlans> findAll();
	

}
