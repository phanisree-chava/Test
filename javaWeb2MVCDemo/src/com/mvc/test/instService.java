package com.mvc.test;

public class instService {
	
	public Double cal(Double princ, Double anr, int emi)
	{
		
		int nm=8;
		
		
		Double amt= princ*anr*(1+anr)*nm/(1+anr)*nm-1;
		
		return amt;
	}

	
	
}
