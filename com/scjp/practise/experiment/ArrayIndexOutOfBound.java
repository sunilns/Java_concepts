package experiment;

 class testOne {
	final void method1(){
		
	}
	
	void method2(){
		
	}
}
 
 final class testTwo extends testOne {
		final void method1(int a){ 
			
		}
		final void method1(int a,int b){
			
		}
		
		void method4(){
			
		}
	}
class testThree {
	
	abstract strictfp static class innerClass1 {
		
	}
	void method1(int a){
			
	}
}
 
public class ArrayIndexOutOfBound extends testOne{

    public static void main(String args[]){
        String[] st=new String[]{"Java","Language"};
        StringBuilder sb=new StringBuilder(st[1]);
        //sb.concat(st[2]); //use Append...
        sb.append(st[2]); //use Append...
        System.out.println(sb);
   }

}


