package Creatures;

interface run {
	void runFast(); 
}
class Animal implements run{
	Animal(){
		//EITHER OF THESE CAN OCCUR NOT BOTH
		//super();
		this(2);
	}
	Animal(int a){
		super();
	}
	public void eat() throws Exception{
		System.out.println("Inside Animal Eat");
	} 
	public void printYourself(){
		System.out.println("Inside Animal");
	}
	
	public void runFast(){
		System.out.println("I'm running facter");
	}
}
class Tiger extends Animal implements run {
	public void eat(){
		System.out.println("I eat Non-veg");
	}
	public void hunt(){
		System.out.println("I hunt at night!");
	}
}

class Zoo extends Tiger implements run{ //This is legal and See the Order : Extend first and then Implement
	//Following is Illegal : because of the order of implement and extend... 
	//class Zoo implements run extends Tiger { //This is illegal 	
	public void runFast(){
		System.out.println("I'm running facter");
	}
}


public class Horse extends Animal{
	public void eat() {
		System.out.println("Inside Horse Eat");
	} 
	public void eat(String s1) {
		System.out.println("Inside Horse Eat : String"+s1);
	} 
	public void printYourself(){
		super.printYourself(); //Method to call superclass function... 
		
		System.out.println("Inside Horse");
	}
	public static void main(String [] args){
		Horse H1 = new Horse();
		H1.printYourself(); 
		
		H1.eat(); //Compiler assumes eat method of Horse will be called, hence no error 
		
		Animal A1 = new Animal();
//		A1.eat();  //Compiler assumes eat method of Animal will be called which need to handle exception, hence error
		//Solution is cover it using try()/Catch() Block
		try {
			A1.eat();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Animal AH1 = new Horse();
//		AH1.eat(); //Compiler assumes eat method of Animal will be called which need to handle exception, hence error
		//Solution is to cover it using try()/Catch() Block
		try {
			AH1.eat();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Horse H2 = new Horse();
		H2.eat(" Sun");
		
		Animal A3 = new Horse();
		//A3.eat("Soft"); //this throws error since for compiler there is no eat method with string args
		
		//Casting  : DownCasting 
		Animal AA1 = new Tiger(); 
		Tiger HH1 = (Tiger) AA1; 
		HH1.eat(); //This can call all the methods which are visible to Tiger. INCLUDING Hunt which is specific to Tiger ONLY
		
		Tiger HH2 = new Tiger(); 
		Animal AA2 = HH2; //OR
		Animal AA3 = (Animal)HH2;  
		AA2.printYourself(); //This can call all the methods which are visible to Animal. It cannot call Hunt, which is specific to Tiger ONLY 
		
		//To show when supeclass implements interface and that class is extended along with interface again!
		// No-Need to re-implement the interface method. 
		Tiger T1 = new Tiger();
		T1.eat(); 
		T1.runFast();
	}
}