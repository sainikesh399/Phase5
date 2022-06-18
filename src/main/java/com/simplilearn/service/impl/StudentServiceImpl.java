package com.simplilearn.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.entity.student;
import com.simplilearn.repo.studentRepo;
import com.simplilearn.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	studentRepo studentrepo;

	@Override
	public student postStudent(student student) {
		
		return studentrepo.save(student);
	}

	@Override
	public List<student> findall() {
		
		return studentrepo.findAll();
	}

	@Override
	public student deleteStudent(Long id) {
		Optional<student> optional = studentrepo.findById(id);
		if(optional.isPresent()) {
			student thisproduct = optional.get();
			studentrepo.delete(thisproduct);
		}
		return null;
	}

	@Override
	public student updateStudent(student student, Long id) {
		Optional<student> optional = studentrepo.findById(id);
		if(optional.isPresent()) {
			studentrepo.save(student);
			return student;
		}
		return null;
	}

	@Override
	public student findbyid(Long id) {
		Optional<student> optional = studentrepo.findById(id);
		if(optional.isPresent()) {
			student student = optional.get();
			return student;
		}
		return null;
	}

}