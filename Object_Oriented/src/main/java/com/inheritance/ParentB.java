package com.inheritance;

public class ParentB extends ParentA{

	int d;
	public void sub()
	{
		d=a-b;
		System.out.println("Differece:" + d);
	}
}
