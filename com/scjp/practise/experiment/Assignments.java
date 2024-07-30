package experiment;

public class Assignments {
	
	public static void main(String[] args) {
		int a = 1;
		
		//Variable assignment rule : FOR Primitives
		//Anything out of range(negative or positive) will throw error. 
		//If out of range and cast is done then no error will be thrown for same type or smaller type. 
		//Exception for above rule is char type... see below example
		//Variable of Type Byte can hold anything smallr than thay type;;; there is NONE
		//Exception for above rule is char type... see below example
		byte b1=120;
		byte b3=-1; 
		byte b3=-129;
		byte b2=128;
		byte b4=(byte)-129; 
		byte b5=(byte)128;
		byte b6=(short)110; //CASTING FROM OTHER TYPE BUT LITERAL VALUE IS ALLOWED! again withoin range only
		byte b9=(short)128; //CASTING FROM OTHER TYPE BUT LITERAL VALUE IS ALLOWED! again withoin range only
		short tt1 = 1;
		short tt2 = 1122;
		byte b7 = (short)tt1; // CASTING FROM OTHER TYPE VARIABLE NOT ALLOWED EVEN WITHIN RANGE OR OUT OF RANGE 
		byte b8 = (short)tt2; 
		
		
		boolean bb1 = true;
		boolean bb2 = false;
		boolean bb3 = -1;
		boolean bb4 = 0;
		boolean bb5 = 1;
		boolean bb6 = "True";
		boolean bb7 = "False";
		
		//Variable of Type Short can hold anything smaller than that type;;; there is byte
		//Exception for above rule is char type... see below example
		//Anything out of range(negative or positive) will throw error. 
		//If out of range and cast is done then no error will be thrown for same type or smaller type
		//Exception for above rule is char type... see below example
		short t1=1000;
		short t2=-1000;
		short t3=60000; // -32768 TO 0 TO 32767
		short t4=32767;
		short t5=-32768;
		short t8=b1; //short can be assigned anything smaller type than that. Exception char type
		short t6=(short)60000;
		short t7=(byte)32789; //legal, short can hold byte and short type.
		
		//Variable of Type char can hold anything smaller than that type;;; there is byte,short
		//PROVIDED : com.sunil.com.sunil.interview.concepts.casting is done and smaller type value is within range
		//Anything out of range(negative or positive) will throw error. For same type after Casting it will work
		//If out of range, even AFTER CASTING error will be thrown for OTHER TYPE

		char c1='a';
		char c2='\u0256';
		char c3= 10;
		char c4=130;
		char c5=-1;
		char c6=-125;
		char c7=0; // 0 to 65535 
		char c8=65535; 
		char c9=65670; 
		char c10=(char)65670; 
		char c11=(short)32767; //can convert from short to char within range of short with literal
		char c12=(byte)120; //can convert from byte to char within range of byte with literal
		char c13=(short)32789; //CANNOT convert from Short to char Out of Range
		char c14=(byte)130; //CANNOT convert from byte to char Out of Range
		char c15=b1; //CANNOT convert from byte to char from variable of type byte in range or Out of range
		char c16=t1;//CANNOT convert from short to char from variable of type short in range or Out of range
		char c17=c1;
		
		int a1 = 1234;
		int a2 = -1234;
		int a3 = 1234;
		int a4 = (byte)1234; //byte, char, short are compatible to int
		int a5 = (char)1234;
		int a6 = (short)1234;
		int a8 = b1;
		int a9 = t1;
		int a10 = c1;
		int a7 = (char)65670;
		int a12 = (byte)65670;
		int a13 = (short)65670;
		int a14 = (long)100;
		int a11 = 100L; //long cannot be assigned to int
		int a16 = 12.35f;
		int a16 = 123.35;
		
		long aa1 = 1234;
		long aa2 = -1234;
		long aa3 = 1234;
		long aa4 = (byte)1234; //byte, char, short, int are compatible to int
		long aa5 = (char)1234;
		long aa6 = (short)1234;
		long aa77 = (int)1234;
		long aa8 = b1;
		long aa9 = t1;
		long aa10 = c1;
		long aa7 = a1;
		long aa11 = 100L; 
		long aa12 = 100.12f;
		long aa13 = 123.45;
		
		float fa1 = 1234;
		float fa2 = -1234;
		float fa3 = 1234;
		float fa4 = (byte)1234; //byte, char, short, int are compatible to int
		float fa5 = (char)1234;
		float fa6 = (short)1234;
		float fa77 = (int)1234;
		float fa8 = b1;
		float fa9 = t1;
		float fa10 = c1;
		float fa7 = a1;
		float fa14 = aa1;
		float fa11 = 100L; 
		float fa12 = 100.12f;
		float fa13 = 123.45;
		
		double da1 = 1234.123;
		double da2 = -1234.22;
		double da3 = 1234.121212;
		double da4 = (byte)1234; //byte, char, short, int are compatible to int
		double da5 = (char)1234;
		double da6 = (short)1234;
		double da77 = (int)1234;
		double da78 = (long)1234;
		double da79 = (float)1234.9898;
		double da8 = b1;
		double da9 = t1;
		double da10 = c1;
		double da7 = a1;
		double da111 = fa1;
		double da112 = aa1;
		double da11 = 100L; 
		double da12 = 100.12f;
		double da13 = 123.45;
		
		//Variable assignment rule : FOR Wrapper Types
		//Anything out of range(negative or positive) will throw error. When cast is done no error will be 
		//thrown
		Byte B1=120;
		Byte B3=-1;
		Byte B3=-129;
		Byte B2=128;
		Byte B4=(byte)-129;
		Byte B5=(byte)128;
		
		Short S1=30020;
		Short S2=-23451;
		Short S3=-32780;
		Short S4=32768;
		Short S5=(byte)-34780;
		Short S6=(byte)34780; //BYTES range is within short range
		Short S61=(Byte)32000;//CANNOT use wrapper type to cast
		Short S63=(Short)1000;//CANNOT use wrapper type to cast
		Short S7=(int)31000;  //Int which is within SHORT range is OK
		Short S8=(int)35000;  //Int which is OUT OF SHORT range is NOT OK
		
		Integer I1=30020;
		Integer I2=-23451;
		Integer I3=-32780;
		Integer I4=32768;
		Integer I5=(byte)-34780;
		Integer I6=(byte)34780; //BYTES range is within short range
		Integer I61=(Byte)32000;//CANNOT use wrapper type to cast
		Integer I63=(Byte)((byte)32000);//CANNOT use wrapper type to cast
		Integer I62=(Integer)2010;//CANNOT use wrapper type to cast
		Integer I7=(int)31000;  //Int which is within Integer range is OK
		Integer I8=(int)35000;  //Int which is OUT OF Integer range is NOT OK
		
		Character CCCC1 = new Character('a');
		Boolean BV1 = new Boolean("true");
		Float f11 = new Float("3.142f");
		Double d11 = new Double("3.142");
		Short ss1 = new Short("120");
		Byte bb01 = new Byte("11"); 
		
	}

}
