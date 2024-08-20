package com.bd.benu.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bd.benu.model.Counselor;
import com.bd.benu.model.DashboardResponse;
import com.bd.benu.repo.CounselloerRepositary;
@Service
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

	@Override
	public Counselor login(String email, String pwd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DashboardResponse getDashboardInfo(Integer counsellorId) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
