package Chapter2;

class BaseClass {
	void getClassName(){
		return;//this is called return NOTHING statement. It is valid for VOID return type!
	}
	
	BaseClass getNumber(){
		return new BaseClass();
	}	
}

class SubClass extends BaseClass {
	
	String getClassName(int x){
		return null;
	}
	
	String [] getClassName(String x){
		return null;
	}
	
	//implicit com.sunil.com.sunil.interview.concepts.casting
	int getClassName(float x){
		return 'a';
	}
	
	double getClassName(double d){
		return 3.145;
	}
	
	//explicit com.sunil.com.sunil.interview.concepts.casting
	double getClassName(int d,int s){
		float f1 = 3.1242f;
		return (double)f1;
	}
	
	//Co-variant returns
	BaseClass getClassName(String a, int r){
		return new SubClass();
	}
	
	//overriding...Co-variant returns supported from JAVA 1.5 
	SubClass getNumber(){
		return new SubClass();
	}	
	
	//Followinf is also legal
//	BaseClass getNumber(){
//		return new BaseClass();
//	}		
}

public class ReturnTypes {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
