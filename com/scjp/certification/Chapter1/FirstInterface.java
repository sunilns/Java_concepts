package Chapter1;

public interface FirstInterface {
	public static final int numberZero=0;
	int numberTwo=2;
	interface ChildInterface {
		int i=4;
	}
	public abstract int getNumberZero();
	int getNumberTwo();
}

abstract interface ThirdInterface extends FirstInterface {
	//Override 
	int getNumberZero();
	//Overload
	int getNumberZero(int num);
}

//Abstract Class implementing interface methods!!

class ImplementInterface implements ThirdInterface {
	public int getNumberZero() {
		System.out.println("In Abstarct class");
		return 1;
	}

	@Override
	public int getNumberZero(int num) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getNumberTwo() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static void main(String[] arg){
		
	}
	
} 
