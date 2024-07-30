package Chapter1;

 class Concepts {
	transient protected int number = 10;
	volatile int number1 = 10;
	
	private void method(){
		
	}
	void myMethod(int x, int y){
		System.out.println("X:"+x+" Y:"+y);
	}
	void myMethod(int... x){
		System.out.println("X......:"+x[0]+" Y.....:"+x[1]);
	}
	void myMethod(Integer... x){
		System.out.println("....X....:"+x[0]+" ....Y....:"+x[1]);
	}
	
	public static void main(String[] args) {
		//Leagal Identifiers...Valid
		int n$_ber = 0; 
		int $dollar = 0;
		int _under_$dollar = 1; 
		
		Short s1 = 7;
		new Concepts().myMethod(s1,10);
		//new Concepts().myMethod(1); //ambigiuos call
		new Concepts().myMethod(1,2);
		
		//Invalid
		////int @#not valid=0;
//		int _trd# =0;
//		float int=9; 
		
		//Right shift operator...
		int a=512;
		int b=1; 
		a= a >> 4;
		System.out.println("a value after right shift is "+ a);
		Concepts c1 = new Concepts();
		c1.myMethod(2,3);//visible within defined class
		
	}

}
 
/* class secondClass{
	 void method1(){
		 Concepts c1 = new Concepts();
		 c1.method(); //Not visible outside defined class
	 }
 }*/