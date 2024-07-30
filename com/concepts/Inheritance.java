package com.sunil.com.sunil.interview.concepts;

class Base {
	public int number=10;
	public void run() {
		System.out.println("Inside A");
	}
}

class Child extends Base {
	public int number=20;
	public void run() {
		System.out.println("Inside B");
	}
	
	@Override
	public void finalize() {
		System.out.println("Object Garbage Collected...");
	}
}

public class Inheritance {
	public static void main(String[] args) {
		//for illustrating Garbage collection
		Base rfBaseGarbage = new Base();
		rfBaseGarbage = null; //this object should be Garbage collected when we request the JVM with following statement
		System.gc(); //request for Garbage collection. Before Garbage collection Objects finalize() methos will be called. 
		
		Base base = new Child();
		System.out.println(base.number);
		base.run();
			
		Child child = new Child();
		System.out.println(child.number);
		child.run();
		
		Base base2 = (Base) new Child();
		System.out.println(base2.number);
		base2.run();
		
		System.out.println(System.identityHashCode(base));
		System.out.println(base.hashCode());
	
		int i = 0;
//		while (true) {
//			Base rfBaseGarbage1 = new Base();
//			rfBaseGarbage1 = null;
//			i++;
//			System.gc();
//		}
	}
}