package Chapter1;

interface interOne {
	public void methodOneNeedImplemntiation();
	public void methodTwoNeedImplemntiation();
}

interface intertwo extends interOne{
	/*public void methodOneNeedImplemntiation(){ //NOT POSSIBLE
		
	}*/
	abstract public void methodofInterTwo();
}

abstract class AbstractClassOne implements intertwo{
	public void methodOneNeedImplemntiation(){ //CAN implement Interface method
		System.out.println("I have option of implementing interface even Being Abstarct!");
	};
	abstract void readMethod();
	public abstract void readSecond();
	void nonAbstractRead() {
		System.out.println("In Non-Abstract Read Method");
	}
}

abstract class OneMoreAbstractClass extends AbstractClassOne {
	public void readMethod(){ //implementing Abstract method in Abstract class!!! 
		//CAN implement abstract method
		System.out.println("Inside One more Abstract Class");
	}

	abstract void abstractMethod();
	
	//AbstractClassOne lAbstractClassOne = new AbstractClassOne();

}

public class AbstractClass extends OneMoreAbstractClass {
	void abstractMethod() {
		
	}
	public void readSecond() {
		
	}
	public static void main(String [] arg){
		System.out.println("In Main");
		OneMoreAbstractClass lOneMoreAbstractClass = new AbstractClass();
		lOneMoreAbstractClass.readMethod();
		lOneMoreAbstractClass.methodofInterTwo();
		AbstractClass m1 = new AbstractClass();
		m1.abstractMethod();
		m1.readSecond();
		m1.readMethod();
	}
	@Override
	public void methodTwoNeedImplemntiation() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void methodofInterTwo() {
		// TODO Auto-generated method stub
		System.out.println("In methodofInterTwo");
	}
}

