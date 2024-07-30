package Chapter3;

class bird {
	{ System.out.print("b1 ");}
	bird () {	System.out.print("b2 ");}
	static {System.out.print("b3 ");}
	{ System.out.print("b4 ");}
}
class Raptor extends bird {
	static {System.out.print("r1 ");}
	Raptor(){	System.out.print("r2 ");}
	{System.out.print("r3 ");}
	static {System.out.print("r4 ");}
}	
public class StaticInstanceBlock extends Raptor {
	static {System.out.print("s1 ");}
	{System.out.print("s2 ");}
	StaticInstanceBlock(){System.out.print("s3 ");}
	public static void main(String[] args) {
		System.out.print("pre ");
		new StaticInstanceBlock();
		System.out.print("hawk ");
	}
//b3 r1 r4 s1 pre b1 b4 b2 r3 r2 s2 s3 hawk
}
