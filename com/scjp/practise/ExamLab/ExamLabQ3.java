package ExamLab;

public class ExamLabQ3 {
	
	public static void main(String[] args){
		boolean b1=true;
	    Boolean b2=new Boolean(" TRUE");
	    while(b1){
	         System.out.print(b2+" ");
	         for(int i=0; i<5; System.out.print(i))
	              i++;
	         if(!b2){
	              b1=false;
	         }else{
	              b1=new Boolean("false");
	         }
	    }
	}
}
