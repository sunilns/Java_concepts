package ExamLab;

public class ExamLabQ4 {

    public static void main(String argv[]){
         doNumber(2);
         doNumber(2L);
         doNumber(new int[]{1,2,3,4});
         doNumber(new Integer(2));
         doNumber(new Integer[3]); //Passing array to the function
    } 
    //a e b c d  
    public static void doNumber(int dn){
         System.out.print("a ");
    }

    public static void doNumber(int... dn){
         System.out.print("b ");
    }
 
    public static void doNumber(Integer dn){
         System.out.print("c ");
    }

    public static void doNumber(Integer... dn){
         System.out.print("d ");
    }

    public static void doNumber(Object dn){
         System.out.print("e ");
    }

} 
