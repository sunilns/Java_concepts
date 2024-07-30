package Chapter8;

public class InnerClass {
	int outerVar = 50;
	final int outerVarfinal = 100;
	static int varNum = 35;
	
	static class innStaticClass {
		int x = 5;
	}
	
	public void methodOne(){
		int localNum= 1;
		final String loanString = "Sunil";
		
		abstract class innMethodStaticClass {
			int Y = 10;
		}
		class innMethod2StaticClass extends innMethodStaticClass{
			void method2(){
				//System.out.println("y:"+localNum); //cannot use loacl variable
				System.out.println("y:"+loanString);
				System.out.println("OuterClass variables:"+ outerVar);
			}
		}
		innMethod2StaticClass i2 = new innMethod2StaticClass();
		System.out.println("Y is:"+i2.Y);
		innMethod2StaticClass i3 = new innMethod2StaticClass();
		i3.method2();
	}
	
	static void method3(){
		int localInt = 15;
		final int localFinalVar = 25;
		
		class classWithinStaticMethod{
			void method1(){
				System.out.println("static method local var:"+localInt);
				System.out.println("static method final local var:"+localFinalVar);
				//System.out.println("Outer class local var:"+outerVar);
				//System.out.println("Outer class final local var:"+outerVarfinal);
				System.out.println("Outer class local var:"+InnerClass.this.outerVar);
				System.out.println("Outer class final local var:"+InnerClass.this.outerVarfinal);
				System.out.println("Outer class Static local var:"+varNum);
			}
		}
	}
	public static void main(String[] args) {
		innStaticClass i1 = new innStaticClass();
		System.out.println("X:"+i1.x);
		new InnerClass().methodOne();
		
		//Summary of rules: 
		/* 
		 * 1. Method(normal method as well as static method) local class cannot access local variables 
		 *    defined inside method. Everything else(method local final variables, class level static variables)
		 *    can be accessed. To access outer class level local and final variables use 'InnerClass.this'
		 * 2. 
		 */
	}

}
