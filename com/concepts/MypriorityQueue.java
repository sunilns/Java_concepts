package com.sunil.com.sunil.interview.concepts;

import java.util.PriorityQueue;

class MyNumber implements Comparable<MyNumber>{
	String letter;
	
	MyNumber(String let){
		letter = let;
	}
	
	public boolean equals(Object sObj){
		if((sObj instanceof MyNumber) && (letter.equals(((MyNumber)sObj).letter))){
			return true;
		}else{
			return false;
		}
	}
	
	public int compareTo(MyNumber m2){
		//return letter.compareTo(m2.letter);
		return m2.letter.compareTo(this.letter);
	}
}
public class MypriorityQueue {
	
	public static void main(String[] args) {
		
		PriorityQueue pq1 = new PriorityQueue();
		
		pq1.offer(new MyNumber("z"));pq1.offer(new MyNumber("k"));pq1.add(new MyNumber("b"));pq1.offer(new MyNumber("n"));
		pq1.offer(new MyNumber("a"));pq1.offer(new MyNumber("s"));pq1.add(new MyNumber("o"));pq1.offer(new MyNumber("x"));
		pq1.offer(new MyNumber("h"));pq1.offer(new MyNumber("e"));pq1.add(new MyNumber("c"));pq1.offer(new MyNumber("w"));
		
		while(pq1.size() > 5){
			System.out.println("Priority Element:" + ((MyNumber)pq1.poll()).letter);
		}
		
	}

}
