package Chapter2;

class Class1 {
	int number;
	private Class1(){
		
	}
	
	 Class1(int x){
		number = x;
	}
	
	int getNumber(){
		return number;
	}
	
	//Method to Create an Oject of Class in case of PRIVATE constructor.
	static void accessPrivateConst(){
		Class1 c1 = new Class1(15);
		System.out.println("Inside Class1 : Number is : "+c1.getNumber());
	}
	
/*	public static void main(String[] args) {
		Class1.accessPrivateConst();
		
		Class1 s1 = new Class1(); 
	}*/
}

class Subclass2 extends Class1 {
//this gives error since Superclass Constructor is not visible to Sub calss!
	Subclass2(){
		super(12);  
	  }
/*	  Subclass2(int a, int b){
		  
	  }
*/}

class Class2 {
	int number;
	
	Class2(int a){
		number=a;
		System.out.println("Inside Class2 :Args ");
	}
}

class SubClass2 extends Class2 {
	static int subNumber=12;
	SubClass2(){
		this(subNumber);
		System.out.println("Inside SubClass2 :Default ");
	}
	
	SubClass2(int a){
		super(subNumber);
		System.out.println("Inside SubClass2 :Args ");
	}	

}
public class ConstructorEx {
	//Illegal since private constructor not visible to this class
	//Class1 c1 = new Class1(12);
	ConstructorEx() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Class1.accessPrivateConst();
		
		SubClass2 s1 = new SubClass2(); 
	}

}
