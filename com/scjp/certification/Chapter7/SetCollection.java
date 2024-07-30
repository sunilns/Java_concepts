package Chapter7;

import java.util.*;

class userDefinedSet{
	private static int pvtNumber=0;
	private int localNumber;
	private String pvtName;
	
	userDefinedSet(String b){
		//pvtName 
		//new StringBuilder("Sunil")
		pvtNumber++;
		localNumber=pvtNumber;
		pvtName=b;
	}
	
/*	public boolean equals(Object secondObj){
		if ((secondObj instanceof userDefinedSet) && (((userDefinedSet)secondObj).localNumber == this.localNumber)){
			return true;
		}else {
			return false;
		}
	}*/
	
	public int hashCode(){
		//return localNumber * localNumber * localNumber * 20817;
		return 87878781; 
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

class testing {
	private int number;
	testing(int num){
		number=num;
	}
	public int getNumber(){
		return number;
	}
} 
public class SetCollection {

	public static void main(String[] args) {
		userDefinedSet u1 = new userDefinedSet("SUNIL");
		userDefinedSet u2 = new userDefinedSet("ANIL");
		userDefinedSet u3 = new userDefinedSet("sunil");
		userDefinedSet u4 = new userDefinedSet("anil");
		userDefinedSet u5 = new userDefinedSet("SUNIL");
		
		HashSet h1 = new HashSet();
		
		h1.add(u1);h1.add(u2);h1.add(u3);h1.add(u4);
		h1.add(u5); //U CAN insert partially equal object. String equal but hashcode is not equal. 
		System.out.println("Insert U1 again!: "+h1.add(u1)); //U CANNOT insert exactly same/equal object
		Iterator i1 = h1.iterator();
		
		userDefinedSet temp;
		System.out.println("HashSet : : : Fetches elements in Random order : Unpredictable");
		while(i1.hasNext()){
			temp=(userDefinedSet)i1.next();
			System.out.println(" "+temp.getLocalNumber()+" :  "+temp.getLocalName());
		}
		System.out.println("=======================================================");
		
		LinkedHashSet lh1 = new LinkedHashSet();
		lh1.add(u1);lh1.add(u2);lh1.add(u3);lh1.add(u4);
		lh1.add(u5); //U CAN insert partially equal object 
		System.out.println("Insert U1 again!: "+lh1.add(u1)); //U CANNOT insert exactly same/equal object
		
		i1 = lh1.iterator();
		System.out.println("LinkedHashSet : : : Fetches elements in Inserted Order");
		while(i1.hasNext()){
			temp=(userDefinedSet)i1.next();
			System.out.println(" "+temp.getLocalNumber()+" :  "+temp.getLocalName());
		}
		System.out.println("=======================================================");
		
		//FOR TREESET AND TREEMAP COMPARABLE should be overrriden or implemented
		/*TreeSet ts1 = new TreeSet();
		ts1.add(u1);ts1.add(u2);ts1.add(u3);ts1.add(u4);
		i1 = ts1.iterator();
		System.out.println("TreeSet : : : Fetches elements in Ascending Order[ (RED-BLACK) tree], in natural order");
		while(i1.hasNext()){
			temp=(userDefinedSet)i1.next();
			System.out.println(" "+temp.getLocalNumber()+" :  "+temp.getLocalName());
		}
		System.out.println("======================================================="); */
		
		//IT is perfectly legal to insert Object of class which has not override equals() and hashcode(). 
		//In such case, inserted object cannot be retrieved. 
		testing t1= new testing(1);
		testing t2= new testing(2);
		testing t3= new testing(3);
		
		
		HashSet h3 = new HashSet();
		h3.add(t1);		h3.add(t2);		h3.add(t3);
		
		i1 = h3.iterator();
		//search element 
		testing t4= new testing(3);
		
		testing temp1;
		System.out.println("HashSet : : : Fetches elements in Random order : Unpredictable");
		while(i1.hasNext()){
			temp1=(testing)i1.next();
			System.out.println(" "+temp1.getNumber());
		}
		System.out.println("Search t4 with value '3' : "+h3.contains(t4));
		
		System.out.println("=======================================================");
	}
}
