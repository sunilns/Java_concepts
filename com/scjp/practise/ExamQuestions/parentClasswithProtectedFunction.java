package ExamQuestions;

class TSuper {
	protected TSuper getCls() {
		return new TSuper();
	}

	String getValue() {
		return "In Super";
	}

	public String toString() {
		return "[Super Class]";
	}
}

class TSub extends TSuper {
	
	 public TSub getCls(){ return new TSub(); }
	 
	protected String getValue() {
		return "In Sub";
	}

	public String toString() {
		return "[Sub Class]";
	}
}

public class parentClasswithProtectedFunction {

	public static void main(String args[]) {
		TSuper ts=new TSub();
		//TSub ts = new TSub();
		
		ts.getCls();
		Object ob = ts.getCls().getValue();
		System.out.println(ob.toString());
	}
}
