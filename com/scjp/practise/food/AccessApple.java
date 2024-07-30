package food;
import food.Apple;

public class AccessApple {
	
	public static void main(String[] args) {
		Apple A1 = new Apple();
		A1.setProperties("GREEN", "400 gm");
		A1.display();
		
		Apple A2=null; 
		if(A1.equals(A2)){
			System.out.println("A1 and A2 are EQUAL");
		}else {
			System.out.println("A1 and A2 are NOT EQUAL");
		}
		
		if(A1 instanceof Object){
			System.out.println("A1 is instance of Object");
		}
		if(A1 instanceof Apple){
			System.out.println("A1 is instance of Apple");
		}
		
		AccessApple AA1 = null;
		if(AA1 instanceof AccessApple){
			System.out.println("AA1 is instance of AccessApple");
		}else {
			System.out.println("AA1 is NOT instance of AccessApple");
		}
		if(AA1 instanceof Object){
			System.out.println("AA1 is instance of Object");
		}else {
			System.out.println("AA1 is NOT instance of Object");
		}
		
		AccessApple AA2 = new AccessApple();
		if(AA2 instanceof AccessApple){
			System.out.println("AA2 is instance of AccessApple");
		}else {
			System.out.println("AA2 is NOT instance of AccessApple");
		}
		
	}

}
