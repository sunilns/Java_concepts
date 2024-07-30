package Chapter5;

enum TshirtSize {
	// int enumVar=0; // it is not legal to declare anything before Enum
	// constants in ENUM
	SMALL, BIG, LARGE, XLARGE;
};

enum MEnum {
	A, B, C
};

public class SwitchExample {
	enum TshirtSize1 {
		// int enumVar=0; // it is not legal to declare anything before Enum
		// constants in ENUM
		SMALL, BIG, LARGE, XLARGE;
	};

	static void switchFunction(int a, int... b) {
		int temp = b[0];
		System.out.println("a: " + a + " b: " + b[0]);

		switch (a) {
		case 1:
			break;
		default:
			break;
		}
	}

	public static void main(String[] args) {
		// CASE requires it's value should match with that of SWITCH arg and It
		// should be COMPILE time constant
		final int a = 1; // this is compile time constant
		final int b; // this is NOT
		b = 2;

		switch (a) {
		case a:
			System.out.println("Case 1");
			break;
		// case b: System.out.println("Case 2"); //This in invalid; will give
		// ERROR
		case 2:
			System.out.println("Case 2");
			break;
		default:
			System.out.println("In Default");
		}

		// Where as Following is VALID; switch arg integer type is matching with
		// integer constant '2'
		switch (b) {
		case a:
			System.out.println("Case 1");
			break;
		case 2:
			System.out.println("Case 2...");
			break;
		default:
			System.out.println("In Default");
		}

		byte b1 = 1;

		switch (b1) {
		case a:
			System.out.println("Case a");
			break;
		case 127:
			System.out.println("Case 127");
			break;
		// case 128: System.out.println("Case 128"); //This gives ERROR; 128
		// cannot be converted to Byte
		// break;
		default:
			System.out.println("In Default");
		}

		// Following gives ERROR; Duplicate CASE value
		switch (b1) {
		case a:
			System.out.println("Case a");
			break;
		// case 127: System.out.println("Case 127");
		// break;
		// case 127: System.out.println("Case 127");
		// break;
		// default : System.out.println("In Default");
		}

		TshirtSize s1 = TshirtSize.BIG;
		switch (s1) {
		// case TshirtSize.BIG :System.out.println("Enum SMALL ordinal value");
		// //this is Invalid
		// break;
		case SMALL:
			System.out.println("Enum BIG ordinal value");
			break;
		case LARGE:
			System.out.println("Enum LARGE ordinal value");
			break;
		default:
			System.out.println("Error: BIG");
			break;
		}

		SwitchExample.TshirtSize1 s2 = SwitchExample.TshirtSize1.XLARGE;
		switch (s2) {
		// case TshirtSize.BIG :System.out.println("Enum SMALL ordinal value");
		// //this is Invalid
		// break;
		case SMALL:
			System.out.println("Enum BIG ordinal value");
			break;
		case LARGE:
			System.out.println("Enum LARGE ordinal value");
			break;
		default:
			System.out.println("Error:XLARGE");
			break;
		}

		// Varaibles used in Switch should be COMPILE TIME CONSTANTS
		final int a1 = 10;
		final int b111;
		int c111;
		b111 = 20;
		c111 = 10;
		switch (20) {
		case a1:
			break;// OK
		// case b111: break;//ERROR
		// case c111: break;//ERROR
		}

		// BOXING
		final int aa1 = 5;
		int bb1 = 14;
		switch (new Integer(5)) {
		case aa1:
			System.out.println("Case a");
			break;
		// case 5 : System.out.println("Boxing : Case a"); break;
		// case bb1 : System.out.println("Case a"); break;

		}

		switchFunction(1, 2, 3, 4);
		int[] bkkk = { 2, 3, 4 };
		switchFunction(1, bkkk);

		MEnum me = MEnum.A;
		int A = 99;
		int B = 98;
		int C = 97;
		switch (me) {  //NOTE: In this case local variables will not overwrite Enum variables!!! 
		default:
			System.out.print("Default ");
		case A:
			System.out.print("Only A ");
		case B:
			System.out.print("Only B ");
		case C:
			System.out.println("Only C ");
		}

	}
}
