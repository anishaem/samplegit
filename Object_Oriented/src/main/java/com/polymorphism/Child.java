package com.polymorphism;

public class Child extends Parent {

	public void print()
	{super.print();//super keyword is uded to call Parent class method
		System.out.println("Call  from Child");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child c = new Child();

c.print();


	}

}
