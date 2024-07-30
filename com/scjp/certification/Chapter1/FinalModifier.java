package Chapter1;

class LocalClass {
	final int localNumber;
	final String refFinalType; //Final Class variables are not given default value!!!
	//Final variable should be assigned value in declaration line or in constructor... it cannot be initialized in methods.
	public LocalClass(){
		localNumber=10;
		refFinalType=null;
		System.out.println("In constructor : "+localNumber);
	}
	public LocalClass(int a){
		localNumber=10;
		refFinalType=null;
		System.out.println("In constructor : "+localNumber);
	}
	void setLocalNumber(){
		//Following is not valid. U r trying to change Final variable value which is assigned by constructor.  
		//localNumber=10;
		System.out.println("Inside Set LocalNumber method : "+localNumber);
	}
}

public class FinalModifier {
	public static void main(String[] args) {
		final int localFinalVariable;
		LocalClass l1 = new LocalClass();
		l1.setLocalNumber();
	}
}
