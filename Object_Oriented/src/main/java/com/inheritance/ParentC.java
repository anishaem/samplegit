package com.inheritance;

public class ParentC extends ParentB{

	public void product()
	{
		int p= a*b*d;
		System.out.println("Prodcut:" + p);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParentC o= new ParentC();
		o.add();
		o.sub();
		o.product();
	}

}
