package ExamQuestions;
import Chapter10.test.Baz;
import java.lang.System;
public class ReadEnvProperties extends Baz {
	//Comment : 111 ::: final int valueDuringDeclaration;
	final int valueDuringDeclaration;
	
	ReadEnvProperties(){
		//Final variables must be initialized either during declaration or inside class constructor.
		valueDuringDeclaration=0;
	}
	public void methodInitiailizeFial(){
		//valueDuringDeclaration=10;
	}
	public static void main(String[] args) {
		System.out.println("A:"+System.getProperties());
		System.out.println("B:"+System.getProperty("java.runtime.name"));
		System.out.println("C:"+System.getProperties().getProperty("sham","singh"));
		System.out.println("A:"+System.getenv("sham"));
		System.out.println("D:"+System.getenv("MyVariable"));
		System.out.println("C:"+System.getProperties().getProperty("MyVariable"));
		System.out.println("C:"+System.getProperty("MyVariable"));
		
/*		Apple A1 = new Apple();
		A1.setColor("GREEN"); 
		main(null);
*/		
		Baz b1 = new Baz();
		//b1.defaultAccessMathod();//default access functions are not visible in 
		//class which is in different package.
		//Default access level is in same package.
	}
}