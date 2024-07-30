package com.sunil.com.sunil.interview.concepts.preparation2;

import com.sunil.com.sunil.interview.concepts.AccessingProtected;

public class AccessProtectedOutsidePackage extends AccessingProtected{
	String a;
	public static void main(String[] args) {
		AccessingProtected bc1 = new AccessingProtected();
		//bc1.number1;  //error: cannot access using base class reference. 

		AccessProtectedOutsidePackage ac1 = new AccessProtectedOutsidePackage();
	
	alabel: 
		System.out.println(ac1.number1);
	}

}
