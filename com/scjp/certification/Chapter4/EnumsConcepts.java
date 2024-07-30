package Chapter4;

//Enum with OPERATORS

enum TshirtSize {
	SMALL,BIG,LARGE,XLARGE;
};

public class EnumsConcepts {
	public static void main(String[] args) {
		TshirtSize s1 = TshirtSize.SMALL;
		TshirtSize s2 = TshirtSize.SMALL;
		TshirtSize s3 = TshirtSize.BIG;	
		
		if(s1 == s2){
			System.out.println("s1 and s2 enums are equal (s1 == s2)");
		}
		if(s1.equals(s2)){
			System.out.println("s1 and s2 enums are meaningfully equal ( s1.equals(s2) )");
		}
		
		if(s1 != s3){ //NOT
			System.out.println("s1 and s3 enums are NOT equal (s1 == s3)");
		}
		if(!s1.equals(s3)){ //NOT
			System.out.println("s1 and s3 enums are NOT meaningfully equal ( s1.equals(s3) )");
		}		
		
		String s4 = "Sunil";
		String s5 = "Shetty ";
		s5+=s4; //Compound assignment for String equivalent to s5 = (String)(s5+s4)
		
		System.out.println("Concatenated String is:"+s5); 
		
	}
	

}
