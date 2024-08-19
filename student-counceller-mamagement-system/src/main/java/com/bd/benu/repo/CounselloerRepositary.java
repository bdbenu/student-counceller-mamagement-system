package com.bd.benu.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bd.benu.model.Counselor;

public interface CounselloerRepositary extends JpaRepository<Counselor, Serializable>{
	
public Counselor findByEmail(String email);

}
