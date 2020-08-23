package com.iiht.evalution.coronakit.service;

import com.iiht.evaluation.coronokit.model.ProductMaster;
import com.iiht.evaluation.coronokit.model.VisitorKit;

public interface Userservice  {
	
	VisitorKit validateAndAdd(VisitorKit item) throws Exception;

	VisitorKit validateAndSave(VisitorKit item) throws Exception;

	boolean deleteProduct(int id);

	Userservice validateAndSave(Userservice user) throws Exception;

	ProductMaster validateAndSave(ProductMaster product);

	Integer getId();

}
