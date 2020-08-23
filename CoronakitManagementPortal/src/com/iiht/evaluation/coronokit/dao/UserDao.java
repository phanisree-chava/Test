package com.iiht.evaluation.coronokit.dao;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.catalina.User;

import com.iiht.evaluation.corona.Exception.CMSException;
import com.iiht.evaluation.coronokit.model.ProductMaster;
import com.iiht.evaluation.coronokit.model.UserDetails;
import com.mysql.jdbc.Connection;

public interface UserDao{

	UserDetails checkLogin(UserDetails user) throws CMSException;
	
	
	
	



}