package com.application.medcompass;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/program")
public class ProgramController {
	
	@Autowired
	private ProgramService programServcie;
	
	@PostMapping(value = "/add")
	public void addProgram(@RequestBody List<Program> programs) throws Exception {
		
		programServcie.addProgram(programs);
	}

}
