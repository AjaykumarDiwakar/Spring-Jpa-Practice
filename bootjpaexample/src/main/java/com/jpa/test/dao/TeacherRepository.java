package com.jpa.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.test.entities.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer>{

}
