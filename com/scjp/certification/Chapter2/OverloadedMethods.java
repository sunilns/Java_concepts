package Chapter2;

public class OverloadedMethods {
	
/*	public static byte addNum(byte a, byte b){
		System.out.println("inside BYTE version:");
		return (byte)(a+b);//mathematical operation makes it integer
	}
	public static short addNum(short a, short b){
		System.out.println("inside SHORT version:");
		return (short)(a+b);//mathematical operation makes it integer
	}
*/	public static int addNum (int a, int b){
		System.out.print("inside INT version: ");
		return (a+b);
	}
/*	public static long addNum(long a, long b){
		System.out.println("inside LONG version:");
		return (a+b);
	}
	
	
*/	
	public static float addNum (int a, float b){
		System.out.print("inside float version: ");
		return (a+b);
	}

	public static int addNum (Object a, Object b){
		System.out.print("inside OBJECT version: ");
		return (int)((Long) a + (Long)b);
	}
	
	public static void main(String[] args){
		byte a = 1;
		short b = 2;
		int c = 3;
		long d = 4l;
		char e = 'a';
		
		System.out.println("byte: "+addNum(a,a));
		System.out.println("short: "+addNum(b,b));
		System.out.println("integer: "+addNum(c,c));
		System.out.println("long: "+addNum(d,d));//if no long verstion, Object will be called
		System.out.println("char: "+addNum(e,e)); //integer is BIG enough to hold char value.
	}
}