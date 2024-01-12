package com.medcompass.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.medcompass.Member;

public interface MemberProgramRepository extends JpaRepository<Member, String>{
	

}
