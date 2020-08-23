package com.iiht.evaluation.coronokit.dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

import com.iiht.evaluation.corona.Exception.CMSException;
import com.iiht.evaluation.coronokit.model.KitDetail;
import com.iiht.evaluation.coronokit.model.OrderSummary;
import com.iiht.evaluation.coronokit.model.VisitorKit;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class VisitorDaoImpl implements visitiorDao {

	//public static final String INS_ITEM_QRY = "INSERT INTO items(icode,title,packageDate,fragile,unit,costPrice,sellingPrice) values(?,?,?,?,?,?,?)";
	public static final String INS_UserDETAILS_QRY = "INSERT INTO VisitorKit(id,personName,email,contactNumber,totalAmount,deliveryAddress,orderDate,orderFinalized) values(?,?,?,?,?,?,?,?)";
	public static final String INS_ProductDETAILS_QRY = "INSERT INTO ProductMaster(kid,coronakitid,productId,quantity,amount) values(?,?,?,?,?)";
	public static final String UPD_ProductDETAILS_QRY = "UPDATE ProductMaster Set p.pid=?,p.productDescription=?,p.productName=?,p.cost=? FROM ProductMaster p INNERJOIN KitDetail k WHERE p.id= k.id";
	public static final String DEL_KITDETAILS_QRY = "DELETE FROM kit WHERE kid=?";
	public static final String SEL_KITDETAILS_QRY_BY_ID = "SELECT id,productDescription,productName,quantity,amount FROM ProductMaster WHERE id=?";
	public static final String SEL_ALL_KITDETAILS_QRY = "SELECT kid,coronakitid,productId,quantity,amount FROM kit";
	public static final String ALL_OrderDETAILS_QRY ="SELECT c.id, c.PersonName, c.OrderDate,c.contactNumber FROM c CoronaKit INNER JOIN k.id.k.product,k.quantity,k.amount FROM KitDetails k "
			+ "INNER JOIN CoronaKit c on KitDetail k on c.id=k.id";
	public static final String SEL_SHOW_ALL_QRY ="SELECT * FROM FROM KitDetail k INNER JOIN VisitorKit v ON k.id=v.id";
	@Override
	public KitDetail saveorder(KitDetail kitd) throws CMSException {

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
			} catch (SQLException | NamingException exp) {
				exp.printStackTrace();
				throw new CMSException("Saving the item failed!");
			}
		}
		return kitd;
	}





	@Override
	public VisitorKit AddnewUser(VisitorKit vk) throws CMSException {

		if (vk!= null) {
			try (java.sql.Connection con = ConnectionFactory.getConnection();
					java.sql.PreparedStatement pst = con.prepareStatement(INS_UserDETAILS_QRY)) {

				pst.setInt(1,  vk.getId());
				pst.setString(2, vk.getPersonName());
				pst.setString(3, vk.getEmail());
				pst.setString(4, vk.getContactNumber());
				pst.setDouble(5, vk.getTotalAmount());
				pst.setString(6, vk.getDeliveryAddress());
				pst.setDate(7,Date.valueOf(vk.getOrderDate()));
				pst.setBoolean(8,vk.getOrderFinalized());
				pst.executeUpdate();

			} catch (SQLException | NamingException exp) {
				exp.printStackTrace();
				throw new CMSException("Saving the item failed!");
			}
		}
		return vk;
	}



	/*@Override
	public void OrderDetails()   throws CMSException {
			List<Item> items = new ArrayList<>();
			try (Connection con = ConnectionFactory.getConnection();
			PreparedStatement pst = con.prepareStatement(ALL_OrderDETAILS_QRY))
			{
				ResultSet rs = pst.executeQuery();

				while (rs.next()) {

					VisitorKit vk =new VisitorKit();
					pst.setInt(1,  vk.getId());
					pst.setString(2, vk.getPersonName());
					pst.setDate(3,Date.valueOf(vk.getOrderDate()));
					pst.setString(4, vk.getContactNumber());
					items.add(vk);
					KitDetail kitd = new KitDetail();
					pst.setInt(1,kitd.getId());
					pst.setInt(2,kitd.getCoronaKitId());
					pst.setInt(3, kitd.getProductId());
					pst.setInt(4, kitd.getQuantity());
					pst.setInt(5,kitd.getAmount());
					items.addAll(kitd);

				}

				if(items.isEmpty()) {
					items=null;
				} catch (SQLException exp) {
					throw new CMSException("Saving the item failed!");
				}
			}
			return;
		}
	}*/




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
	public List<KitDetail>  ShowAll() throws CMSException, NamingException {


		List<KitDetail> items = new ArrayList<>();

		try (java.sql.Connection con = ConnectionFactory.getConnection();
				java.sql.PreparedStatement pst = con.prepareStatement(SEL_SHOW_ALL_QRY)) {

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






	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}





	@Override
	public KitDetail addNewitem(VisitorKit user) throws CMSException {
		// TODO Auto-generated method stub
		return null;
	}





}




