package com.sunil.com.sunil.interview.concepts;

public class Concepts1 {
	enum e1 {
		ONE,
		TWO,
		THREE{
			
		};
		};
	public static void main(String[] args) {
		
		Concepts1 c1= new Concepts1();
		
		Concepts1 c2=c1;
		Concepts1 c3 = c1;
		Concepts1 c4[] = new Concepts1[10];
		System.out.println("Comparison result C1 and C2: "+(c2.equals(c1)));
		System.out.println("Comparison result C2 and C3: "+(c2.equals(c3)));
		for (int i=0; i<c4.length;i++){
			c4[i] = new Concepts1(); 
			System.out.println("Array of object reference value is: "+ c4[i]);
		}
		
		//Array
		int[] numbers = new int[] {0,0,0,0,0};
		int[] numbers2 = new int[] {0,0,0,0,0};
		int[] numbers1 = numbers;
		
		for (int i=0;i<5;i++){
			numbers[i]=i;
		}
		
		e1 var1 = e1.ONE;
		
		System.out.println(var1.getDeclaringClass());
		System.out.println(var1.getClass());
		e1 var2 = e1.THREE;
		
		System.out.println("Equal : "+(var1.getDeclaringClass()==var2.getDeclaringClass()));
		
		System.out.println("Two Arrays are equal:"+(numbers.equals(numbers1)));
		System.out.println("Two Arrays are equal:"+(numbers1.equals(numbers2)));
	}

}