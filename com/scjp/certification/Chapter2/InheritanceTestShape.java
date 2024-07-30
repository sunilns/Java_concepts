package Chapter2;

class ggameShape2 {
	public void displayShape() {
		System.out.println("Inside displayShape");
	} 
}

class PlayerPieces extends ggameShape2 {
	public void movePice(){
		System.out.println("Inside move piece");
	}
}

class TilePieces extends ggameShape2 {
	public void getAdjacent(){
		System.out.println("Inside get Adjacent");
	}
}


public class InheritanceTestShape {

	public static void main(String[] args) {
		PlayerPieces p1 = new PlayerPieces();
		TilePieces t1 = new TilePieces();
		doShapes(p1);
		doShapes(t1);
	}
	
	static void doShapes(ggameShape2 g1){ 
		g1.displayShape();
	}
}	
