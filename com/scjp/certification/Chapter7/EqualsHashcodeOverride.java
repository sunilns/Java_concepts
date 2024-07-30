package Chapter7;

import java.util.Random;

class impleEqualsHashcode{
	private static int pvtNumber=0;
	private int localNumber;
	private String pvtName;
	
	impleEqualsHashcode(String b){
		pvtNumber++;
		localNumber=pvtNumber;
		pvtName=b;
	}
	
	public boolean equals(Object secondObj){
		//if ((secondObj instanceof impleEqualsHashcode) && ((secondObj).localNumber == this.localNumber)){
		if ((secondObj instanceof impleEqualsHashcode) && (((impleEqualsHashcode)secondObj).localNumber == this.localNumber)){
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
	
	public String toString(){
		return "In overriden toString() method\n"+"localNumber is : "+this.localNumber+" localName is: "+this.pvtName;
	}

}

public class EqualsHashcodeOverride {
	
	public static void main(String[] args) {
		impleEqualsHashcode i1 = new impleEqualsHashcode("Sunil");
		impleEqualsHashcode i2 = i1;
		impleEqualsHashcode i3 = new impleEqualsHashcode("Sanil");
		
		System.out.println("From Main");
		System.out.println("i1 and i2 are equal? :"+i1.equals(i2));
		System.out.println("i1 and i2 are '=='? :"+(i1 == i2));
		System.out.println("i1 and i3 are equal? :"+i1.equals(i3));
		System.out.println("i1 and i3 are '=='? :"+(i1 == i3));

		System.out.println(" i1 : toString () call :::::"+i1);
		System.out.println(" i2 : toString () call :::::"+i2);
		System.out.println(" i3 : toString () call :::::"+i3);
	
		System.out.println(" i1 : hashCode() call :::::"+i1.hashCode());
		System.out.println(" i2 : hashCode() call :::::"+i2.hashCode());
		System.out.println(" i3 : hashCode() call :::::"+i3.hashCode());
	}

}
