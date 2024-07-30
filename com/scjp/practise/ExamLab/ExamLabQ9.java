package ExamLab;

class A {

	A() throws InterruptedException {
		System.out.print(" A ");
		Thread.sleep(1000);
		System.out.print(" B ");
	}

}

public class ExamLabQ9 extends A implements Runnable {
	// This class constructor(default) cannot handle the exception thrown by
	// super class
	// constructor A(). Hence User should define default constructor for this
	// class.

	ExamLabQ9() throws InterruptedException {
		System.out.print(" ExamLabQ9 ");
	}

	public void run() {
		System.out.print(" C ");
	}

	public static void main(String argv[]) {
		try {
			Thread t = new Thread(new ExamLabQ9());
			t.start();
		} catch (Exception e1) {

		}

	}

}
