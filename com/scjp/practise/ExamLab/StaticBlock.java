package ExamLab;
import java.util.*;

class animal{
	{
		System.out.print("a1 ");
	}
	static {
		System.out.print("a2 ");	
	}
	animal(){
		System.out.print("a3 ");
	}
}

class bird {
	
	{
		System.out.print("b1 ");
	}
	bird(){
		System.out.print("b2 ");
	}
	
	static {
		System.out.print("b3 ");	
	}
}

class raptor extends bird {
	{
		System.out.print("r1 ");
	}
	
	static {
		System.out.print("r2 ");	
	}	
	
	raptor(){
		System.out.print("r3 ");
	}
	
	static {
		System.out.print("r4 ");	
	}
	{
		System.out.print("r5 ");
	}
}

public class StaticBlock {

	public static void main(String[] args) {
		System.out.print("start ");
		new raptor();
		System.out.print("end "); 
		//new bird(); 
		
		new animal();
		
		String[] s = {"s1","s2"};
		if ( s instanceof Object){
			System.out.println("Yes");
		}
		/*Byte b1 =127;
		Short s1 = 32750;
		Character c1 = 65578;
		Integer i1 = 65900;*/
	}
 //b3 r2 r4 b1 b2 r1 r5 r3 end a2 a1 a3 
}
