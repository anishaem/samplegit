package com.inheritance;

public class ChildClass extends ParentClass {

	public void diff()
	{
		int d= a-b;
		System.out.println("Difference is " + d);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		ChildClass o=new ChildClass();
		o.add();
		o.diff();
		
	}

}
