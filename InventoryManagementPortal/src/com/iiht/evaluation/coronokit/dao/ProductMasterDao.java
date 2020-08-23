package com.iiht.evaluation.coronokit.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

import com.iiht.evaluation.corona.Exception.CMSException;
import com.iiht.evaluation.coronokit.model.AdminDetails;
import com.iiht.evaluation.coronokit.model.ProductMaster;
import com.iiht.evaluation.coronokit.model.UserDetails;



/*
 * public class ProductMasterDao { public static final String sql =
 * "SELECT * FROM users WHERE email = ? and password = ?";
 * 
 * @Override public AdminDetails checkLogin(AdminDetails admin) throws
 * CMSException { if (admin != null) { try (Connection con =
 * ConnectionFactory.getConnection(); PreparedStatement pst =
 * con.prepareStatement(sql)) { pst.setString(1,admin.getAdUsername());
 * pst.setString(2,admin.getAdPassword()); } catch (SQLException |
 * NamingException exp) { exp.printStackTrace(); throw new
 * CMSException("Saving the item failed!"); } } return user; } }
 */