package com.bd.benu.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.bd.benu.model.Counselor;
import com.bd.benu.repo.CounselloerRepositary;

public class CounselorServiceImpl implements CounselorService{
	
	@Autowired
	private CounselloerRepositary counselloerRepositary;

	@Override
	public boolean registerCounsller(Counselor counselor) {
		
		return counselloerRepositary.save(counselor).getCid()!=null;
	}

	@Override
	public List<Counselor> counselles() {
		return counselloerRepositary.findAll();
	}

	@Override
	public Counselor getCounsellerById(Integer cid) {
		Optional<Counselor> findById = counselloerRepositary.findById(cid);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}
	

}
