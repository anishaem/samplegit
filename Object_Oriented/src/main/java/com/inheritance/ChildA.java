package com.inheritance;

public class ChildA extends ParentH {

	public void diff()
	{
		int d=a-b;
		System.out.println("Difference: " + d);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChildA o =new ChildA();
o.add();
o.diff();

	}

}
