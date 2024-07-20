package com.jpa.test.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int courseId;
	private long courseFee;
	private String courseDuration;
	private String courseDescription;
//	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//	@JoinColumn(name = "teacher_id")
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(joinColumns = @JoinColumn(name = "teacher_id"),
	inverseJoinColumns = @JoinColumn(name="course_id")
			)
	private List<Teacher> taughtBy;
	
	@ManyToMany(fetch = FetchType.LAZY)
//	@JoinColumn(name="student_id")
	private List<Student> student;
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public long getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(long courseFee) {
		this.courseFee = courseFee;
	}
	public String getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}
	

	public List<Teacher> getTaughtBy() {
		return taughtBy;
	}
	public void setTaughtBy(List<Teacher> taughtBy) {
		this.taughtBy = taughtBy;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	public Course(int courseId, long courseFee, String courseDuration, String courseDescription, List<Teacher> taughtBy,
			List<Student> student) {
		super();
		this.courseId = courseId;
		this.courseFee = courseFee;
		this.courseDuration = courseDuration;
		this.courseDescription = courseDescription;
		this.taughtBy = taughtBy;
		this.student = student;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseFee=" + courseFee + ", courseDuration=" + courseDuration
				+ ", courseDescription=" + courseDescription + ", taughtBy=" + taughtBy + "]";
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
