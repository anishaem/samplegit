package com.inheritance;

public class Address {

	String address;
	Student s;
	
	public Address(Student s, String address)
	{
		this.address=address;
		this.s=s;
	}
	
	public void printAddress()
	{
		System.out.println(s.name + "" + " " +s.rollno  );
		System.out.println(address);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student o=new Student("Anisha", 12);
		Address ad=new Address(o, "Bangalore");
		ad.printAddress();
	}

}
