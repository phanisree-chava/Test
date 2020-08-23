package com.iiht.evaluation.coronokit.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;

import com.iiht.evaluation.corona.Exception.CMSException;
import com.iiht.evaluation.coronokit.model.KitDetail;
import com.iiht.evaluation.coronokit.model.UserDetails;
import com.iiht.evaluation.coronokit.model.VisitorKit;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class KitDaoImpl implements KitDao {

	
	public static final String INS_ProductDETAILS_QRY = "INSERT INTO KitDetail(id,productId,amount,coronakitid,quantity) values(?,?,?,?,?,?,?)";		
	public static final String SEL_KITDETAILS_QRY_BY_ID = "SELECT  id,productId,,amount,coronakitid,quantity FROM KitDetail WHERE id=?";
	public static final String SEL_ALL_KITDETAILS_QRY = "SELECT id,productId,,amount,coronakitid,quantity FROM KitDetail";

	public static final String ALL_OrderDETAILS_QRY ="SELECT id,productId,,amount,coronakitid,quantity FROM KitDetail inner join VisitorKit on KitDetail.id=VisitorKit.id";
	
	@Override
	public KitDetail AddKititems(KitDetail kitd) throws CMSException, NamingException {
		if (kitd!= null) 
		{

	    	try (java.sql.Connection con = ConnectionFactory.getConnection();
					java.sql.PreparedStatement pst = con.prepareStatement(INS_ProductDETAILS_QRY)) {

				pst.setInt(1,kitd.getId());
				pst.setInt(2,kitd.getCoronaKitId());
				pst.setInt(3, kitd.getProductId());
				pst.setInt(4, kitd.getQuantity());
				pst.setDouble(5,kitd.getAmount());
				pst.executeUpdate();
			}
			catch (SQLException exp) {
				exp.printStackTrace();							
		}}
		return kitd;
		}
	
	

	@Override
	public KitDetail getById(Integer icode) throws CMSException {
		KitDetail item = null;

		try (Connection con = ConnectionFactory.getConnection();
				PreparedStatement pst = con.prepareStatement(SEL_ITEM_QRY_BY_ID)) {

			pst.setInt(1, icode);

			ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				item = new KitDetail();
				item.setId(rs.getInt(1));
				item.setProductId(rs.getInt(2));
				item.setAmount(rs.getDouble(3));
				item.setCoronaKitId(rs.getInt(4));
				item.setQuantity(rs.getInt(5));
			}

		} catch (SQLException | NamingException exp) {
			exp.printStackTrace();
			throw new CMSException("Retrival the item failed!");
		}

		return item;
	}

	@Override
	public List<KitDetail> getAll() throws CMSException {
		List<KitDetail> items = new ArrayList<>();

		try (Connection con = ConnectionFactory.getConnection();
				PreparedStatement pst = con.prepareStatement(ALL_OrderDETAILS_QRY )) {

			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				KitDetail item = new KitDetail();
				item.setId(rs.getInt(1));
				item.setProductId(rs.getInt(2));
				item.setAmount(rs.getDouble(3));
				item.setCoronaKitId(rs.getInt(4));
				item.setQuantity(rs.getInt(5));
		
				
				items.add(item);
			}
			
			if(items.isEmpty()) {
				items=null;
			}
		} catch (SQLException | NamingException exp) {
			exp.printStackTrace();
			throw new CMSException("Retrival the item failed!");
		}
		return items;
	}


	 void getProductByProductID(int id) {
        VisitorDaoImpl product = new VisitorDaoImpl();
		KitDetail item = new KitDetail();
        for (VisitorDaoImpl prod: product) {
            if (prod.getId()== item.getId()) {
            	List<KitDetail> items = new ArrayList<>();
            	getById(id)
            }
             
                
   

	@Override
	public KitDetail getKitDetails(KitDetail KDetail) throws CMSException {
		// TODO Auto-generated method stub
		return null;
	}





}
	
	
	
	

