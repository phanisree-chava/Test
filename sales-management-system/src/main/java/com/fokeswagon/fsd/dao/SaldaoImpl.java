package com.fokeswagon.fsd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.fokeswagon.fsd.exception.SalesException;

public class SaldaoImpl implements saldao {
	public static final String Ins_sal_qry=
			"INSERT INTO enquiry(enquiryid,Customername,mobile,vehicletype,budgetForm,Status,tobudget,frombudget) values(?,?,?,?,?,?,?,?,?)";
 public static final String lis_open_qry="Select *from enquiry where enquiryid=? and status=?";
 public static final String lis_closed_qry="Select *from enquiry where enquiryid=? and status=?";
 public static final String find_qry="Select * from enquiry where enquiryid=?";

	
	public Enquiry Add(Enquiry enq) throws SalesException
	{
		if(enq!=null)
		{
			try(Connection con= ConnectionFactory.getconnection();
					PreparedStatement pst =con.prepareStatement(Ins_sal_qry))
			{ pst.setInt(1, enq.getEnquiryid());
			pst.setString(2,enq.getCustomername());
			pst.setDouble(3,enq.getMobile());
			pst.setString(4,enq.getVehicletype());
			pst.setString(6,enq.getBudgetForm());
			pst.setString(5,enq.getTobudget());
			pst.executeUpdate();
			} catch (SQLException e) {
				throw new SalesException("saving not done");
			}
			
			}
		
		
	
		return enq;
	}
	public List<Enquiry> getopenenquiry() {
		// TODO Auto-generated method stub
		return null;
	}
	public List<Enquiry> getclosedenquiry() {
		// TODO Auto-generated method stub
		return null;
	}
	public Enquiry Find(Integer enquiryid) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
