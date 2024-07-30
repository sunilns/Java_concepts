package Chapter1;

class SusperClass {
	private void firstMethod(){
		System.out.println("Inside FirstMethod");
	}
	private void secondMethod(){
		System.out.println("Inside SecondMethod");
	}
}

class SubClass extends SusperClass {
	void firstMethod(){ //this is NOT override of method in SuperClass, this is new method of SubClass
		System.out.println("Inside FirstMethod");
	}
	public int secondMethod(int a){ //this is overloaded version of method found in SuperClass
		System.out.println("Inside FirstMethod");
		//return;
		return 1;
	}
/*	public String secondMethod(int a){ //this is NOT valid since there is no change in argument list
		//hence it is not proper overload, override
		System.out.println("Inside FirstMethod");
		//return;
		return null;
	}
*/	
	public int secondMethod(){ //this is NOT valid since it's NOT proper override, return type not matching
		
		System.out.println("Inside FirstMethod");
		//return;
		return 0;
	}
}

public class OverrideOverload {
	
	
}
