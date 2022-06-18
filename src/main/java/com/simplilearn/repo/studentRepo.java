package com.simplilearn.repo;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;

import com.simplilearn.entity.student;


@Repository
public interface studentRepo extends JpaRepository<student, Long>{

}