package ExamQuestions;

import java.text.*;
import java.util.*;
import java.io.*;
import java.util.regex.*;
import java.lang.*;


public class KeywordCombination {
	/*This program will try all combination of keywords to identify which is valid and Invalid. 
	> Methods 
	> variables 
	> class (Out, Inner[method, argument]) 
	*/
	//Collections c1 = Collections
	//Keyword combination for METHODS 
	
	//Only FINAL is allowed within methods for 
	public void myMethod(final int a, int b){ 
		static int c ;
	}
	
	//Volatile cannot be used in method parameters
	//NOTE: Method argument is local variable.
	//Hence Rule applicable to Local variable applicable to method Arguments.  
	public void myMethod1(final int a, volatile int b){
	}
	
	//Transient cannot be used in method parameters. Only allowed qualifier is FINAL. 
	//NOTE: Method argument is local variable.
	//Hence Rule applicable to Local variable applicable to method Arguments.   
	public void myMethod2(final int a, transient int b){
	}
	
	//Public/Strictfp : Allowed   
	public strictfp void myMethod3(final int a){
	}
	
	//Public/Strictfp : Allowed   
	private strictfp void myMethod4(final int a){
	}
	
	//Public/Strictfp : Allowed   
	protected strictfp void myMethod5(final int a){
	}
	
	//Strictfp/Static : Allowed   
	static strictfp void myMethod6(final int a){
	}
	
	//Strictfp/Final : Allowed   
	final strictfp void myMethod7(final int a){
	}
	
	//Strictfp/Synchronized : ALLOWED   
	synchronized strictfp void myMethod9(final int a){}	

	synchronized native void myMethod10(final int a);	
	
	//Strictfp/native : NOT ALLOWED   
	native strictfp void myMethod8(final int a);
	
	final native synchronized void myMethod11(final int a);
	

}

abstract class forAbstractCombination {
	//SUMMARY : ONLY ALLOWED Modifiers for Abstract method is PUBLIC and PROTECTED
	
	abstract void myMethod(final int a, int b);
	
/*	//Abstract/Public is valid combination
	public abstract void myMethod1(final int a, int b);*/
	
	//***************************IMPORTANT***************************** 
	//Abstract/Protected is valid combination: Abstract can be Public/Protected
	protected abstract void myMethod2(final int a, int b);
	
	//Abstract/Private is ILLEGAL:  is allowed within abstract class
	private abstract void myMethod3(final int a, int b);
	
	//Abstract/Final is ILLEGAL : both have opposite meaning
	final public abstract void myMethod4(final int a, int b);
	
	//Abstract/Static is ILLEGAL : Abstract is for sub classing and implement, static at class level
	static public abstract void myMethod5(final int a, int b);
	
	//Abstract/native is ILLEGAL : Abstract is for sub classing and implement, static at class level
	native public abstract void myMethod6(final int a, int b);
	
	//***************************IMPORTANT*****************************
	//Abstract/native is ILLEGAL : Abstract is for sub classing and implement, static at class level
	strictfp public abstract void myMethod7(int b);
	
	//Modifiers applicable for VARIABLES.final, static, volatile, transient, public, private, protected
	//
	
	final volatile int a =0; //ILLEGAL : both have opposite meaning  
	final transient int b =0; //
	
	
}

//INTERFACE level
//SUMMARY: ONLY allowed modifiers for interface are PUBLIC, ABSTRACT

//By default interface is PUBLIC, ABSTRACT. In case of PUBLIC interface it should be in its own file.
//its methods are PUBLIC, ABSTRACT
//Its variables are PUBLIC, STATIC, FINAL.

interface validKeywordInterface3 {
}

abstract interface validKeywordInterface4 {
}

strictfp interface validKeywordInterface5 {
} 

private interface validKeywordInterface1 {
}

protected interface validKeywordInterface2 {
} 

final interface validKeywordInterface5 {
}

//NOTE: native is for methods.
static interface validKeywordInterface7 {
}

native interface validKeywordInterface8 {
}
 
//Class level 
//SUMMARY: Access qualifiers: PUBLIC, default
//Non-Access : Abstract, strictfp,Final 

/*final class validKeywordClass { 
}

strictfp class validKeywordClass1 {
}*/

protected class validKeywordClass2 {
}

private class validKeywordClass3 {
}