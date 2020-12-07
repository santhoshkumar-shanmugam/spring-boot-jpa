package com.santhosh.springbootjpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.santhosh.springbootjpa.entity.Student;

public interface Repository extends CrudRepository<Student, Integer> {

}
