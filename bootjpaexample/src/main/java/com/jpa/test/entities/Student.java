package com.jpa.test.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="jpa_student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
 private int studentId;
 private String studentName;
 private String about;
 @ManyToMany(mappedBy ="student",cascade = CascadeType.ALL)
 private List<Course> course;
 
 @OneToOne(mappedBy = "student",cascade=CascadeType.ALL)
 private Laptop laptop;
 
 @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
 private Teacher teacher;

public int getStudentId() {
	return studentId;
}

public void setStudentId(int studentId) {
	this.studentId = studentId;
}

public String getStudentName() {
	return studentName;
}

public void setStudentName(String studentName) {
	this.studentName = studentName;
}

public String getAbout() {
	return about;
}

public void setAbout(String about) {
	this.about = about;
}

public Laptop getLaptop() {
	return laptop;
}

public void setLaptop(Laptop laptop) {
	this.laptop = laptop;
}

public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public List<Course> getCourse() {
	return course;
}

public void setCourse(List<Course> course) {
	this.course = course;
}

public Teacher getTeacher() {
	return teacher;
}

public void setTeacher(Teacher teacher) {
	this.teacher = teacher;
}

public Student(int studentId, String studentName, String about, List<Course> course, Laptop laptop, Teacher teacher) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.about = about;
	this.course = course;
	this.laptop = laptop;
	this.teacher = teacher;
}

@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", about=" + about + ", course="
			+ course + ", laptop=" + laptop + "]";
}


 
}
