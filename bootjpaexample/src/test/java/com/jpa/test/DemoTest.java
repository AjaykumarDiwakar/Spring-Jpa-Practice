package com.jpa.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jpa.test.dao.StudentRepository;
import com.jpa.test.entities.Course;
import com.jpa.test.entities.Laptop;
import com.jpa.test.entities.Shop;
import com.jpa.test.entities.Student;
import com.jpa.test.entities.Teacher;

@SpringBootTest
public class DemoTest {
	@Autowired
	StudentRepository studentRepository;
	
	@Test
	public void runMe() {
	
		/*
		 * Student student=new Student(); Student student2=new Student(); Course
		 * course=new Course(); Course course2=new Course(); Teacher teacher=new
		 * Teacher(); Teacher teacher2=new Teacher(); Shop shop=new Shop(); Shop
		 * shop2=new Shop(); Laptop laptop=new Laptop(); Laptop laptop2=new Laptop();
		 * student.setStudentName("Ajay Kumar");
		 * student.setAbout("I am a Java Backend Developer");
		 * student2.setStudentName("Aman Rajput");
		 * student2.setAbout("I am MERN fullstack developer");
		 * 
		 * 
		 * 
		 * // course description
		 * 
		 * course.setCourseDescription("Ja av: full stack");
		 * course.setCourseDuration("1 year"); course.setCourseFee(19000l);
		 * 
		 * course2.setCourseDescription("Python AIML");
		 * course2.setCourseDuration("11 months"); course2.setCourseFee(10000l);
		 * 
		 * // teacher description
		 * 
		 * teacher.setTeacherName("Mr. Bhupendra Jogi");
		 * teacher2.setTeacherName("Mr. Chaggan lal Mishra");
		 * 
		 * // shop description
		 * 
		 * shop.setReparingCst(2500l); List<String> contact=new ArrayList<>();
		 * contact.add("9988776644"); contact.add("9310807934");
		 * shop.setContactList(contact);
		 * 
		 * // laptop description laptop.setBrand("DELL");
		 * laptop.setModelNumber("1234100"); laptop.setShop(shop);
		 * laptop.setStudent(student);
		 * 
		 * laptop2.setBrand("HP"); laptop2.setModelNumber("11111");
		 * laptop2.setShop(shop2); laptop2.setStudent(student2);
		 * 
		 * 
		 * List<Course>courses=new ArrayList<>(); courses.add(course);
		 * courses.add(course2);
		 * 
		 * student.setLaptop(laptop); student.setTeacher(teacher);
		 * student.setCourse(courses);
		 * 
		 * student2.setCourse(courses); student2.setLaptop(laptop2);
		 * student2.setTeacher(teacher2);
		 * 
		 * List<Student>students=new ArrayList<>(); students.add(student);
		 * students.add(student2);
		 * 
		 * List<Teacher>teachers=new ArrayList<>(); teachers.add(teacher);
		 * teachers.add(teacher2);
		 * 
		 * course.setStudent(students); course2.setStudent(students);
		 * course.setTaughtBy(teachers); course2.setTaughtBy(teachers);
		 * 
		 * teacher.setCourse(courses); teacher2.setCourse(courses);
		 * teacher.setStudent(student); teacher2.setStudent(student2);
		 * 
		 * laptop.setShop(shop); laptop.setStudent(student);
		 * 
		 * laptop2.setShop(shop2); laptop2.setStudent(student2);
		 * 
		 * 
		 * studentRepository.save(student); studentRepository.save(student2);
		 */
		 
		 
		
	}
}
