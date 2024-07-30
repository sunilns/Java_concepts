package ExamLab;

interface XInterface{
    public abstract void runDemo();
    public void nonAbstractMethod();
    
    //interface cannot define intializer like static, instance block, even they don't have constructor
    //static {System.out.println("in class");}
    
}

class XClass implements XInterface{
    String s="Java"; //s variable initialization value 
    XClass(){
    	System.out.println("Instance:in constructor: "+s);
    	s="Sunil";
    	System.out.println("Instance:in constructor: "+s);
    }
     
    public void runDemo(){
    	System.out.println("In side Base runDemo()");
    }

    public void nonAbstractMethod() {
    	System.out.println("Inside XClass non-Abstract method");
    	System.out.println("Latest S value is :"+s);
    }
    static {System.out.println("Static: in class");}
    {	System.out.println("Instance:in class");
    	System.out.println("s value at this point:"+s);//this will be initialized value
    }
    {System.out.println("Value in Initialization block:"+s); s="C++";} //This block will overwrite initialized value for every object created
    //And this initialization block runs after call to Super() in constructor and before
    //any statement in constructor execute
}

public class ExamLabQuestions1 extends XClass implements XInterface{
    {s="C#";} //This statement overwrites base class varaible 's'
	static {System.out.println("Static:in main");}
	 {System.out.println("Instance:in main");
	 System.out.println("S value in main:"+s);}
    public void runDemo(){
         System.out.println("Demo"+super.s + "::::"+s); //Object has only one variable 's' which is been 
         //overwritten at different level in different classes
         
         super.runDemo(); //Calls of this can only be used if base class has implemented 
         //the method u r calling. If its Abstract method we cannot call it.
         super.nonAbstractMethod();//This is fine since this method is implemented
    }
    public static void main(String args[]){
    	System.out.println("In Main: starting execution");	
         XInterface xi=new ExamLabQuestions1();
         xi.runDemo();
    }
}