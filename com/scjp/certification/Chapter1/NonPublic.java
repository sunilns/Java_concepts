package Chapter1;

import Chapter1.Concepts; //You CAN import Default class within Same package! not visible
 
import Chapter1.SecondRun; //importing class within same package! 
import Creatures.DefaultClass;

class NonPublic {
	//Non public class, source file name and class name does not need to match
	//or file name can be same as non-public class name
	
	//Inner Class can be private or Protected or Public or Default
	public class PrivateClass {
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//declaring variable type of Default class in diff package. 
		 DefaultClass D1 = new DefaultClass(); //not visible in other package!
		
		Concepts c1 = new Concepts(); //accessing default class within same package 
		c1.myMethod(1, 2);
		//Final concept
		final String strRef; 
		String objFirst = new String("Sunil");
		String objTwo = "Shetty";
		strRef = objFirst;
		//strRef = objTwo;   //reference cannot point to diff object
	    objFirst=objFirst.replace('u', 'U');//the object final reference is poiting can change. 
	    //strRef = objFirst;
	    System.out.println("String value after replace is "+strRef);
	    System.out.println("String value after replace is "+objFirst);
	    
	    Integer intRef; 
	    Integer intRef1; 
	    Integer IntobjFirst = new Integer(24);
	    Integer IntobjTwo = 25;
		intRef = IntobjFirst;
		System.out.println("String value after replace is "+intRef.byteValue());
		intRef1 = intRef;
		intRef = Integer.MIN_VALUE;
		//alterdata(intRef);
		//strRef = objTwo;   //reference cannot point to diff object
		IntobjFirst=IntobjFirst.MAX_VALUE;//the object final reference is poiting can change. 
	    //strRef = objFirst;
	    System.out.println("String value after replace is "+intRef.byteValue());
	    System.out.println("String value after replace is "+intRef1);
	    System.out.println("String value after replace is "+IntobjFirst);
	}
	
	static void alterdata(Integer aintRef){
		
		aintRef = Integer.MAX_VALUE;
		aintRef.byteValue();
	}
}

final class SecondRun {
	
} 

