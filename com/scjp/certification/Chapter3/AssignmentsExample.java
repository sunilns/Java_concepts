package Chapter3;

public class AssignmentsExample {
	public static void main(String[] args) {
		byte b3 = 3;
		b3+=3+7*4; //in case of compound operators, the right side operands will evaluate first
		System.out.println("Value of b3:"+b3);
		System.out.println("--------------------------------");	
		
		String s1 = "Sunil";
		String s2 = "Sunil";
		s1.replace('u', 'U');
		
		System.out.println("S1: "+s1+"----"+"S2: "+s2);
	}
}