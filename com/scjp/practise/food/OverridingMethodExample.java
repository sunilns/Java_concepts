package food;

import food.*;

class SuperClass {
	protected Object displaySuper(){
		System.out.println("Inside SuperClass");
		return null;
	} 
}

class SuperClass1 {
	public void showDemo()throws Exception{
		System.out.println("Inside showDemo");
	}
}
class SubClass1 extends SuperClass1{
	public void showDemo(){
		System.out.println("Inside SubClass1");
	}
}

public class OverridingMethodExample extends SuperClass{
	//void displaySuper() - this is not allowed - default access - lowering the access level
	
/*	public long displaySuper(){ // this is allowed - increasing the access level
		System.out.println("Inside OverridingMethodExample");
	}
*/	
/*	public SuperClass displaySuper(){ // this is allowed - return type should be same or subtype of increasing the access level
		System.out.println("Inside OverridingMethodExample");
		return null;
	}*/
	
	public static void main(String[] args) {
		SubClass1 SubC1 = new SubClass1();
		SubC1.showDemo();
		
		SuperClass1 SuperC1 = new SubClass1();
		//This won't compile - since compiler assumes u r calling SuperClass version of showDemo which throws EXCEPTION 
		//Only JVM resolves the call to SubClass version of showDemo - Hence Compilation is Fail... 
		//SuperC1.showDemo();
		
		
		//This will compile 
		try {
			SuperC1.showDemo();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
