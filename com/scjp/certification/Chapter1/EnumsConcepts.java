package Chapter1;
import java.lang.*;
import java.io.*;

enum TshirtSize {
	//int enumVar=0; // it is not legal to declare anything before Enum constants in ENUM
	SMALL,BIG,LARGE,XLARGE;
	//int enumVar=0;
};



public class EnumsConcepts {
	StringBuffer sb = new StringBuffer();
	
	public static void main(String[] args) {
		TshirtSize s1 = TshirtSize.SMALL;
		System.out.println("Enum Object: "+s1);
		System.out.println("Enum Value : "+TshirtSize.BIG);
		System.out.println("Enum Class Name : "+TshirtSize.BIG.getClass());//Package_name.enum_name
		System.out.println("Enum HashCode : "+TshirtSize.BIG.hashCode());
		System.out.println("String Equivalent of Enum : "+TshirtSize.SMALL.toString()); 
		System.out.println("Name of Enum Object is its Value: "+TshirtSize.BIG.name());
		System.out.println("---------------------------------------------------------");
		//printEnumValue(TshirtSize.BIG);	
		//Enum comparison
		System.out.println("Comparison RESULT using compareTo");
		System.out.println("A < B : "+TshirtSize.SMALL.compareTo(TshirtSize.XLARGE)); //negative 
		System.out.println("A == B : "+TshirtSize.LARGE.compareTo(TshirtSize.LARGE)); // zero 
		System.out.println("A > B : "+TshirtSize.XLARGE.compareTo(TshirtSize.SMALL)); //positive
		System.out.println("---------------------------------------------------------");

		System.out.println("Comparison RESULT using EQUALS");
		System.out.println("A < B : "+TshirtSize.SMALL.equals(TshirtSize.XLARGE)); //FALSE 
		System.out.println("A == B : "+TshirtSize.LARGE.equals(TshirtSize.LARGE)); // TRUE 
		System.out.println("A > B : "+TshirtSize.XLARGE.equals(TshirtSize.SMALL)); //FALSE
		System.out.println("---------------------------------------------------------");

		System.out.println("Comparison RESULT using ==");
		System.out.println("A == B : "+(TshirtSize.SMALL == TshirtSize.valueOf("SMALL"))); //negative
		TshirtSize t1 = TshirtSize.BIG;
		
		System.out.println("A != B : "+(TshirtSize.BIG != TshirtSize.valueOf("SMALL"))); // zero 
		System.out.println("---------------------------------------------------------");
		
		System.out.println("Enum integer values: Using Ordinal function: It always starts with 0,1,2 so on: ");
		System.out.println("This value cannot be changed since the enum CONSTANTS are of type FINAL, STATIC");
		System.out.println("SMALL value is  : "+TshirtSize.SMALL.ordinal());
		System.out.println("BIG value is  : "+TshirtSize.BIG.ordinal());
		System.out.println("LARGE value is  : "+TshirtSize.LARGE.ordinal());
		System.out.println("XLARGE value is  : "+TshirtSize.XLARGE.ordinal());
		System.out.println("---------------------------------------------------------");
		
		//In Switch statement ENUM can be used in fOLLOWING WAYS
		System.out.println("Enum in Switch statements:");
		//TshirtSize s2 = TshirtSize.BIG;
		//TshirtSize s2 = TshirtSize.SMALL;
		TshirtSize s2 = TshirtSize.LARGE;
		switch (s2.ordinal()){ 
			case 0 :System.out.println("Enum SMALL ordinal value"); 
					break;
			case 1 :System.out.println("Enum BIG ordinal value"); 
				 	break;
			case 2 :System.out.println("Enum LARGE ordinal value"); 
		 			break;	 	
			default:System.out.println("Error"); 
					break;	 
		}		
		System.out.println("---------------------------------------------------------");
		TshirtSize s3 = TshirtSize.BIG;
		switch (s3){ 
			case SMALL :System.out.println("Enum SMALL ordinal value"); 
					break;
			case BIG :System.out.println("Enum BIG ordinal value"); 
				 	break;
			case LARGE:System.out.println("Enum LARGE ordinal value"); 
		 			break;	 	
			default:System.out.println("Error"); 
					break;	 
		}
		System.out.println("---------------------------------------------------------");
		//Enum supports following functions
		System.out.println("Using ADVANCED for loop");
		for(TshirtSize t2 : TshirtSize.values()){
			System.out.println(t2.ordinal()+" ::: "+t2+" :::");
		}
		System.out.println("---------------------------------------------------------");
		//Enum supports following functions
		System.out.println("Using for loop");
		for(int i=0;i<TshirtSize.values().length;i++){
			System.out.println(i+" ::: "+TshirtSize.values()[i]);
		}
		System.out.println("---------------------------------------------------------"); 
		
		//We can code main function within enum, it's perfectly fine!!!
	}

}
