package ExamLab;

public class ExamLabQuestions {

	static class B extends ExamLabQuestions { // Inner class extening OUTER
												// class!
		public void capture() {
			System.out.println("Cap:ExamLabQuestions.B");
		}
	}

	static class C extends B { // Inner class extending inner class
		public void capture() {
			System.out.println("Cap:ExamLabQuestions.C");
		}
	}

	public void capture() {
		System.out.println("Cap:ExamLabQuestions");
	}

	public static void main(String args[]) {
		ExamLabQuestions ob = new C(); // Object of C class
		ob.capture();

		ExamLabQuestions ob1 = new ExamLabQuestions();
		ob1.capture();
	}
}