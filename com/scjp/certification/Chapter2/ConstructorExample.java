package Chapter2;

public class ConstructorExample {
	static int number;
	public ConstructorExample(int number) {
		this.number = number;
	}
	public ConstructorExample() {
		this(4);
	}
	
	public static void main(String[] args) {
		ConstructorExample c1 = new ConstructorExample();
		System.out.println("Number value is : "+c1.number);
		ConstructorExample c2 = new ConstructorExample(15);
		System.out.println("Number value is : "+c2.number);
		
		System.out.println(4.00f - 3.10f);
	}

}
