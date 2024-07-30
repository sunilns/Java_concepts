package ExamQuestions;

import java.util.ArrayList;
import java.util.*;

public class toArrayExample {

	public static void main(String args[]) {
		List<String> t = new ArrayList<String>();
		t.add("White");
		t.add("Blue");
		String[] sb = t.toArray(new String[] {"A","B","C"});
		for (int i = 0; i < sb.length; i++) {
			System.out.print(sb[i] + " ::: ");
		}
		System.out.println("");
		sb = t.toArray(new String[] {"A","B","C","D"});
		for (int i = 0; i < sb.length; i++) {
			System.out.print(sb[i] + " ::: ");
		}
		System.out.println("");
		sb = t.toArray(new String[] {"A","B","C","D","E"});
		for (int i = 0; i < sb.length; i++) {
			System.out.print(sb[i] + " ::: ");
		}
		System.out.println("");
		sb = t.toArray(new String[] {});
		for (int i = 0; i < sb.length; i++) {
			System.out.print(sb[i] + " ::: ");
		}
		System.out.println("");
		System.out.print("Origional List:   ");
		for (String s : t) {
			System.out.print(s + " :: ");
		}
		System.out.println("");
		List<Integer> t1 = new ArrayList<Integer>();
		t1.add(4);
		t1.add(1);
		t1.add(3);
		t1.add(2);
		Integer[] sb1 = t1.toArray(new Integer[] { });
		for (int i = 0; i < sb1.length; i++) {
			System.out.print(sb1[i] + " : ");
		}
		System.out.println("");
		sb1 = t1.toArray(new Integer[] {7,8,9,4,7});
		for (int i = 0; i < sb1.length; i++) {
			System.out.print(sb1[i] + " : ");
		}
		System.out.println("");
		sb1 = t1.toArray(new Integer[] {7,8,9,4,7,9,10});
		for (int i = 0; i < sb1.length; i++) {
			System.out.print(sb1[i] + " : ");
		}
		System.out.println("");
		sb1 = t1.toArray(new Integer[] {7,8,9,4,7,9});
		for (int i = 0; i < sb1.length; i++) {
			System.out.print(sb1[i] + " : ");
		}
		System.out.println("");
		sb1 = t1.toArray(new Integer[] {50,51});
		for (int i = 0; i < sb1.length; i++) {
			System.out.print(sb1[i] + " : ");
		}
		System.out.println("");
		System.out.print("Origional List:  ");
		for (Integer s : t1) {
			System.out.print(s + " : ");
		}
		System.out.println("");
		System.out.println("==============================================");
		List<Integer> ml=new Vector<Integer>();
		ml.add(9);
		ml.add(3);
		ml.add(2);
		ml.add(6);
		Integer[] ob = ml.toArray(new Integer[] { 2, 3, 4 });
		Arrays.sort(ob);
		for (Object i : ob) {
			System.out.print(i + " ");
		}
		System.out.println("");
		
		
		
	}
}