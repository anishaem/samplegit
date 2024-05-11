package com.inheritance;

//Class to calculate HRA (5% of basic pay) and PF (20% of basic pay)
class SalaryCalculator {
 double basicPay;
 double hra;
 double pf;

 public SalaryCalculator(double basicPay) {
     this.basicPay = basicPay;
     this.hra = 0.05 * basicPay;
     this.pf = 0.20 * basicPay;
 }
}
