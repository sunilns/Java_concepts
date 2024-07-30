package ExamLab;

interface bounce {
	strictfp void setBounceFactor();
}
strictfp abstract class bounceable {
	abstract void setBounceFactor();
	//strictfp public abstract void setBounceFactor();
}

class otherClass {
	int a = 0;
	public int b = 0;
	protected int c = 0;
	private int d = 0;
}

public class InterfaceExample { 
	int a = 0;
	public int b = 0;
	protected int c = 0;
	private int d = 0;
	
	InterfaceExample(){
		
	}
	static class innerClass {
		
	}
	public static void main(String[] args) {
		InterfaceExample i1 = new InterfaceExample();
		System.out.println(i1.a);
		System.out.println(i1.b);
		System.out.println(i1.c);
		System.out.println(i1.d);

		otherClass oc1 = new otherClass();
		System.out.println(oc1.a);
		System.out.println(oc1.b);
		System.out.println(oc1.c);
		//System.out.println(oc1.d);
	}
}