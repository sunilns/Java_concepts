package food;

class Banana implements AllFruits{
	
	public void seeBanala() // implementing abstract method from interface
	{
		System.out.println("Hi....I'm Banana");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Banana B1 = new Banana();
		B1.seeBanala();
		System.out.println("Hi...I'm in Main");
		Banana1 B2 = new Banana1();
		B2.displayMsg();
	}

}

class Banana1 {
	public void displayMsg (){
		System.out.println("in Banana1");
	}
}
