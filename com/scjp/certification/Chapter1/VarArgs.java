package Chapter1;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

public class VarArgs {

	public void printValues(String s1, String... s2) {
		System.out.println("First:" + s1);
		for (String s : s2) {
			System.out.println("Inside Loop:" + s);
		}
	}

	public static void main(String args1[]){
		VarArgs v1=new VarArgs();
		String[] s1 = {"sun","mon","tue","wed"};
		v1.printValues("Sunil");
		v1.printValues("Sunil","Shetty");
		v1.printValues("Sham",s1);
		v1.printValues("s","hghghg");//not valid
		
		
//		Matcher m1 = p1.matcher("Hello world");
//		m1.
	}
}
