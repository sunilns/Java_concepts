package ExamQuestions;

public class OverloadOverride{

	     private String runNow(){
	          return "High";
	     }

	     static class B extends OverloadOverride{
	          public String runNow(){
	               return "Low";
	          }
	     }

	     public static void main(String args[]){
	    	 OverloadOverride[] a=new B[]{new B(),new C()};
	          for(OverloadOverride aa:a)
	               System.out.print(aa.runNow()+" "); 
	     }

	} 

class C extends OverloadOverride.B{

     public String runNow(){
          return "Out";
     }

}


class A{
    protected Number take(){return 4;}
 }
 
  class B extends A{
	  Long l1 = new Long(4l);
	   protected Long take(){return l1.longValue();}
  }