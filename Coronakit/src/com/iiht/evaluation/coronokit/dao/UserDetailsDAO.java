package com.iiht.evaluation.coronokit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.NamingException;

import org.apache.catalina.User;

import com.iiht.evaluation.corona.Exception.CMSException;
import com.iiht.evaluation.coronokit.model.ProductMaster;
import com.iiht.evaluation.coronokit.model.UserDetails;

public class UserDetailsDAO implements UserDao{
	 public static final String sql = "SELECT * FROM users WHERE email = ? and password = ?";

	 @Override
		public UserDetails checkLogin(UserDetails user) throws CMSException {
			if (user != null) {
				try (Connection con = ConnectionFactory.getConnection();
						PreparedStatement pst = con.prepareStatement(sql))
								{
							pst.setString(1, user.getUsername());
							pst.setString(2, user.getPassword());
								} catch (SQLException | NamingException exp) {
									exp.printStackTrace();
									throw new CMSException("Saving the item failed!");
								}
							}
							return user;
	 }
	 }