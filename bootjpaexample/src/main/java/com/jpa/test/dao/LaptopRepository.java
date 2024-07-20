package com.jpa.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.test.entities.Laptop;

public interface LaptopRepository extends JpaRepository<Laptop, Integer>{

}
