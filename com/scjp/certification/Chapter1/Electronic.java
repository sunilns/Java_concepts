package Chapter1;

//IMPORTANT Declarations of ABSTRACT/INTERFACE/CLASS 

interface device {
	void doIt();
}

abstract class device1 implements device {
	public void doIt(){
		System.out.println("In device1");
	}
	
	device1(){
		return;
	}
}
public class Electronic {
	
	public static void main(String[] arg){
		device1 p1 = new phone3();
		p1.doIt();
	}
}

class Phone1 extends device1 {
	public void doIt(){} //can make implemented method again Abstract!!!
}

abstract class Phone2 extends Electronic {
	public void doIt(int x ) {
		
	}
	
	public static void main(String[] arg){
		Phone1 p1 = new Phone1();
		p1.doIt();
	}
	
	public void doIt1(int x ) {
		
	}
}

class phone3 extends device1 implements device {
	public void doIt(){
		System.out.println("In phone3");
	}
	
	public void doStuff() {
		
	}
}

