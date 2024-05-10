package com.inheritance;

public class TotalSalary extends CalcHraPf {

	double totalSalary;
	
	/*public TotalSalary ()
	{
		super();
	}*/
	
	public double totalSalary()
	{
		totalSalary=basicPay +hra - pf+deduction+bonus;
		return totalSalary;
	}

	public void getSalarySlip()
	
	{
		System.out.println("\n\b****Salary Slip****");
		System.out.println("basicPay:-" + " " + basicPay);

		System.out.println("HRA:-" + " " + hra);

		System.out.println("Bonus:-" + " " + bonus);

		System.out.println("Deduction:-" + " " + deduction);

		System.out.println("PF:-" + " " + pf);

		System.out.println("totalSalary:-" + " " +totalSalary);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TotalSalary ob =new TotalSalary();
		ob.ReadSalaryData();
		ob.calculateHRA();
		ob.calculatePF();
		ob.totalSalary();
		ob.getSalarySlip();

	}

}