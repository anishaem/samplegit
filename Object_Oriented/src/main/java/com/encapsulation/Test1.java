package com.encapsulation;

public class Test1 {
	
	private String name;
	private int age;
	
	public void setter(String a, int b)
	{
		this.name=a;
		this.age=b;
	}
	public void getter()
	{
		System.out.println("Name:" + " " + name + " " + "and" +" "+ "Age:" + " "+ age);
	}
}
