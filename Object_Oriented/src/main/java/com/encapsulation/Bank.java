package com.encapsulation;

public class Bank {

	private String pinnum;

	public String getPinnum() {
		return pinnum;
	}

	public void setPinnum(String pinnum) {
		this.pinnum = pinnum;
	}
	
	public boolean validatePin(String p)
	{
	  String [] pin = {"1001","1234","1212"};
	  for (String valid:pin)
	  {
		  if(p==valid)
		  {
			 return true; 
			 
		  }
		
			  
	  }
	return false;
	}
	
	
}
