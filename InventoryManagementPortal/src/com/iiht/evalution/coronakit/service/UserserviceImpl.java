package com.iiht.evalution.coronakit.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.iiht.evaluation.corona.Exception.CMSException;
import com.iiht.evaluation.coronokit.dao.ProductDao;
import com.iiht.evaluation.coronokit.dao.ProductDaoImpl;
import com.iiht.evaluation.coronokit.dao.VisitorDaoImpl;
import com.iiht.evaluation.coronokit.dao.visitiorDao;

import com.iiht.evaluation.coronokit.model.ProductMaster;
import com.iiht.evaluation.coronokit.model.VisitorKit;

public class UserserviceImpl implements  Userservice {

	VisitorDaoImpl visdao;

	public UserserviceImpl() {
		visdao = new VisitorDaoImpl();
	}
	
	private boolean isIdValid(Integer id) {
		return id > 0;
	}
	
	private boolean ispersonNameValid(String personName) {
		return (personName != null && personName.length() <= 20);
	}
	private boolean isemailValid(String email) {
		return (email != null && email.length() <= 30);
	}

	private boolean iscontactNumberValid(String contactNumber) {
		return contactNumber != null;
	}
	private boolean istotalAmountValid(Double totalAmount) {
		return totalAmount>= 0;
	}
	private boolean isdeliveryAddressValid(String deliveryAddress) {
		return deliveryAddress != null;
	}
	private boolean isorderDateValid(LocalDate orderDate) {
		LocalDate today = LocalDate.now();
		return today.isAfter(orderDate) || today.isEqual(orderDate);
	}
	
	private boolean isorderFinalizedValid(Boolean orderFinalized) {
		return orderFinalized != null;
	}

	
	private boolean isValidItem(VisitorKit item) throws CMSException {
		List<String> errMsg = new ArrayList<>();

		boolean isValid = true;

		if (!isIdValid(item.getId())) {
			isValid = false;
			errMsg.add("Icode can not be null or negative or zero");
		}

		if (!ispersonNameValid(item.getPersonName())) {
			isValid = false;
			errMsg.add("Title can not be blank, title must be of 3 to 20 chars in length");
		}

		if (!isemailValid(item.getEmail())) {
			isValid = false;
			errMsg.add("PackageDate can not be a future date");
		}

		if (!iscontactNumberValid(item.getContactNumber())) {
			isValid = false;
			errMsg.add("Unit can not be null");
		}

		if (!istotalAmountValid(item.getTotalAmount())) {
			isValid = false;
			errMsg.add("Cost price can not be zero or negative");
		}

		
		if (!isdeliveryAddressValid(item.getDeliveryAddress())) {
			isValid = false;
			errMsg.add("Cost price can not be zero or negative");
		}

		if (!isorderDateValid(item.getOrderDate())) {
			isValid = false;
			errMsg.add("PackageDate can not be a future date");
		}

		if (!isorderFinalizedValid(item.getOrderFinalized())) {
			isValid = false;
			errMsg.add("Fragility can not be null");
		}

		if (!isValid) {
			throw new CMSException(errMsg.toString());
		}

		return isValid;
	}

	@Override
	public VisitorKit validateAndAdd(VisitorKit user) {
		if (user != null) {
			try {
				if (isValidItem(user))

				{
					visdao.AddnewUser(user);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return user;
	}

	@Override
	public VisitorKit validateAndSave(VisitorKit user) {
		{
			if (user != null) {
				try {
					if (isValidItem(user)) {
						visdao.addNewitem(user);
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return user;
		}
	}


	@Override
	public boolean deleteProduct(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Userservice validateAndSave(Userservice user) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductMaster validateAndSave(ProductMaster product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}

}
	