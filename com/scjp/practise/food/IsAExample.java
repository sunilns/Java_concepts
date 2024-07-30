package food;
import food.Apple;

interface MegaFruits extends AllFruits {
	void seeAllFruits ();
}

class KashmirApple extends Apple implements MegaFruits{
	
	public void seeAllFruits(){
		System.out.println("I'm inside All Fruits");
	}
	
	public void seeBanana(){
		System.out.println("I'm inside Banana");
	}
	
	void displyKashmirApple(){
		System.out.println("I'm Kashmir Apple");
	}

}

class SeasonalFruits{
	void showFruits(){
		//Here : SeasonalFruits class is having Apple as one of its fruit. 
		// So it has reference to Apple class 
		// "SeasonalFruits HAS-A Apple" 
		Apple A1 = new Apple();
		A1.display();
	}
}

public class IsAExample{

	public static void main(String[] args) {
		//Here Kashmir Apple Inherits Apple
		// So "KashmirApple IS-A Apple" 
		KashmirApple K1 = new KashmirApple();
		K1.display();
		K1.displyKashmirApple();

		//To understand Polymorphism 
		
		KashmirApple KA1 = new KashmirApple();
		Apple A1 = KA1; // Parent class reference used to refer the object of class which
		//inherits it. He Apple reference used to refer KashmirApple 
		
		// AllFruits AF1 = new AllFruits(); Cannot instantiate Interface 
		//Using interface reference to refer to KashmirApple class object 
		
		AllFruits AF1 = new KashmirApple();
		AF1.seeBanana(); // I can use this Interface reference to call methods defined in AllFruits interface only. 
		//I cannot use this to call "seeAllFruits" - defined in MegaFruits interface
		//Also I cannot use this to call "displyKashmirApple" method which is defined in KashmirApple class
		
		// This will give error 
		//AF1.seeAllFruits();
		
		MegaFruits MF1 = new KashmirApple();
		MF1.seeAllFruits(); 
		MF1.seeBanana();// I can use this Interface reference to call methods defined in AllFruits, MegaFruits interface only.
		//I cannot use this to call displyKashmirApple method which is defined in KashmirApple
		
		
	}
}
