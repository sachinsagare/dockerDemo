package com.example.dockerDemo.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dockerDemo.model.Person;
import com.example.dockerDemo.service.PeoplesService;

@RestController 
public class PersonController {
@Autowired
private PeoplesService peopleService;

	@GetMapping("/")
	public String app() {
		return "Sample App";
	}
	@GetMapping("/getPeoples")
	public List<Person> getAllPeople() {
		return peopleService.getAllPeoples();
	}

	@GetMapping("/getPeoples/names")
	public List<String> peoplenames() {
		return peopleService.getAllPeoples().stream()
				.map(p -> p.getFirst() + " " + p.getLast())
				.collect(Collectors.toList());
	}
	
	@PostMapping("/saveDetails")
	public Person create(@RequestBody Person p) {
		return null; // this is not ready in service peopleService.save(p);
	}
	
	

}