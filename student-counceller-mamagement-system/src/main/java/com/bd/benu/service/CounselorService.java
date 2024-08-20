package com.bd.benu.service;

import java.util.List;

import com.bd.benu.model.Counselor;
import com.bd.benu.model.DashboardResponse;

public interface CounselorService {
	
	public boolean registerCounsller(Counselor counselor);
	
	public List<Counselor> counselles();
	
	public Counselor getCounsellerById(Integer cid);
	
	public Counselor login(String email, String pwd);
	
	public DashboardResponse getDashboardInfo(Integer counsellorId);

}
