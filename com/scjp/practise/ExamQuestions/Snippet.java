package ExamQuestions;

class Animal{
	
}

class Dog extends Animal{
	
}

public class Snippet {
	public static void main(String[] args) {
		Animal a1 = new Animal();
		Dog d1 = new Dog();
		
		d1 = (Dog)a1; //No compile time error, but Runtime exception! ClassCast Exception
		 
	}
}

