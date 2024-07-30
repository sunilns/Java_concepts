package Chapter2;

class Animal {

	void shout(){
		System.out.println("Inside Animal Shout");
	}
}

class Dog extends Animal {

	void shout(){
		System.out.println("Inside Dog Shout");
	}

	void playDeed(){
		System.out.println("Inside Play Deed");		
	}
}

public class CastingExample {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		Animal a1 = new Animal();
		
		//Upcast : Example 1 
		a1 = d1; 
		System.out.println("Which version of Shout ? :");	a1.shout(); 
		
		//Upcast : Example 2 
		a1 = new Dog(); 
		System.out.println("Which version of Shout ? :");	a1.shout(); 
		
		//Following will not Compile! Since playDeed method is not in Animal class
		//a1.playDeed(); 
		
		
		//Downcast : Example 1 
		a1 = d1;
		Dog d2 = (Dog)a1; //---since a1 is internally referring to Dog instance!
		System.out.println("Which version of Shout ? :");	d2.shout(); 
		System.out.println("Deed method ? : ");	d2.playDeed();

		//Following is illegal... IT WILL COMPILE but fails at runtime! java.lang.ClassCastException!
		//ClassCAST Exception : Compiler will check if the two types are in the same inheritance tree. 
		//So it won’t throw error.   
		Animal a3 = new Animal(); 
		Dog d3 = new Dog(); 
		d3 = (Dog) a3 ; 
		System.out.println("Error : Which version of Shout ? :");	d3.playDeed(); 
		
		//Following code WILL NOT COMPILE.... converting Animal to Dog!
		//d3 = a3 ; 
		
		//Following will not Compile! Since playDeed method is not defined in Animal class
		//a1.playDeed(); 
		
		//Following will NOT COMPILE! Animal cannot be String!
		Animal a4 = new Animal();
		String s1;
		//s1 = (String) a4;
		
	}

}
