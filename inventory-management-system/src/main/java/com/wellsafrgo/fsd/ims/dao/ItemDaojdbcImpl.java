package com.wellsafrgo.fsd.ims.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.wellsfargo.fsd.ims.entity.Item;
import com.wellsfrago.fsd.ims.exception.ImsException;

public class ItemDaojdbcImpl implements Itemdao {
	
	public static final String INS_ITEM_QRY=
			"INSERT INTO item(icode,title,packageDate,fragile,unit,costprice,sellingPrice) values(?,?,?,?,?,?,?)";
	public static final String UPD_ITEM_QRY="UPDATE items SET title=?,packageDate=?,fragile=?,unit=?,cpstprice=?,sellingPrice=? WHERE icode=?";
	
	public static final String DEL_ITEM_QRY=
			"DELETE FROM items WHERE icode=?";
	public static final String SEL_ITEM_QRY_BY_ID=
			"SELECT icode,title,packageDate,fragile,unit,costprice,sellingPrice FROM items WHERE icode=?";
	public static final String SEL_ALL_ITEM_QRY=
			"SELECT icode,title,packageDate,fragile,unit,costprice,sellingPrice FROM items";


	@Override
	public Item add(Item item) throws ImsException 
	{
		//to ensure that there is no null item
		if(item!=null)
		{
			try(Connection con= ConnectionFactory.getConnection();
			
				PreparedStatement pst =con.prepareStatement(INS_ITEM_QRY))
			
			{	
			pst.setInt(1, item.getIcode());
			
			pst.setString(2, item.getTitle());
			pst.setDate(3,Date.valueOf(item.getpackageDate()));
			pst.setBoolean(4, item.getFargile());
			pst.setString(5, item.getUnit());
			pst.setDouble(6, item.getCostprice());
			pst.setDouble(7, item.getSellingPrice());
			
				pst.executeUpdate();
				
			}
			catch(SQLException exp) {			
				throw new ImsException("saving failed");
		         }
		
		}
	
		return item;
		
	}

	@Override
	public Item save(Item item)throws ImsException 
{
		if(item!=null)
		{
			try(Connection con= ConnectionFactory.getConnection();			
				PreparedStatement pst =con.prepareStatement(UPD_ITEM_QRY))
			
			{	
			pst.setString(1, item.getTitle());
			pst.setDate(2,Date.valueOf(item.getpackageDate()));
			pst.setBoolean(3, item.getFargile());
			pst.setString(4, item.getUnit());
			pst.setDouble(5, item.getCostprice());
			pst.setDouble(6, item.getSellingPrice());
			pst.setInt(7, item.getIcode());
				pst.executeUpdate();
				
			}
			catch(SQLException exp) {throw new ImsException("saving failed");
		         }
		
		}
	
		return item;
		
	
	}

	@Override
	public boolean deleteById(Integer icode) throws ImsException {
		boolean isdeleted=false;
		try(Connection con= ConnectionFactory.getConnection();			
				PreparedStatement pst =con.prepareStatement(DEL_ITEM_QRY))
			
			{	
			pst.setInt(1, icode);
				int rowsCount =pst.executeUpdate();
				isdeleted=rowsCount>0;
				
			}
		catch(SQLException exp) {throw new ImsException("deletion failed");
	         }
		
		return isdeleted;
	}

	@Override
	public Item getById(Integer icode) throws ImsException  {
		Item item =null;
		try(Connection con= ConnectionFactory.getConnection();			
				PreparedStatement pst =con.prepareStatement(SEL_ITEM_QRY_BY_ID))
			
			{	
			pst.setInt(1, icode);
			
			ResultSet rs = pst.executeQuery();
				if(rs.next())
					
				{					
					item = new Item();
					item.setIcode(rs.getInt(1));
					item.setTitle(rs.getString(2));
					item.setpackageDate(rs.getDate(3).toLocalDate());
					
					//((rs.getDate(3)).toLocalDate());
					
					//item.setpackageDate(rs.getDate(3));
					item.setFargile(rs.getBoolean(4));
					item.setUnit(rs.getString(5));
					item.setCostprice(rs.getDouble(6));
					item.setSellingPrice(rs.getDouble(7));
					
					
			}
				
			}
		catch(SQLException exp) {throw new ImsException("retival failed");
	         }
		
		return item;
	}

	

	@Override
	public List<Item> getAll() throws ImsException 
	{
		
		List <Item> items =new ArrayList<>();
		try(Connection con= ConnectionFactory.getConnection();			
				PreparedStatement pst =con.prepareStatement(SEL_ALL_ITEM_QRY))
			
			{		
			ResultSet rs = pst.executeQuery();
		while(rs.next())
					
				{
					
				Item item = new Item();
					item.setIcode(rs.getInt(1));
					item.setTitle(rs.getString(2));
					item.setpackageDate(rs.getDate(3).toLocalDate());
					item.setFargile(rs.getBoolean(4));
					item.setUnit(rs.getString(5));
					item.setCostprice(rs.getDouble(6));
					item.setSellingPrice(rs.getDouble(7));
					items.add(item);
					
			}
				if(items.isEmpty())
					items=null;
			}
		catch(SQLException exp) {
			throw new ImsException("retival failed");
	         }
		
		return items;
	}
	
	

}
