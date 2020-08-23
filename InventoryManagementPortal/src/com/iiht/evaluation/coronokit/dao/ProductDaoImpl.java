package com.iiht.evaluation.coronokit.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

import com.iiht.evaluation.corona.Exception.CMSException;
import com.iiht.evaluation.coronokit.model.ProductMaster;



public class ProductDaoImpl implements ProductDao {
		
	

	public static final String INS_ITEM_QRY = "INSERT INTO ProductMaster(id,ProductDescription,ProductName,Cost) values(?,?,?,?)";
	public static final String UPD_ITEM_QRY = "UPDATE ProductMaster SET ProductDescription=?,ProductName=?,Cost=? WHERE id=?";
	public static final String DEL_ITEM_QRY = "DELETE FROM ProductMaster WHERE id=?";
	public static final String SEL_ITEM_QRY_BY_ID = "SELECT id,ProductDescription,ProductName,Cost FROM ProductMaster WHERE id=?";
	public static final String SEL_ALL_ITEMS_QRY = "SELECT id,ProductDescription,ProductName,Cost FROM ProductMaster";

	@Override
	public ProductMaster add(ProductMaster item) throws CMSException {
		if (item != null) {
			try (Connection con = ConnectionFactory.getConnection();
					PreparedStatement pst = con.prepareStatement(INS_ITEM_QRY)) {

				pst.setInt(1, item.getId());
				pst.setString(2, item.getProductDescription());
				pst.setString(3, item.getProductName());
				pst.setDouble(4, item.getCost());
				

				pst.executeUpdate();

			} catch (SQLException | NamingException exp) {
				exp.printStackTrace();
				throw new CMSException("Saving the item failed!");
			}
		}
		return item;
	}

	@Override
	public ProductMaster save(ProductMaster item) throws CMSException {
		if (item != null) {
			try (Connection con = ConnectionFactory.getConnection();
					PreparedStatement pst = con.prepareStatement(UPD_ITEM_QRY)) {

				pst.setInt(1, item.getId());
				pst.setString(2, item.getProductDescription());
				pst.setString(3, item.getProductName());
				pst.setDouble(4, item.getCost());

				pst.executeUpdate();

			} catch (SQLException | NamingException exp) {
				exp.printStackTrace();
				throw new CMSException("Saving the item failed!");
			}
		}
		return item;
	}

	@Override
	public boolean deleteById(Integer id) throws CMSException {
		boolean isDeleted = false;
		try (Connection con = ConnectionFactory.getConnection();
				PreparedStatement pst = con.prepareStatement(DEL_ITEM_QRY)) {

			pst.setInt(1, id);

			int rowsCount = pst.executeUpdate();

			isDeleted = rowsCount > 0;

		} catch (SQLException | NamingException exp) {
			exp.printStackTrace();
			throw new CMSException("Deleting the item failed!");
		}

		return isDeleted;
	}

	@Override
	public ProductMaster getById(Integer id) throws CMSException {
		ProductMaster item= null;

		try (Connection con = ConnectionFactory.getConnection();
				PreparedStatement pst = con.prepareStatement(SEL_ITEM_QRY_BY_ID)) {

			pst.setInt(1, id);

			ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				item = new ProductMaster();
				item.setId(rs.getInt(1));
				item.setProductDescription(rs.getString(2));
				item.setProductName(rs.getString(3));			
				item.setCost(rs.getDouble(4));
				
			}

		} catch (SQLException | NamingException exp) {
			exp.printStackTrace();
			throw new CMSException("Retrival the item failed!");
		}

		return item;
	}

	@Override
	public List<ProductMaster> getAll() throws CMSException {
		List<ProductMaster> items = new ArrayList<>();

		try (Connection con = ConnectionFactory.getConnection();
				PreparedStatement pst = con.prepareStatement(SEL_ALL_ITEMS_QRY)) {

			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				ProductMaster item = new ProductMaster();
				item.setId(rs.getInt(1));
				item.setProductDescription(rs.getString(2));
				item.setProductName(rs.getString(3));			
				item.setCost(rs.getDouble(4));				
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

}