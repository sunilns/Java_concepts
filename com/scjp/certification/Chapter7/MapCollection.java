package Chapter7;

import java.util.*;

class userDefinedMap{
	private static int pvtNumber=0;
	private int localNumber;
	private String pvtName;
	
	userDefinedMap(String b){
		pvtNumber++;
		localNumber=pvtNumber;
		pvtName=b;
	}
	
	public boolean equals(Object secondObj){
		if ((secondObj instanceof userDefinedMap) && (((userDefinedMap)secondObj).localNumber == this.localNumber)){
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
	
	/*	
	public String toString(){
		return "\nIn overriden toString() method\n"+"localNumber is : "+this.localNumber+" localName is: "+this.pvtName+"\n";
	}
	*/
}

public class MapCollection {

	public static void main(String[] args) {
		userDefinedMap u1 = new userDefinedMap("SUNIL");
		userDefinedMap u2 = new userDefinedMap("ANIL");
		userDefinedMap u3 = new userDefinedMap("sunil");
		userDefinedMap u4 = new userDefinedMap("anil");
		userDefinedMap u5 = new userDefinedMap("SUNIL");
		
		HashMap hm1 = new HashMap();

		hm1.put("One", u1);
		hm1.put("Two", u2);
		hm1.put("Three", u3);
		hm1.put("Four", u4);
		hm1.put("Five", u5);	
		hm1.put("Six", u5); //Will insert new entry "Six" 
		hm1.put("One", u2); //In case of Maps, if same Key is given then value will be overwritten
							//Will overrite "One" value
		hm1.put("Two", u5); //Will overrite "Two" value
				
		Iterator i1 = hm1.values().iterator();
		Iterator i2 = hm1.keySet().iterator();
		userDefinedMap temp;
		
		System.out.println("HashMap : : : Fetches elements in Random order : Unpredictable");
		System.out.println("I2:"+hm1.keySet().toString());
		while(i1.hasNext()){
			temp=(userDefinedMap)i1.next();
			System.out.println("Key="+i2.next()+" ::: "+temp.getLocalNumber()+" :  "+temp.getLocalName());
		}
		System.out.println("=======================================================");
		
		HashMap hm2 = new HashMap();
		hm2.put(u1, u1);
		hm2.put(u2, u2);
		hm2.put(u2, u3);
		
		i1 = hm2.values().iterator();
		i2 = hm2.keySet().iterator();
		System.out.println("HashMap : : : Fetches elements in Random order : Unpredictable");
		userDefinedMap temp2;
		while(i2.hasNext()){
			temp=(userDefinedMap)i2.next();
			temp2=(userDefinedMap)i1.next();
			System.out.println(" ::: "+temp.getLocalNumber()+" :  "+temp.getLocalName()+" ::: "+temp2.getLocalNumber()+" :  "+temp2.getLocalName());
		}
		System.out.println("=======================================================");
		

		LinkedHashMap lhm1 = new LinkedHashMap();
		lhm1.put("Five", u5);
		lhm1.put("One", u1);
		lhm1.put("Two", u2);
		lhm1.put("Three", u3);
		lhm1.put("Four", u4);
		//In case of Maps, if same Key is given then value will be overwritten
		lhm1.put("Six", u5); //Will insert new entry "Six" 
		lhm1.put("One", u2); //Will overwrite "One" value
		System.out.println("Insert into same KEY!: "+lhm1.put("Two", u5)); //Will overrite "Two" value
		
		i1 = lhm1.values().iterator();
		i2 = lhm1.keySet().iterator();
		System.out.println("LinkedHashMap : : : Fetches elements in Inserted Order");
		
		
		while(i1.hasNext()){
			temp=(userDefinedMap)i1.next();
			System.out.println("Key="+i2.next()+" ::: "+temp.getLocalNumber()+" :  "+temp.getLocalName());
		}
		System.out.println("=======================================================");
	}
}
