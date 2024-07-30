package Chapter2;

class Adder {
	public int addThem(int a, int b) {
		return a+b;
	}
	public double addThem(double a, double b) {
		return a+b;
	}
} 

class AdderSupply extends Adder{
	
}

public class OverloadMethods {
	void adderMethod(Adder a1){
		System.out.println("Inside Adder Version");
	}

	void adderMethod(AdderSupply a1){
		System.out.println("Inside AdderSupply Version");
	}
	
	public static void main(String[] args) {
		Adder a1 = new Adder();
		Adder a2 = new Adder();
		
		int intValue = a1.addThem(5, 10);
		System.out.println("Int value "+intValue);
		
		double doubleValue = a1.addThem(12.786, 13.67656);
		System.out.println("Float value "+doubleValue);
		
		//Calling Overloaded methods
		OverloadMethods o1 = new OverloadMethods();
		Adder a3 = new Adder();
		AdderSupply a4 = new AdderSupply();
		Adder a5 = new AdderSupply();

		o1.adderMethod(a3);
		o1.adderMethod(a4);
		//following invocation will be resolved at compile time
		o1.adderMethod(a5);
	}

}
