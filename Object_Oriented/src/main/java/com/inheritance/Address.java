package com.inheritance;

public class Address {

	String address1,address2,address3,pin;
	Student s;
	
	public Address(Student s, String address1,String address2,String address3,String pin)
	{
		this.address1=address1;
		this.address2=address2;
		this.address3=address3;
		this.pin=pin;
		this.s=s;
	}
	
	public void printAddress()
	{
		System.out.println(s.name + "" + " " +s.rollno  );
		System.out.println(address1);
		System.out.println(address2);
		System.out.println(address3);
		System.out.println(pin);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student o=new Student("Anisha", 12);
		Address ad=new Address(o, "Flat G4","Kushal Campines","Marathahalli","560037");
		//o is object parent which has a relationship with child 
		ad.printAddress();
	}

}
