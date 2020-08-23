package com.iiht.evaluation.coronokit.dao;



	import java.sql.Connection;
	import java.sql.Date;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;

import com.iiht.evaluation.corona.Exception.CMSException;

import com.iiht.evaluation.coronokit.model.KitDetail;
import com.iiht.evaluation.coronokit.model.VisitorKit;

	public interface visitiorDao {
		KitDetail addNewitem(VisitorKit user) throws CMSException;
		KitDetail saveorder(KitDetail kitd) throws CMSException;
		//void OrderDetails()throws CMSException;
 		KitDetail AddKititems(KitDetail kdetail) throws CMSException, NamingException;
		
		VisitorKit AddnewUser(VisitorKit vk) throws CMSException;
		
		
		List<KitDetail> ShowAll() throws CMSException, NamingException;
		
		
	
	}

		