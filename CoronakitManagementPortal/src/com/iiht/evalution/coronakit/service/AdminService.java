package com.iiht.evalution.coronakit.service;
import com.iiht.evaluation.corona.Exception.CMSException;
import com.iiht.evaluation.coronokit.model.ProductMaster;

import java.util.List;


public interface AdminService {
	
		

			ProductMaster validateAndAdd(ProductMaster product) throws CMSException;

			ProductMaster validateAndSave(ProductMaster product) throws CMSException;

			ProductMaster getItemById(int id) throws CMSException;			

			boolean deleteById(int id) throws CMSException;

				List<ProductMaster> getAllItems() throws CMSException;
		
	
	
	
}
 