package com.jpa.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.test.entities.Shop;

public interface ShopRepository extends JpaRepository<Shop, Integer> {

}
