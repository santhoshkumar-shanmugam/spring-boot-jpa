package com.santhosh.springbootjpa.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santhosh.springbootjpa.entity.Student;
import com.santhosh.springbootjpa.service.ServiceClass;

@RestController
@RequestMapping("/student")
public class Controller {

	@Autowired
	ServiceClass service;

	@PostMapping("/create")
	public String create(@RequestBody Student stu) {
		service.saveOrUpdate(stu);

		return "created successfully";
	}

	@GetMapping("/get")
	public Iterable<Student> findAll() {
		return service.findAll();
	}

	@GetMapping("/get/{id}")
	public Student getStudentById(@PathVariable int id) {
		
		return service.findById(id);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable int id) {
		
		service.deleteById(id);
		return "deleted successfully";
	}
	
	@PutMapping("/update")
	public String update(@RequestBody Student stu){
		service.saveOrUpdate(stu);
		return "updated successfully";
	}

}
