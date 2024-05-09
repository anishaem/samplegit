package com.inheritance;

public class ChildB extends ParentH {

	public void product()
	{
		int p= a*b;
		System.out.println("Product:" + p);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildB o =new ChildB();
		o.add();
		o.product();
	}

}
