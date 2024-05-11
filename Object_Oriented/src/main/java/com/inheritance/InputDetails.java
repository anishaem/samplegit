package com.inheritance;
/*
 *
 * 
 * Write a java code to get salary slip of an employee
Class 1 to accept bonus, basic pay and deduction. 
Class 2 to calculate hra ( 5% of basic pay) and pf (20 % of basic pay)
Class 3 to calculate
 total salary which is basicPay +hra - pf+deduction+bonus and 
 then print Salary slip which has all details collected w
 hich are basic pay, bonus,deduction,hra,pf,total salary. Use constructors and aggregation

 * 
 * 
 * 
 * 
 * 
 */


//Class to accept bonus, basic pay, and deduction
class InputDetails {
 double bonus;
 double basicPay;
 double deduction;

 public InputDetails(double bonus, double basicPay, double deduction) {
     this.bonus = bonus;
     this.basicPay = basicPay;
     this.deduction = deduction;
 }
}

