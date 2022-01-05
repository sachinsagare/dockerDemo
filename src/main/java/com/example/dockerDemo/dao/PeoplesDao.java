package com.example.dockerDemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dockerDemo.model.Person;

@Repository
public interface PeoplesDao extends JpaRepository<Person, Long> {
	
	
}
