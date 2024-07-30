package Chapter2;

class GameShape {
	public void displayShape() {
		System.out.println("Inside displayShape");
	} 
	
	protected GameShape overrideMethod(){
		System.out.println("Inside GameShape overrideMethod");
		return null;
	}
	
	static void cannotOverride(){
		System.out.println("Inside GameShape Static method");
	}
}

interface Animate {
	void animateShape();
}
class ImpleAnimate implements Animate {
	public void animateShape(){
		
	}
}

class ExtendImpleAnimate extends ImpleAnimate {

}

class PlayerPiece extends GameShape implements Animate {

	void displayShape(String s1) {
		System.out.println("Inside displayShape : PlayerPiece Overloaded version");
	} 
	
	public void animateShape() {
		System.out.println("Inside Animate Shape Method");
	}
	
	public void displayPlayer(){
		System.out.println("Inside Player Piece");
	}
	
	public PlayerPiece overrideMethod(){ 
		//access level should be equal or less restrictive...
		//i.e either protected, default or Public....All are allowed
		//return type is SubType of originally defined class
		super.overrideMethod();
		System.out.println("Inside PlayerPiece overrideMethod");
		return null;
	}
	
	//Following is allowed....Since it becomes new Static method of PlayerPiece Class!
	static void cannotOverride(){
		System.out.println("Inside PlayerPiece Static method");
	}
	
}
public class InheritanceExample {
	public static void main(String[] args) {
		PlayerPiece p1 = new PlayerPiece();
		Object obj = p1;
		GameShape gem = p1; 
		Animate ant = p1; 
		
		ant.animateShape();
		p1.displayShape();
		gem.displayShape();
		obj.getClass();
		
		//Following both invocation call PlayerPiece class version method
		p1.overrideMethod();
		gem.overrideMethod();
		
		//Following is not VALID
		// gem.displayPlayer();		
		// obj.displayShape();
		
		ExtendImpleAnimate e1=new ExtendImpleAnimate();
		ImpleAnimate i1 = new ImpleAnimate();
		Animate a1=null;
		Object o111 = new Object();
		
		//All the following are VALID
		o111 = a1;
		o111 = i1;
		o111 = e1;
		a1 = i1;
		a1 = e1;
		i1= e1;
		
	}

}
