package com.iiht.evalution.coronakit.service;

import com.iiht.evaluation.coronokit.model.KitDetail;


public class OperationService {
			   public void FinalAmt(KitDetail user)
	   
	   { 
		  Float Total = null;
		  
		  Total += (float) (user.getQuantity() *user.getAmount());
		return;
		  
	   }}
		   
				  