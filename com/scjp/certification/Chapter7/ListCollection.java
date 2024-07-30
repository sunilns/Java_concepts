package Chapter7;

import java.util.*;

class userDefined{
	private static int pvtNumber=0;
	private int localNumber;
	private String pvtName;
	
	userDefined(String b){
		pvtNumber++;
		localNumber=pvtNumber;
		pvtName=b;
	}
	
	public boolean equals(Object secondObj){
		if ((secondObj instanceof userDefined) && (((userDefined)secondObj).localNumber == this.localNumber)){
			return true;
		}else {
			return false;
		}
	}
	
	public int hashCode(){
		return localNumber * 17;
	}
	
	public int getLocalNumber(){
		return this.localNumber;
	}
	
	public String getLocalName(){
		return this.pvtName;
	}
	
/*	public String toString(){
		return "\nIn overriden toString() method\n"+"localNumber is : "+this.localNumber+" localName is: "+this.pvtName+"\n";
	}*/

}

public class ListCollection {

	public static void main(String[] args) {
		userDefined u1 = new userDefined("SUNIL");
		userDefined u2 = new userDefined("ANIL");
		userDefined u3 = new userDefined("sunil");
		userDefined u4 = new userDefined("anil");
		
		ArrayList a1 = new ArrayList();
		a1.add(u1);
		a1.add(u2);
		a1.add(u3);
		a1.add(new Object());
		a1.add(u4);
		
		for (int i=0;i<a1.size(); i++){
			System.out.println(" "+a1.get(i)); //fetches elements in insertion order.
		}
		
		System.out.println("After call to toString() method on ArrayList() a1 : "+a1.toString());
		
		ArrayList a2 = (ArrayList)a1.clone();   //Just creates new reference. 
	
		System.out.println("a1 arraylist equals a2 : "+a1.equals(a2));
		a1.clear(); // makes a1 reference to point to Empty ArrayList
		System.out.println("a1 arraylist equals a2(after clear) : "+a1.equals(a2));
		System.out.println("a1 is empty ? : "+a1.isEmpty());
		System.out.println("After call to toString() method on ArrayList() a2 : "+a2.toString());
		//ArrayList[] a3 = (ArrayList[])a2.toArray();
		
		//Queue implementation using LinkedList : FIFO 
		/* 
		 *     ========================== 
		 *     head u1, u2, u3, u4   tail
		 *     ==========================
		 */
		LinkedList<userDefined> l1 = new LinkedList<userDefined>();
		l1.offer(u1);
		l1.offer(u2);
		l1.offer(u3);
		l1.offer(u4);
	
		//Peek fetches from HEAD and doesn't remove the element
		System.out.println(((userDefined)l1.peek()).getLocalNumber());
		System.out.println(((userDefined)l1.peek()).getLocalNumber());
		System.out.println("===============================================");
		//Poll fetches from HEAD and removes the element
		System.out.println("QUEUE");
		System.out.println(l1.poll().getLocalNumber());
		System.out.println(((userDefined)l1.poll()).getLocalNumber());
		System.out.println("Number of Elements : After poll = "+l1.size());
		System.out.println(((userDefined)l1.poll()).getLocalNumber());
		System.out.println(((userDefined)l1.poll()).getLocalNumber());
		System.out.println("===============================================");
		
		//STACK implementation using LinkedList : LIFO 
		/* 
		 *     ============================ 
		 *     u1, u2, u3, u4   topOfStack
		 *     ============================
		 */
		LinkedList l2 = new LinkedList();
		l2.push(u1);
		l2.push(u2);
		l2.push(u3);
		l2.push(u4);
			
		//Pop fetches from top of stack
		System.out.println("STACK");
		System.out.println(((userDefined)l2.pop()).getLocalNumber());
		System.out.println(((userDefined)l2.pop()).getLocalNumber());
		System.out.println(((userDefined)l2.pop()).getLocalNumber());
		System.out.println(((userDefined)l2.pop()).getLocalNumber());
		System.out.println("===============================================");
		
	}
}
