package com.iiht.evaluation.coronokit.dao;

import java.util.List;

import com.iiht.evaluation.corona.Exception.CMSException;
import com.iiht.evaluation.coronokit.model.ProductMaster;

public interface ProductDao {
	
ProductMaster add(ProductMaster product) throws CMSException;
	
ProductMaster save(ProductMaster product) throws CMSException;
ProductMaster getById(Integer id) throws CMSException;
	
		List<ProductMaster> getAll() throws CMSException;

		boolean deleteById(Integer id) throws CMSException;

	
}
