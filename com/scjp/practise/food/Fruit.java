package food;

public abstract class Fruit {
	//protected String fruitName; //Public or protected
	private String fruitName; //private
	protected String fruitColor;
	//abstract public void setName(String s1);
	protected void setName(String s1){ //can be public or protected or private 
		//in case of private cannnot be used by inherited class
		fruitName=s1; 
	}
	protected abstract void setColor(String s2);  //can be public or protected
	//in case of private cannnot be used by inherited class
	
	protected void displayProp (){ //can be public or protected
		//in case of private cannnot be used by inherited class
		System.out.println("Fruit Name is : " + fruitName);
		System.out.println("Fruit Color is : " + fruitColor);
	}
}

