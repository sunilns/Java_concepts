package Chapter3;

public class AssignmentsExample2 {
	public static void main(String[] args) {
		byte a = 10; 
		byte b = 12; 
		byte c ; 
		
		c = (byte)(a + b);
		
		System.out.println("Sum of A and B is : "+c);
		
		//In below case if explicit cast is not there then compiler will through error 
		char d = (char)66123; 
		char e = (char) -345; 
		//Character requires explicit cast if the value is out of range i.e 1 to 65535 
		
		byte b1 = 100; 
		byte b2 = -128;
		
		byte b4 = (byte)128; // this requires explicit cast since 128 won't fit into byte.  
		
		byte b3 = 3;
		//following two statements are same.... without cast statement will through error 
		b3 += 7; 
		b3 = (byte)(b3 + 7); 
		//b3 = b3 + 7 ;  //will give error
		b3+=3+7*2;
		System.out.println("b3:"+b3);
		
		int i1 = 10; 
		long i2 = 25;
		int i3=0; 
		//following will give error 
		//i3 = i1 + i2; 
		
		//Following will work.
		i3 = i1 + (int)i2; // or 
		i3 = (int)(i1 + i2);
		
		//Following Array declaration will give error. 
//		int[] array1 = new int[]; 
//		int[][] array2 = new int[][];
//		int[][] array3 = new int[][4];
//		int[][][] array4 = new int[1][][3];
//		int[][][] array5 = new int[][][];
		
		//Following Array declarations are correct. 
		int[] array6 = new int[2]; 
		int[][] array7 = new int[1][];
		int[][] array11 = new int[1][3];
		int[][] array8 = new int[3][4];
		int[][][] array9 = new int[1][2][];
		int[][][] array10 = new int[2][4][6];
		int[][][] array12 = new int[4][][];//Four TWO dimensional arrays
		
		//following is NOT valid. It will give RUN-TIME ERROR
		int array13[][] = new int[2][0]; //two one dimentional array with ZERO elements!!!
		array13[0][0] = 11; //run time error ArrayIndexOutOfBoundsException
		
	}

}
