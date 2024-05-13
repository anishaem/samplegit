package com.inheritance;

public class DivisionCheck extends AdditionResult {

	public DivisionCheck(int num1, int num2) {
		
		super(num1, num2);
		
	}
	
	public boolean divisibiltyCheck()
	{
		result=super.addNum();
	
		return result%10==0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	AdditionResult a = new AdditionResult(15,20);
	int result=a.addNum();
	System.out.println("Addition Result is :" + " " + result);
	DivisionCheck d=   new DivisionCheck(10,20);
	d.divisibiltyCheck();
	if (result%10==0)
	{
		System.out.println("Result is divisible by 10");
	}
	else 
	{
		System.out.println("Result is not divisible by 10");
	}
		

	}

}
