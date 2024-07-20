package com.jpa.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.test.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
