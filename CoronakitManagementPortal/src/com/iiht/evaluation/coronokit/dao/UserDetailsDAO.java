package com.iiht.evaluation.coronokit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.NamingException;

import org.apache.catalina.User;

import com.iiht.evaluation.corona.Exception.CMSException;
import com.iiht.evaluation.coronokit.model.ProductMaster;
import com.iiht.evaluation.coronokit.model.UserDetails;

/*
 * public class UserDetailsDAO implements UserDao{ public static final String
 * sql = "SELECT * FROM users WHERE email = ? and password = ?";
 * 
 * @Override public UserDetails checkLogin(UserDetails user) throws CMSException
 * { if (user != null) { try (Connection con =
 * ConnectionFactory.getConnection(); PreparedStatement pst =
 * con.prepareStatement(sql)) { pst.setString(1, user.getUsername());
 * pst.setString(2, user.getPassword()); } catch (SQLException | NamingException
 * exp) { exp.printStackTrace(); throw new
 * CMSException("Saving the item failed!"); } } return user; }}
 */


import java.sql.*;
 
public class UserDetailsDAO {
 
    public UserDetails checkLogin(String email, String password) throws SQLException,
            ClassNotFoundException {
        String jdbcURL = "jdbc:mysql://localhost:3306/bookshop";
        String dbUser = "root";
        String dbPassword = "password";
 
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
        String sql = "SELECT * FROM users WHERE email = ? and password = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, email);
        statement.setString(2, password);
 
        ResultSet result = statement.executeQuery();
 
        UserDetails user = null;
 
        if (result.next()) {
            user = new UserDetails(dbUser, dbPassword);
          
            user.setUsername(result.getString("Username"));
          
        }
 
        connection.close();
 
        return user;
    }

	public UserDetails checkLogin(UserDetails user) {
		// TODO Auto-generated method stub
		return null;
	}


}