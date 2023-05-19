package com.restapiproject1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapiproject1.entity.Product;

public interface Productrepo extends JpaRepository<Product,Long>{

}
