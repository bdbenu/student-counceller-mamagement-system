package com.bd.benu.service;

import java.util.List;

import com.bd.benu.model.Counselor;

public interface CounselorService {
	
	public boolean registerCounsller(Counselor counselor);
	
	public List<Counselor> counselles();
	
	public Counselor getCounsellerById(Integer cid);

}
