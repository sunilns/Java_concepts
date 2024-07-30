package ExamQuestions;

public class MainThreadNameId {
	// public static void main( String[] argss)
	public static void main(String[] args) {
		System.out.println("Current Thread Name is: "
				+ Thread.currentThread().getName());
		System.out.println("Thread Group of Current Thread is: "
				+ Thread.currentThread().getThreadGroup().getName());
		System.out.println("ID of Current Thread is: "
				+ Thread.currentThread().getId());
		System.out
				.println("Parent of Current Thread Group is: "
						+ Thread.currentThread().getThreadGroup().getParent()
								.getName());
	}
}
 