package Chapter7;

import java.util.*;

class userDefinedTreeMap implements Comparable<userDefinedTreeMap>{
	private static int pvtNumber=0;
	private int localNumber;
	private String pvtName;
	
	userDefinedTreeMap(String b){
		pvtNumber++;
		localNumber=pvtNumber;
		pvtName=b;
	}
	
	@Override
	public int compareTo(userDefinedTreeMap secObj) {	//this function sort based on ASCENDING NATURAL ORDER
		//We can define our own logic to sort the elements
		//For Ascending Order  ::: Default sorting order 
		return this.pvtName.compareTo(secObj.pvtName); //I'm calling STRING class compareTo() method
		
		//For Descending Order 
		//return secObj.pvtName.compareTo(this.pvtName);
	}
	
	public boolean equals(Object secondObj){ //Argument of type OBJECT
		if ((secondObj instanceof userDefinedTreeMap) && (((userDefinedTreeMap)secondObj).localNumber == this.localNumber)){
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

public class TreeMapCollection {

	public static void main(String[] args) {
		userDefinedTreeMap u1 = new userDefinedTreeMap("SUNIL");
		userDefinedTreeMap u2 = new userDefinedTreeMap("ANIL");
		userDefinedTreeMap u3 = new userDefinedTreeMap("sunil");
		userDefinedTreeMap u4 = new userDefinedTreeMap("anghghgil");
		userDefinedTreeMap u5 = new userDefinedTreeMap("SUNIL");
		
		TreeMap ts1 = new TreeMap();
		ts1.put(u1, u1);
		ts1.put(u2, u2);
		ts1.put(u3, u3);
		ts1.put(u4, u4);
		ts1.put(u5, u5); //duplicate since compareTo() uses name as parameter and u5 has "SUNIL" which is duplicate	
		System.out.println("result:"+ts1.put(u1, u4)); //Duplicate key u1, which is already inserted.
		
		Iterator i1 = ts1.values().iterator();
		Iterator i2 = ts1.keySet().iterator();
		userDefinedTreeMap temp;
		
		System.out.println("TreeMap : : : Fetches elements in compareTo() logic order");
		System.out.println("I2:"+ts1.keySet().toString());
		while(i2.hasNext()){
			temp=(userDefinedTreeMap)i2.next();
			System.out.println(" ::: "+temp.getLocalNumber()+" :  "+temp.getLocalName());
		}
		System.out.println("=======================================================");
	}
}
