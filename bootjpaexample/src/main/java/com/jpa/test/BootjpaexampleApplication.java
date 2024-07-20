package com.jpa.test;

import java.util.ArrayList;
import java.util.List;

//import java.sql.ResultSet;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.CourseRepository;
import com.jpa.test.dao.LaptopRepository;
import com.jpa.test.dao.ShopRepository;
import com.jpa.test.dao.StudentRepository;
import com.jpa.test.dao.TeacherRepository;
import com.jpa.test.entities.Course;
//import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.Laptop;
import com.jpa.test.entities.Shop;
import com.jpa.test.entities.Student;
import com.jpa.test.entities.Teacher;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(BootjpaexampleApplication.class, args);
		/*
		 * UserRepository userRepository=context.getBean(UserRepository.class); // User
		 * user=new User(); // user.setName("Ajay Kumar"); // user.setCity("Ghaziabad");
		 * // user.setStatus("I am Learning Java"); // User user1=new User(); //
		 * user1.setName("Aman"); // user1.setCity("Ghaziabad"); //
		 * user1.setStatus("I am Learning Python"); // List<User>
		 * users=List.of(user,user1); //
		 * Iterable<User>iterable=userRepository.saveAll(users); // for(User
		 * el:iterable) { // System.out.println(el); // } // // to save a single object
		 * // User user1=userRepository.save(user); // System.out.println(user1);
		 * 
		 * 
		 * //get object
		 * 
		 * // Optional<User> user=userRepository.findById(1); // List<User>
		 * users=userRepository.findAllUser(); // List<User>
		 * users=userRepository.getUserByName("Updesh"); // List<User>
		 * users=userRepository.getUsers("Updesh"); List<User>
		 * users=userRepository.getUsers("Updesh"); for(User u:users) {
		 * System.out.println(u); }
		 */
		
		/*
		 * LaptopRepository laptopRepository=context.getBean(LaptopRepository.class);
		 * StudentRepository studentRepository=context.getBean(StudentRepository.class);
		 * Student student=new Student(); student.setStudentName("Ajay Kumar");
		 * student.setAbout("He is good"); Laptop laptop=new Laptop();
		 * laptop.setBrand("Dell"); laptop.setModelNumber("1234");
		 * laptop.setStudent(student); student.setLaptop(laptop); //
		 * studentRepository.save(student); laptopRepository.save(laptop);
		 * 
		 * 
		 */
		
		
		
		
//		********************************************************************************************************************************
		ShopRepository shopRepository=context.getBean(ShopRepository.class);
		TeacherRepository teacherRepository=context.getBean(TeacherRepository.class);
		LaptopRepository laptopRepository=context.getBean(LaptopRepository.class);
		StudentRepository studentRepository=context.getBean(StudentRepository.class);
		CourseRepository courseRepository=context.getBean(CourseRepository.class);
		Student student=new Student();
		Student student2=new Student();
		Course course=new Course();
		Course course2=new Course();
		Teacher teacher=new Teacher();
		Teacher teacher2=new Teacher();
		Shop shop=new Shop();
		Shop shop2=new Shop();
		Laptop laptop=new Laptop();
		Laptop laptop2=new Laptop();
		student.setStudentName("Ajay Kumar");
		student.setAbout("I am a Java Backend Developer");
		student2.setStudentName("Aman Rajput");
		student2.setAbout("I am MERN fullstack developer");
		
		
		
//		course description
		
		course.setCourseDescription("Ja av: full stack");
		course.setCourseDuration("1 year");
		course.setCourseFee(19000l);
		
		course2.setCourseDescription("Python AIML");
		course2.setCourseDuration("11 months");
		course2.setCourseFee(10000l);
	
//		teacher description
		
		teacher.setTeacherName("Mr. Bhupendra Jogi");
		teacher2.setTeacherName("Mr. Chaggan lal Mishra");
		
//		shop description
		
		shop.setReparingCst(2500l);
		List<String> contact=new ArrayList<>();
		contact.add("9988776644");
		contact.add("9310807934");
		shop.setContactList(contact);
		
//		laptop description
		 laptop.setBrand("DELL");
		 laptop.setModelNumber("1234100");
		 laptop.setShop(shop);
		 laptop.setStudent(student);
		 
		 laptop2.setBrand("HP");
		 laptop2.setModelNumber("11111");
		 laptop2.setShop(shop2);
		 laptop2.setStudent(student2);
		 
		 
		 List<Course>courses=new ArrayList<>();
		 courses.add(course);
		 courses.add(course2);
		 
		 student.setLaptop(laptop);
		 student.setTeacher(teacher);
		 student.setCourse(courses);
		 
		 student2.setCourse(courses);
		 student2.setLaptop(laptop2);
		 student2.setTeacher(teacher2);
		 
		 List<Student>students=new ArrayList<>();
		 students.add(student);
		 students.add(student2);
		 
		 List<Teacher>teachers=new ArrayList<>();
		 teachers.add(teacher);
		 teachers.add(teacher2);
		 
		 course.setStudent(students);
		 course2.setStudent(students);
		 course.setTaughtBy(teachers);
		 course2.setTaughtBy(teachers);
//		 courseRepository.save(course);
//		 courseRepository.save(course2);
//		 
		 
//		 teacherRepository.save(teacher);
//		 teacherRepository.save(teacher2);
		 
		 teacher.setCourse(courses);
		 teacher2.setCourse(courses);
		 teacher.setStudent(student);
		 teacher2.setStudent(student2);
		 
		 laptop.setShop(shop);
		 laptop.setStudent(student);
		 
		 laptop2.setShop(shop2);
		 laptop2.setStudent(student2);
		 
		 
		 
//		 shopRepository.save(shop2);
//		 shopRepository.save(shop);
//		 laptopRepository.save(laptop);
//		 laptopRepository.save(laptop2);
	
		 studentRepository.save(student);
		 studentRepository.save(student2);
	

		
	}

}
