package ExamLab;

	public class ExamLabQ13{

	     public static void main(String argv[]){
	          trackInfo(Integer.parseInt("4"));
	          trackInfo(Integer.valueOf("4"));
	          trackInfo(new Integer(4).intValue());
	          trackInfo(Character.valueOf('a'));
	          trackInfo(new Character('a').charValue());
	     }

	     public static void trackInfo(int a){
	          System.out.print("a");
	     } 

	     public static void trackInfo(char a){
	          System.out.print("e");
	     }

	     public static void trackInfo(Integer a){
	          System.out.print("i");
	     }

	     public static void trackInfo(Character a){
	          System.out.print("o");
	     }

	     public static void trackInfo(Object a){
	          System.out.print("u");
	     }

	} 
