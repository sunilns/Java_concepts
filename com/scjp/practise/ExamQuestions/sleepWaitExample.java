package ExamQuestions;

public class sleepWaitExample implements Runnable {


		int threadID = 0;

		public sleepWaitExample(int threadID) {
			this.threadID = threadID;
		}

		public void run() {
			try {
				Thread.sleep(2000);
				if (threadID == 1) {
					System.out.println("ID:"+threadID);
					wait();
					System.out.println("Oooo");
				} else {
					System.out.println("ID:"+threadID);
					System.out.println("Yeee");
					notifyAll();
				}
			} catch (Exception e) {
				System.out.println("Exception: ID : "+threadID+" name : "+e.getClass());
			}
		}

		public static void main(String args[]) {
			Thread ta = new Thread(new sleepWaitExample(1));
			Thread tb = new Thread(new sleepWaitExample(2));
			ta.start();
			tb.start();
		}

	}