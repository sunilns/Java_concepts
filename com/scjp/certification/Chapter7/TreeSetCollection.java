package Chapter7;

import java.util.*;

class userDefinedTreeSet implements Comparable<userDefinedTreeSet>{
	private static int pvtNumber=0;
	private int localNumber;
	private String pvtName;
	
	userDefinedTreeSet(String b){
		pvtNumber++;
		localNumber=pvtNumber;
		pvtName=b;
	}
	
	@Override
	public int compareTo(userDefinedTreeSet secObj) {	//this function sort based on ASCENDING NATURAL ORDER
		//We can define our own logic to sort the elements
		//For Ascending Order  ::: Default sorting order 
		return this.pvtName.compareTo(secObj.pvtName); //I'm calling STRING class compareTo() method
		
		//For Descending Order 
		//return secObj.pvtName.compareTo(this.pvtName);
	}
	
	public boolean equals(Object secondObj){ //Argument of type OBJECT
		if ((secondObj instanceof userDefinedTreeSet) && (((userDefinedTreeSet)secondObj).localNumber == this.localNumber)){
			return true;
		}else {
			return false;
		}
	}
	
	public int hashCode(){
		return localNumber * localNumber * localNumber * 20817;
		
		//return 1; 
		//makes all objects to go in same bucket and iterating through will give REVERSE ORDER of insertion!
		//If hashcode is not overridden then iterating through will give UNPREDICTABLE order
		//TRY running this program commenting this METHOD
	}
	
	public int getLocalNumber(){
		return this.localNumber;
	}
	
	public String getLocalName(){
		return this.pvtName;
	}
}

class test {
	
}

public class TreeSetCollection {

	public static void main(String[] args) {
		userDefinedTreeSet u1 = new userDefinedTreeSet("SUNIL");
		userDefinedTreeSet u2 = new userDefinedTreeSet("ANIL");
		userDefinedTreeSet u3 = new userDefinedTreeSet("sunil");
		userDefinedTreeSet u4 = new userDefinedTreeSet("anil");
		userDefinedTreeSet u5 = new userDefinedTreeSet("SUNIL");
		
		TreeSet ts1 = new TreeSet();
		ts1.add(u1);ts1.add(u2);ts1.add(u3);ts1.add(u4);
		ts1.add(u5); //U CANOT insert partially equal object since compareTo function compares Objects on Name 
		ts1.add(u1); //U CANNOT insert exactly same/equal object
		
		Iterator i1 = ts1.iterator(); 
		userDefinedTreeSet temp;
		System.out.println("TreeSet : : : Fetches elements in Sorted Order : Provided COMPARABLE is implemented");
		while(i1.hasNext()){
			temp=(userDefinedTreeSet)i1.next();
			System.out.println(" "+temp.getLocalNumber()+" :  "+temp.getLocalName());
		}
		System.out.println("=======================================================");
		
		TreeSet <test> ts2 = new TreeSet<test>();
		ts2.add(new test());
		ts2.add(new test());
		ts2.add(new test());
		System.out.println("first"+ts2.first());
	}
}
