package ExamLab;

public class ExamLabQ11 {
	public static void main(String... argv){
	          //For Var-Args, either you pass integers or arrays, same call CANNOT have both
		//Following is invalid. 
				//  rest(4,5,new int[]{1,2,3});
	          //  rest(new int[]{1,2,3},4,5); 
		
		//Following is VALID 
		  //rest(new int[]{1,2,3});
		
		//Also make sure that function call is NOT Ambigious. Following is one. 
		//It can be matched to both prototypes.  
		//rest(4);
       
	       }
	       
	       public static void rest(int... i){
	            System.out.print("a");
	      }
	      
	      public static void rest(Integer... I){
	           System.out.print("b");
	      }
}