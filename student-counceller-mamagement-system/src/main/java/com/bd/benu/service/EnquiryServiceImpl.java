package com.bd.benu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bd.benu.model.Enquiry;
import com.bd.benu.model.ViewEnqsFilterRequest;
@Service
public class EnquiryServiceImpl implements EnquiryService{

	@Override
	public boolean addEnquiry(Enquiry enq, Integer counsellorId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Enquiry> getAllEnquiries(Integer counsellorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Enquiry> getEnquiresWithFilter(ViewEnqsFilterRequest filterReq, Integer counsellorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Enquiry getEnquriyById(Integer enqId) {
		// TODO Auto-generated method stub
		return null;
	}

}
