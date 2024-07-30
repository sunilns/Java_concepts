package experiment;

public class FunctionArgReturn {
	
	static byte testFunction1(byte a){
		byte b1 = 10;
		short s1 = 10;
		char c1 = 10;
		int i1 = 10;
		long l1 = 10; 
		float f1 = 10.00f;
		double d1 = 14.23;
		
		//return b1;	// 
		//return (byte)s1;	// Cannot return different type. If CASTING is done then fine :: (byte)s1
		//return c1;	//
		//return i1;	//
		//return l1;	//
		//return f1;	//
		//return d1;	//
		
	}	
	static short testFunction2(short a){
		return a;
	}	
	static char testFunction3(char a){
		return a;
	}	
	
	static int testFunction4(int a){
		//It is legal to return int or anything smaller than that. Anything bigger will throw error. 
		byte b1 = 10;
		short s1 = 10;
		char c1 = 10;
		int i1 = 10;
		long l1 = 10;
		float f1 = 10.00f;
		double d1 = 14.23;
		
		//return b1;	// Valid 
		//return s1;	// Valid
		//return c1;	//Valid
		//return i1;	//Valid
		//return l1;	// INVALID : Cannot return anything longer than Int. WORKS in case of CAST : (int)l1 
		//return f1;	//INVALID : Cannot return anything longer than Int. WORKS in case of CAST : (int)f1
		//return d1;	//INVALID : Cannot return anything longer than Int. WORKS in case of CAST : (int)d1
	}	
	
	static long testFunction5(long a){
		return a;
	}	
	
	static float testFunction6(float a){
		return a;
	}	
	
	static double testFunction7(double a){
		//It is legal to return double or anything smaller than that
		byte b1 = 10;
		short s1 = 10;
		char c1 = 10;
		int i1 = 10;
		long l1 = 10;
		float f1 = 10.00f;
		double d1 = 14.23;
		
		//return b1;	// Valid 
		//return (byte)s1;	// Valid
		//return c1;	//Valid
		return i1;	//Valid
		//return l1;	//Valid
		//return f1;	//Valid
		//return d1;	//Valid
	}	
		
	public static void main(String[] args) {
		byte b1 = 10;
		short s1 = 10;
		char c1 = 10;
		int i1 = 10;
		long l1 = 10;
		float f1 = 10.00f;
		double d1 = 14.23;
		
 
		System.out.println("output:"+testFunction1(b1));
		System.out.println("output:"+testFunction1(s1)); //if cast then valid  : (byte)s1
		System.out.println("output:"+testFunction1(c1));  //if cast then valid  : (byte)c1
		System.out.println("output:"+testFunction1(i1)); //if cast then valid  : (byte)i1
		System.out.println("output:"+testFunction1(l1)); //if cast then valid  : (byte)l1
		System.out.println("output:"+testFunction1(f1)); //if cast then valid  : (byte)f1
		System.out.println("output:"+testFunction1(d1)); //if cast then valid  : (byte)d1
		
	}

}
