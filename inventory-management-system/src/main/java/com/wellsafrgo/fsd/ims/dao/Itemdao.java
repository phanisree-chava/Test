package com.wellsafrgo.fsd.ims.dao;

import java.util.List;

import com.wellsfargo.fsd.ims.entity.Item;
import com.wellsfrago.fsd.ims.exception.ImsException;

public interface Itemdao {
	
	Item add(Item item) throws ImsException;
	
	Item save(Item item) throws ImsException;
	boolean deleteById(Integer icode) throws ImsException;
	
	Item getById(Integer icode) throws ImsException;
	List<Item> getAll() throws ImsException;
	
	

}
