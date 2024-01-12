package com.medcompass.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.medcompass.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, String>{

	List<Member> findByFirstName(String firstName);

	Optional<Member> findByMedicaidId(String medicaidId);

	List<Member> findByLastName(String lastName);

	Optional<Member> findBySocialSecurityNumber(int ssn);
	

}
