package experiment;

interface Min{}

class A{}

class B extends A implements Min{}

class C extends B{}

public class casting {

	public static void main(String args[]){
		A a=new A();
		B b=new B();
		C c=new C();
		Min m=null;
		b=(C)m; 
		m=(Min)b;
		A a2=(A)m;
		 
		//A a2=m; //This will through error. 
		
		B b2=(B)a2;
		Min m2=(C)b2;
		C c2=(C)m2;
		String s1 = "sunil";
		boolean b1 = true;
		boolean b11 = false;
		//Boolean b21 = "true";
		//Boolean b22 = "false"; 
		System.out.println("value:"+String.valueOf("pram"));
		
		System.out.printf("%02.2f  %s  %b",new Double(7),new StringBuffer("set"),null); 
	}
}





