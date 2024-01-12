package com.application.medcompass;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/member")
public class MemberController {

	@Autowired
	private MemberService memberService;

	@PostMapping(value = "/new")
	public void createMember(@RequestBody List<Member> member) {

		try {
			for (Member m : member)
				memberService.addNewMember(m);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage(), e);
		}

	}

	@GetMapping(value = "/findAll")

	public List<Member> getAllMembers() {

		return memberService.getMembers();
	}

	@GetMapping(value = "/id/{id}")

	public Optional<Member> getMemberById(@PathVariable("id") String id) {

		return memberService.searchByMedicaidId(id);
	}

	@GetMapping(value = "/first-name/{fname}")
	public List<Member> getMemberByFirstName(@PathVariable("fname")String firstname) {

		return memberService.searchByFirstName(firstname);

	}

	@GetMapping(value = "/last-name/{lname}")
	public List<Member> getMemberByLastName(@PathVariable("lname") String lastName) {

		return memberService.searchByFirstName(lastName);

	}
	
	@GetMapping(value = "/ssn/{ssn}")
	public Optional<Member> getMemberBySSN(@PathVariable("ssn") int ssn){
		return memberService.searchBySSN(ssn);
	}
	

}
