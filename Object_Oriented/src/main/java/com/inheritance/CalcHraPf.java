package com.inheritance;

public class CalcHraPf extends ReadSalaryData  {

	double hra;
	double pf;
/*public CalcHraPf() {

	}*/

		public double calculateHRA() {
	      
			hra=basicPay*.05;
			return hra;
	    
	    }

	    public  double calculatePF() {
	       pf= .20 * basicPay;
	       return pf;
	    
	    }

	

}