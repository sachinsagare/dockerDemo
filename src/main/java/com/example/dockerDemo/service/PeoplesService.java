package com.example.dockerDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dockerDemo.dao.PeoplesDao;
import com.example.dockerDemo.model.Person;

@Service
public class PeoplesService {

	@Autowired 
	private PeoplesDao peoplesDao;
	public List<Person> getAllPeoples() {
		return peoplesDao.findAll();
		
	}
	
}
