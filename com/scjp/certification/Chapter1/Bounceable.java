package Chapter1;

abstract interface Bounce {
	void bounce ();   //these methods are by default PUBLIC ABSTRACT
	void setBouncefactor ();  //these methods are by default PUBLIC ABSTRACT
}


public class Bounceable {
  public static void main( String[] argss)
	//public static void main(String[] args) 
  {
		System.out.println("Current Thread Name is: "+Thread.currentThread().getName());
		try{
			System.out.println("division operation is : "+0/0);
		}
		catch(ArithmeticException ex){
			//System.out.println("division operation is : "+0/0);
			System.out.println("/ by zero is handled ");
			
		}
		
		System.out.println("Thread Group of Current Thread is: "+Thread.currentThread().getThreadGroup().getName());
		System.out.println("ID of Current Thread is: "+Thread.currentThread().getId());
		System.out.println("Parent of Current Thread Group is: "+Thread.currentThread().getThreadGroup().getParent().getName());
	}	
}
