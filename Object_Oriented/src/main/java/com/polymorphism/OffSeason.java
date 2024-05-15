package com.polymorphism;

public class OffSeason extends OnSeason {



	 double finalprice;
	public double discount(double price)
	{
		//Call superclass method to calculate on-season discount
		super.discount(price);
		float offseasondiscount= 0.05f;
		return finalprice =offseasondiscount*price;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OffSeason s=new OffSeason();
		
		double finalprice=s.discount(2000);
		
		
		System.out.println("Off season discount:" + " "+ finalprice);
		System.out.println("On Season Disccount:" + "" + s.finalprice1);
	}

}
