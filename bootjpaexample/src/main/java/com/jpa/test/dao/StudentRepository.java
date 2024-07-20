package com.jpa.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.test.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>
{

	
}
