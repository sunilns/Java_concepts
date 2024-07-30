package food;

class FishBone {
	public static int number;
	enum CoffeType {Mocha, BlackBeast,Latte} // its kind of inner class and its members 
	//are instances of CoffeType class and they are public, static, final type...  
	// they can be accessed using classname (static) 
	
	public static void display(){
		String s1; 
		int num;
		//int[3] numArray = {1,2,3}; // this is illegal
		int[] numArray = {1,2,3}; // this is LEGAL
		//s1="Sunil";
		String s2 = "Shetty"; 
/*		System.out.println("num is: "+num); // cannot use local variable without initiazing
		System.out.println("S1 is :"+s1);   // cannot use local variable without initiazing
*/		s1="Sunil";
			
		System.out.println("S2 is :"+s2);
		System.out.println("Compalete name is: "+s1+" "+s2);
		System.out.println("Enum 1st value:"+CoffeType.valueOf("Mocha"));
		System.out.println("Enum 2nd value:"+CoffeType.BlackBeast);
		System.out.println("Enum 3rd value:"+CoffeType.Latte);
		System.out.println("Number is instance variable with dafault value:"+number);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FishBone f1 = new FishBone();
/*			every class internally inherits Object class... So all the methods of Objects class will 
		avalable to every class object. It can be seen by following statements
		Fish f1 = new Fish();
		f1. ---> this shows all the functions available in popup....*/
		
		//f1.main(null); //this will result in STACK OVERFLOW error....
		//main(null); both of these syntax are correct
		System.out.println("Hi");
		display();
		/*System.out.println("In main S1 is :"+s1);
		System.out.println("In main S2 is :"+s2);*/
	}
}