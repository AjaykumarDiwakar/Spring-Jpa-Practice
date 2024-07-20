package com.jpa.test.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
@Entity
public class Shop {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int shop_id;
	private long reparingCst;
	private List<String> contactList;
//	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "laptop_id")
	private Laptop laptop;
	public int getShop_id() {
		return shop_id;
	}
	public void setShop_id(int shop_id) {
		this.shop_id = shop_id;
	}
	public long getReparingCst() {
		return reparingCst;
	}
	public void setReparingCst(long reparingCst) {
		this.reparingCst = reparingCst;
	}
	public List<String> getContactList() {
		return contactList;
	}
	public void setContactList(List<String> contactList) {
		this.contactList = contactList;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Shop(int shop_id, long reparingCst, List<String> contactList, Laptop laptop) {
		super();
		this.shop_id = shop_id;
		this.reparingCst = reparingCst;
		this.contactList = contactList;
		this.laptop = laptop;
	}
	@Override
	public String toString() {
		return "Shop [shop_id=" + shop_id + ", reparingCst=" + reparingCst + ", contactList=" + contactList
				+ "]";
	}
	

}
