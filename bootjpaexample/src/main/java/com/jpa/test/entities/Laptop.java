package com.jpa.test.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "jpa_laptop")
public class Laptop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int laptopId;
	private String modelNumber;
	private String brand;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "student_id")
	private Student student;
//	(cascade = CascadeType.ALL)
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "shop_id")
	private Shop shop;

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public int getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(int laptopId, String modelNumber, String brand, Student student,Shop shop) {
		super();
		this.laptopId = laptopId;
		this.modelNumber = modelNumber;
		this.brand = brand;
		this.student = student;
		this.shop=shop;
		
	}

	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", modelNumber=" + modelNumber + ", brand=" + brand +",shop"+shop+"]";
	}
	
	
}
