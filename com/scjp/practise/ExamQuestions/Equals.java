package ExamQuestions;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Locale;

class profile {
	private int a; 
	
	profile(){
		
	}
	public profile (int a){
		this.a=a;
	}
	
	private Boolean equals(profile p){
		return (this.a == p.a); 
	}
}

class secondProfile extends profile{
	int a;
	private secondProfile(int b){
		super(b);
	}
}

public class Equals {

	public static void main(String[] args) {
		profile p1 = new profile(4);
		profile p2 = new profile(4);
		System.out.println("Result:"+p1.equals(p2));
		DateFormat.getDateInstance();
		DateFormat.getDateInstance(DateFormat.SHORT, new Locale("US")); //Style, Locale
		
		//There is no Default constructor in Locale class
		//		new Locale();
		NumberFormat.getInstance(new Locale("EN")); //locale
		
		secondProfile sp1 = new secondProfile(); //Constructor is private hence needs to be initialised within same class!
		profile fp1 = new profile();
		fp1 = sp1;
	
		
	}

}
