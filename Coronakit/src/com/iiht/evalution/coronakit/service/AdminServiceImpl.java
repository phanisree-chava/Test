package com.iiht.evalution.coronakit.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.iiht.evaluation.corona.Exception.CMSException;
import com.iiht.evaluation.coronokit.dao.ProductDaoImpl;
import com.iiht.evaluation.coronokit.model.ProductMaster;


public class AdminServiceImpl implements AdminService {

	ProductDaoImpl productdao;

	public AdminServiceImpl() {
		productdao = new ProductDaoImpl();
	}

	private boolean isIdValid(Integer id) {
		return id > 0;
	}

	
	private boolean isproductDescriptionValid(String ProductDescription) {
		return ProductDescription != null && (ProductDescription.length() >= 3 || ProductDescription.length() <= 20);
	}
	private boolean isproductNameValid(String ProductName) {
		return ProductName != null && (ProductName.length() >= 3 || ProductName.length() <= 20);
	}

	private boolean isCostValid(Double Cost) {
		return Cost >= 0;
	}
	
	private boolean isValidItem(ProductMaster product) throws Exception {
		List<String> errMsg = new ArrayList<>();

		boolean isValid = true;

		if (!isIdValid(product.getId())) {
			isValid = false;
			errMsg.add("Icode can not be null or negative or zero");
		}

		if (!isproductDescriptionValid(product.getProductDescription())) {
			isValid = false;
			errMsg.add("Title can not be blank, title must be of 3 to 20 chars in length");
		}

		if (!isproductNameValid(product.getProductName())) {
			isValid = false;
			errMsg.add("Title can not be blank, title must be of 3 to 20 chars in length");
		}

		if (!isCostValid(product.getCost())) {
			isValid = false;
			errMsg.add("Cost price can not be zero or negative");
		}

		if (!isValid) {
			errMsg.toString();
		}

		return isValid;
	}

	
	
	
	@Override
	public ProductMaster validateAndAdd(ProductMaster item) throws CMSException {
		if(item!=null) {
			try {
				if(isValidItem(item)) {
					productdao.add(item);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return item;
	}

	@Override
	public ProductMaster validateAndSave(ProductMaster item) throws CMSException {
		if(item!=null) {
			try {
				if(isValidItem(item)) {
					productdao.save(item);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return item;
	}

	@Override
	public boolean deleteById(int id) throws CMSException {
		return productdao.deleteById(id);
	}

	@Override
	public ProductMaster getItemById(int id) throws CMSException {
		return productdao.getById(id);
	}

	@Override
	public List<ProductMaster> getAllItems() throws CMSException {
		return productdao.getAll();
	}

	
	

}