package com.application.medcompass;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/plans")
public class CoveragePlansController {
	
	@Autowired
	private CoveragePlansService coveragePlansService;
	
	@PostMapping(value = "/new")
	public void addNewPlan(@RequestBody List<CoveragePlans> plans) throws Exception {
		
		try {
		coveragePlansService.addPlan(plans);
		}
			catch (Exception e) {
				// TODO Auto-generated catch block
				throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage(), e);
			}
		}
	
	@GetMapping(value = "/queryall")
	public List<CoveragePlans> getAllPlans(){
		
		return coveragePlansService.getAllPlans();
	}
	
		
	}
	
	
	
