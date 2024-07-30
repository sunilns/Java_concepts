package Chapter1DiffPackage;
import Chapter1.ParentClass;

public class SubClassOfParentClass extends ParentClass{
	void accessParent(){
		//Accessing parent variable using inheritance, both statements are equal
		System.out.println("Value of Variable in Parent:"+numberOne);
		System.out.println("Value of Variable in Parent:"+this.numberOne);
		
		//Cannot access using reference to ParentClass, following will give error
		ParentClass P1 = new ParentClass();
		//System.out.println("Value of Variable in Parent:"+P1.numberOne);
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClassOfParentClass S1 = new SubClassOfParentClass();
		S1.accessParent();
		SubClassInSamePackage s3 = new SubClassInSamePackage();
		s3.accessProtected();
		SubClassInSamePackage1 s4 = new SubClassInSamePackage1();
		s4.accessProtectedFromSubclass();
	}

}

 class  SubClassInSamePackage {
	 synchronized void accessProtected(){
		SubClassOfParentClass s2 = new SubClassOfParentClass();
		s2.accessParent();
		
		//Cannot access Protected inherited variable in diff package; following is invalid
		//System.out.println("Protected variable is:"+s2.numberZero);
	}
}

class SubClassInSamePackage1 extends SubClassOfParentClass {
	void accessProtectedFromSubclass(){
		//Accessing parent variable using inheritance, both statements are equal
		System.out.println("Value of Protected variable :"+numberOne);
		System.out.println("Value of Protected Variable :"+this.numberOne);
		
		//Cannot access using reference to ParentClass, following will give error
		ParentClass P1 = new ParentClass();
		//System.out.println("Value of Variable in Parent:"+P1.numberOne);
	}
}