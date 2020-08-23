package com.iiht.evaluation.coronokit.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.iiht.evaluation.coronokit.dao.ConnectionFactory;

public class AdminDetails {

	private String AdUsername;
	private String AdPassword;
	
	
	public String getAdUsername() {
		return AdUsername;
	}
	public void setAdUsername(String adUsername) {
		AdUsername = adUsername;
	}
	public String getAdPassword() {
		return AdPassword;
	}
	public void setAdPassword(String adPassword) {
		AdPassword = adPassword;
	}
}

