package com.sunil.com.sunil.interview.concepts;

class BaseClass {
	protected int number;
	
	BaseClass(){
		number=0;
	}
	
	public void setNumber(int val){
		number=val;
	}
	
	public int getNumber(){
		return number;
	}
} 

class SubClass extends BaseClass{
		public void printBaseNumebr(){
			System.out.println("Base Number Value is :"+number);
		}
} 

public class AccessingProtected {
	protected int number1=90;
	public static void main(String[] args) {
		BaseClass bc1 = new BaseClass();
		SubClass sc1 = new SubClass();
		
		System.out.println("Value of Base Number is: "+bc1.number);
		System.out.println("Value of Sub Number is: "+sc1.number); 
		
		bc1.setNumber(10);
		System.out.println("Value from bc1.getNumber() is :"+bc1.getNumber());
		
		sc1.setNumber(25);
		System.out.println("Value from sc1.getNumber() is :"+sc1.getNumber());
	}

}
