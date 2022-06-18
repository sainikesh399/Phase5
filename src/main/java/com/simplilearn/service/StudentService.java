package com.simplilearn.service;

import java.util.List; 

import org.springframework.stereotype.Service;

import com.simplilearn.entity.student;

@Service
public interface StudentService {
	student postStudent(student student);
	List<student> findall();
	student findbyid(Long id);
	student deleteStudent(Long id);
	student updateStudent(student student, Long id);
	

}