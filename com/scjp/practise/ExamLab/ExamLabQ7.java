package ExamLab;

class XSync implements Runnable {

	public void run() {
		synchronized ("x") {
			System.out.print("X ");
			this.run2();
		}
	}

	public void run2() {
		synchronized ("x") {
			System.out.print("X2 ");
		}
	}
}

public class ExamLabQ7 {
	public static void main(String args[]) {
		XSync ns = new XSync();
		Thread t1 = new Thread(ns); //same Target
		Thread t2 = new Thread(ns); //same Target
		t1.start();
		t2.start();
	}
}
