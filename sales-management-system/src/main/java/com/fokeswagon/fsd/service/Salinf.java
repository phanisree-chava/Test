package com.fokeswagon.fsd.service;

import java.util.List;

import com.fokeswagon.fsd.dao.Enquiry;

public interface Salinf {
	
Enquiry	validateandaddenq(Enquiry enq);
Enquiry Addall(Enquiry enq);
List<Enquiry> openlis();
Enquiry getstatus(int enquiryid);

}
