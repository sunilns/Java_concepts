package food;
//To show Difference between : Public, Default, Protected and private

import Flowers.SuperFruit;

public class SubClassFruit extends SuperFruit {
	
	void displayValues(){
		//declaring reference object to access supeclass members
		SuperFruit sF1 = new SuperFruit();
		sF1.setMembers();
		//Following commented lines will give error but public member can be accessed
		/*System.out.println("Diff package : Class member using Ref :"+sF1.privateName); //invalid
		System.out.println("Diff package : Class member using Ref :"+sF1.protectedName); //invalid
		System.out.println("Diff package : Class member using Ref :"+sF1.defaultName); //invalid
		*/		
		System.out.println("Diff package : Class member using Ref :"+sF1.publicName); //valid
		
		//Accessing members using inheritance
		//Following commented lines will give error; public,protected can be accessed from diff package
		/*System.out.println("Diff package : Class member using com.sunil.com.sunil.interview.concepts.Inheritance :"+privateName); //invalid
		System.out.println("Diff package : Class member using com.sunil.com.sunil.interview.concepts.Inheritance :"+defaultName); //invalid
		*/				
		//for protected
		System.out.println("Diff package : Class member using com.sunil.com.sunil.interview.concepts.Inheritance :"+this.protectedName); //valid
		System.out.println("Diff package : Class member using com.sunil.com.sunil.interview.concepts.Inheritance :"+(new SubClassFruit()).protectedName); //valid
		
		System.out.println("Diff package : Class member using com.sunil.com.sunil.interview.concepts.Inheritance :"+publicName); //valid
		
		//Protected members can only be accessed outside package using INHERITANCE
		//Cannot be accessed in any OTHER way; following is invalid
		//System.out.println("Diff package : Class member using Ref :"+(new SuperFruit).protectedName); //invalid	
	}
	
	public static void main(String[] args) {
		SubClassFruit sCf1 = new SubClassFruit();
		sCf1.setMembers();
		sCf1.displayValues();
		
		SubClassFruit2 sCf2= new SubClassFruit2();
		sCf2.setMembers();
		sCf2.displayValues2();
		
		SubClassFruit3 sCf3= new SubClassFruit3();
		sCf3.setMembers();
		sCf3.displayValues3();
	}
} 

class SubClassFruit2 extends SuperFruitSamePack {
	
	void displayValues2(){
		//declaring reference object to access supeclass members
		SuperFruitSamePack sFsp1 = new SuperFruitSamePack();
		sFsp1.setMembers();
		//Following commented line will give error; public, protected,default member can be accessed within same package
		/*System.out.println("Class member :"+sFsp1.privateName); //invalid */
		System.out.println("Same package : Class member using Ref :"+sFsp1.protectedName); //valid
		System.out.println("Same package :Class member using Ref :"+sFsp1.defaultName); //valid
		System.out.println("Same package :Class member using Ref :"+sFsp1.publicName); //valid
		
		//Accessing members using inheritance
		//Following commented line will give error; public,protected and default can be accessed from same package
		/*System.out.println("Class member :"+privateName); //invalid*/
		System.out.println("Same Package : Class member using com.sunil.com.sunil.interview.concepts.Inheritance :"+defaultName); //valid
		System.out.println("Same Package : Class member using com.sunil.com.sunil.interview.concepts.Inheritance :"+protectedName); //valid
		System.out.println("Same Package : Class member using com.sunil.com.sunil.interview.concepts.Inheritance :"+publicName); //valid
	}
}

class SubClassFruit3 extends SubClassFruit2{
	void displayValues3(){
		//Accessing protected member from SubClassFruit2 i.e subclass of subclass
		//Accessing members of subclass SubClassFruit2
		//Following commented line will give error; public,protected and default can be accessed from subclass of subclass
		//same is TRUE for Subclasses of Subclass outside package.
		/*System.out.println("Class member :"+privateName); //invalid*/
		System.out.println("In Subclasses of subclass : Same Package : Class member using com.sunil.com.sunil.interview.concepts.Inheritance :"+defaultName); //valid
		System.out.println("In Subclasses of subclass : Same Package : Class member using com.sunil.com.sunil.interview.concepts.Inheritance :"+protectedName); //valid
		System.out.println("In Subclasses of subclass : Same Package : Class member using com.sunil.com.sunil.interview.concepts.Inheritance :"+publicName); //valid
	}

}