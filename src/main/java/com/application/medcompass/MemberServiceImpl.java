package com.application.medcompass;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medcompass.repository.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberRepository memberRepository;

	/*
	 * @Autowired public MemberServiceImpl(Program program) { //
	 * System.out.println(program); }
	 */
	@Override
	public void addNewMember(Member member) throws Exception {
		
		if(member != null)
			memberRepository.save(member);
		else
			throw new Exception("Unable to create Member, check the details provided");
		
	}

	@Override
	public Optional<Member> searchByMedicaidId(String medicaidId) {
		// TODO Auto-generated method stub
		return memberRepository.findByMedicaidId(medicaidId);
	}

	@Override
	public List<Member> searchByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return memberRepository.findByFirstName(firstName);
	}

	@Override
	public List<Member> searchByLastName(String lastName) {
		// TODO Auto-generated method stub
		return memberRepository.findByLastName(lastName);
	}

	@Override
	public List<Member> getMembers() {
		// TODO Auto-generated method stub
		List<Member> memberInfo = memberRepository.findAll();
		
		return memberInfo;
		
	}

	@Override
	public Optional<Member> searchBySSN(int ssn) {
		// TODO Auto-generated method stub
		
		return memberRepository.findBySocialSecurityNumber(ssn) ;
	}
	

}
