package com.inheritance;

public class Aggregation2 {
	//create a reference variable for parent
	Aggregation1 ag1;
	int a1;
	public Aggregation2(int a1,Aggregation1 ag1)
	{
	  this.ag1=ag1;
	  this.a1=a1;
	}
	
	public void display()
	{
		System.out.println(ag1.a + "" + ag1.b);
		System.out.println(a1);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Aggregation1 o1=new Aggregation1(4,  "parent");
Aggregation2 o=new Aggregation2(1, o1);//o1 is parent class object
o.display();

	}

}
