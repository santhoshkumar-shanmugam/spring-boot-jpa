package com.santhosh.springbootjpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.santhosh.springbootjpa.entity.Student;
import com.santhosh.springbootjpa.repository.Repository;

@Service
@Transactional
public class ServiceClass {
	
	@Autowired
	Repository repo;

	public void saveOrUpdate(Student stu){
		repo.save(stu);
	}
	
	public Iterable<Student> findAll(){
		return repo.findAll();
		
	}
	
	public Student findById(int id){
		return repo.findById(id).get();
	}
	
	public void deleteById(int id){
		repo.deleteById(id);
	}
}
