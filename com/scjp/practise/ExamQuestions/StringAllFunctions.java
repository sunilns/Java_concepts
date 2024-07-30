package ExamQuestions;

public class StringAllFunctions {
	public static void main(String[] args) {
		String s1 = new String("Sunil");
		String s2 = new String("Sunil");
		String s3 = new String("Anil");
		String s4 = new String("Zunil");
		
		//this compares toString if any first mismatch  found then Unicode differnce of those characters 
		//will be sent to caller.If all characters are same then 0 will be returned. 
		System.out.println("String Comparison RESULT using compareTo");
		System.out.println("A < B : "+s3.compareTo(s1)); //negative 
		System.out.println("A == B : "+s1.compareTo(s2)); // zero 
		System.out.println("A > B : "+s4.compareTo(s1)); //positive
		System.out.println("---------------------------------------------------------");
		//We cannot compareTo inside if(),While etc since it returns value not boolean. 
		//Following will give error.
		/*if (s1.compareTo(s2)){
			 
		}*/
		System.out.println("String Comparison RESULT using equals()");
		System.out.println("A < B : "+s3.equals(s1)); //false or true 
		System.out.println("A == B : "+s1.equals(s2)); //false or true
		System.out.println("A > B : "+s4.equals(s1)); //false or true
		System.out.println("---------------------------------------------------------");
		
		char seq[] = {'S','u','n','i','l'};
		
		//String can checked compared for EQUAL against set of characters.
		System.out.println(" String to Character Sequence comparison: "+s1.contentEquals(new StringBuffer().append(seq)));
		
		//Following is InValid
		//System.out.println("Seq:"+seq.toString());
		//System.out.println(" String to Character Sequence comparison: "+s1.contentEquals(seq.toString()));
		System.out.println("---------------------------------------------------------");
		
		//String is Class and has length() function. Where as array has 'length' which is property
		//Following is the example
		System.out.println("Using array length property :"+seq.length); 
		System.out.println("Using String length() method :"+s1.length());
		System.out.println("---------------------------------------------------------");
		
		//Split method of String takes regular expression to parse the source string. 
		s1 = "AaBcCd";
		String[] s5 = s1.split("[a-z]"); //delimiter is small letters a-z
		System.out.println("Split method demo :"+s5[0]+" : "+s5[1]+" : "+s5[2]);
		System.out.println("---------------------------------------------------------");
		
		s1 = "AaBcCd";
		char[] s6 = s1.toCharArray();
		System.out.println("Converting String into Character Array : "+s6[0]+" : "+s6[1]);
		System.out.println("---------------------------------------------------------");
		
		//valueOF methods of Strings 
		String b1 = "10";
		String ss1 = "100";
		String a1 = "125";
		String l1 = "125";
		String f1 = "3.142";
		String d1 = "2.3453";
		System.out.println("Value of byte : "+String.valueOf(b1));
		System.out.println("Value of short : "+String.valueOf(ss1));
		System.out.println("Value of int : "+String.valueOf(a1));
		System.out.println("Value of long : "+String.valueOf(l1));
		System.out.println("Value of float : "+String.valueOf(f1));
		System.out.println("Value of double : "+String.valueOf(d1));
		System.out.println("---------------------------------------------------------");
	}
}
