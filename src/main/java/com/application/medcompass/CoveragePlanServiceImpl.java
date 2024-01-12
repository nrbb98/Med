package com.application.medcompass;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medcompass.repository.PlanRepository;

@Service
public class CoveragePlanServiceImpl implements CoveragePlansService {

	@Autowired
	private PlanRepository planRepository;

	@Override
	public void addPlan(List<CoveragePlans> plans) {

		for (CoveragePlans plan : plans) {

			if (plan != null) {
					planRepository.save(plan);
			}
		}

	}

	

	@Override
	public List<CoveragePlans> getAllPlans() {
		return planRepository.findAll();
	}

}
