package ExamQuestions;

public class ExceptionThrow {
	     public static void main(String args[]) throws Throwable {
	         if (args.length > 1){
	        	 int a[] = {1,2,3};
	        	 System.out.println(a.length);  //Property since array type
	        	 
	        	 String s1 = new String();
	        	 s1.length();  //Function
	        	 String [] s2 = new String [] {};
	        	 System.out.println(s2.length);  //Property since array type 
	        	 
	        	 StringBuffer sb = new StringBuffer();
	        	 sb.length(); // Function 
	        	 StringBuffer [] sb1 = new  StringBuffer [] {};
	        	 System.out.println(sb1.length); //Property since array type 
	         } 
	    	 try{
	               getMe();
	               int i=0/0; 
	          }catch(ArithmeticException a1){
	        	  System.out.print("airth"); 
	          }catch(InterruptedException ae){
	               System.out.print(1);
	          }catch(ArrayIndexOutOfBoundsException ae){
	               System.out.print(2);
	          }catch(NullPointerException ae){
	               System.out.print(3);
	          }catch(RuntimeException ae){
	               System.out.print(4); 
	          }catch(Exception ae){
	               System.out.print(5);
	          }
	     }

	     public static void getMe()throws ArithmeticException{
	          if(true)throw new NullPointerException();
	          throw new ArrayIndexOutOfBoundsException();
	     }

	}