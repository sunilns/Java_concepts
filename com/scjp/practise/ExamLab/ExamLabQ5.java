package ExamLab;

//Testing how print evaluates
//Print statement : before making call to print, it will evalute its values, 
//hence function calls in print will happen first. In function call if any 
//print statement is there then that will execute.


public class ExamLabQ5{ 
		int i=1;

	    public int getI(){
	         System.out.print("Super");
	         return i;
	    }
	    public static void main(String arhs[]){
	    	ExamLabQ5 ga = new Arabik();
	    	System.out.print(ga.i+" "+ga.getI()); //Testing how print evaluates
	    }
}

class Arabik extends ExamLabQ5{
    //Class level variable. redefining i 
	int i=2;

    public int getI(){
         System.out.print("Sub ");
         return i;
    }
}

