package com.application.medcompass;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medcompass.repository.ProgramRepository;

@Service
public class ProgramServiceImpl implements ProgramService {
	
	@Autowired
	private ProgramRepository programRepository;

	@Override
	public void addProgram(List<Program> programs)throws Exception {
		
		
		
		if(!(programs.isEmpty())) {
			
			programRepository.saveAll(programs);
		}
		
		else
			throw new Exception("not a valid Program Type/Description");
		
	}
	
		

}
