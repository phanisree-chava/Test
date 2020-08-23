package com.iiht.evaluation.coronokit.dao;

import java.util.List;

import javax.naming.NamingException;

import com.iiht.evaluation.corona.Exception.CMSException;
import com.iiht.evaluation.coronokit.model.KitDetail;

public interface KitDao {
KitDetail getKitDetails(KitDetail KDetail) throws CMSException;
	

	
	
	<kitDetail> kitDetail getQuantityadded() throws CMSException;

	KitDetail AddKititem(KitDetail kdetail) throws CMSException;




	KitDetail AddKititems(KitDetail kitd) throws CMSException, NamingException;




	List<KitDetail> getAll() throws CMSException;

	

	

}
