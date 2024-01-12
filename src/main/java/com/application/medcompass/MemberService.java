package com.application.medcompass;

import java.util.List;
import java.util.Optional;

public interface MemberService {

	public void addNewMember(Member member) throws Exception;
	public Optional<Member> searchByMedicaidId(String id);
	public List<Member> searchByFirstName(String firstName);
	public List<Member> searchByLastName(String lastName);
	public List<Member> getMembers();
	public Optional<Member> searchBySSN(int ssn);
}
