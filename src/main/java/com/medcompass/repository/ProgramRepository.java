package com.medcompass.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.medcompass.Program;

@Repository
public interface ProgramRepository extends JpaRepository<Program, String>{
	
	

}
