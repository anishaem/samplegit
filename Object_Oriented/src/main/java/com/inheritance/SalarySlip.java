package com.inheritance;

import java.util.Scanner;

public class SalarySlip {

	// Class to calculate total salary and print salary slip

	    InputDetails inputDetails;
	    SalaryCalculator salaryCalculator;

	    public SalarySlip(InputDetails inputDetails, SalaryCalculator salaryCalculator) {
	        this.inputDetails = inputDetails;
	        this.salaryCalculator = salaryCalculator;
	    }

	    public void printSalarySlip() {
	        double totalSalary = inputDetails.basicPay + salaryCalculator.hra - salaryCalculator.pf + inputDetails.bonus - inputDetails.deduction;
	        System.out.println("----- Salary Slip -----");
	        System.out.println("Basic PRs" + inputDetails.bonus);
	        System.out.println("Deduction: Rs" + inputDetails.deduction);
	        System.out.println("HRA: Rs" + salaryCalculator.hra);
	        System.out.println("PF: rs" + salaryCalculator.pf);
	        System.out.println("Total Salary: Rs" + totalSalary);
	    }
	

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter basic pay:");
        double basicPay = scanner.nextDouble();

        System.out.println("Enter bonus:");
        double bonus = scanner.nextDouble();

        System.out.println("Enter deduction:");
        double deduction = scanner.nextDouble();

        // Create objects for input details and salary calculator
        InputDetails inputDetails = new InputDetails(bonus, basicPay, deduction);
        SalaryCalculator salaryCalculator = new SalaryCalculator(basicPay);

        // Create salary slip object
        SalarySlip salarySlip = new SalarySlip(inputDetails, salaryCalculator);

        // Print salary slip
        salarySlip.printSalarySlip();
    }
}



