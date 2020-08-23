package com.fokeswagon.fsd.dao;

import java.sql.SQLException;
import java.util.List;

import com.fokeswagon.fsd.exception.SalesException;

public interface saldao {
	
	Enquiry Add(Enquiry enq) throws SalesException, Exception;
	List<Enquiry> getopenenquiry();
	List<Enquiry> getclosedenquiry();
	Enquiry Find(Integer enquiryid);

}
