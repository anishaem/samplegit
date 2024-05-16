package com.encapsulation;

public class User {

	public static void main(String[] args) {
		
		Bank b=new Bank();
		b.setPinnum("101");
		String pin=b.getPinnum();
		//b.validatePin(pin);
		
		 if ((b.validatePin(pin))) {
	            System.out.println("Valid PIN");
	        } else {
	            System.out.println("Invalid PIN");
	        }
	
	}

}
