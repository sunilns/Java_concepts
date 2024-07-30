package ExamQuestions;
import java.util.*;

public class testBinarySearch {
	
         public static void main(String args[]){
              Collection<String> st=new LinkedList<String>();
              st.add("five");
              st.add("six");
              st.add("seven");
              st.add("eight");
              //System.out.println("Out"+Collections.binarySearch(st,"nine"));
              
              List<String> st1=new LinkedList<String>();
              st1.add("five");
              st1.add("six");
              st1.add("seven");
              st1.add("eight");
              System.out.println("Out"+Collections.binarySearch(st1,"nine"));
              
         }
    } 