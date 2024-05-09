package com.inheritance;

public class CalcHraPf extends ReadSalaryData  {

public CalcHraPf() {
	
	super(getBasicPay(), basicPay, basicPay);
}

	

		public double calculateHRA(double basicPay) {
	        return 0.05 * basicPay;
	    
	    }

	    public  double calculatePF(double basicPay) {
	        return 0.20 * basicPay;
	    
	    }

	

}
