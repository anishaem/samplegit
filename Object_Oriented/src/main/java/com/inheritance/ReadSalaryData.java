package com.inheritance;

public class ReadSalaryData {

	static double basicPay;
    double deduction;
    double bonus;

    public ReadSalaryData(double basicPay, double deduction, double bonus) {
        this.basicPay = basicPay;
        this.deduction = deduction;
        this.bonus = bonus;
    }

    public static double getBasicPay() {
        return basicPay;
    }

    public double getDeduction() {
        return deduction;
    }

    public double getBonus() {
        return bonus;
    }
}


