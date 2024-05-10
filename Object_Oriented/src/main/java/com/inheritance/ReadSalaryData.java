package com.inheritance;

import java.util.Scanner;

public class ReadSalaryData {

	double basicPay;
    double deduction;
    double bonus;

   /* public ReadSalaryData(double basicPay, double deduction, double bonus) {
        this.basicPay = basicPay;
        this.deduction = deduction;
        this.bonus = bonus;
    }*/

  public void ReadSalaryData()
  {
	  Scanner read=new Scanner(System.in);
		System.out.println("Enter basicpay");
	    this.basicPay=read.nextDouble();
	    System.out.println("Enter deduction");
		this.deduction=read.nextDouble();
		System.out.println("Enter bonus");
		this.bonus=read.nextDouble();
  }
}
