package Chapter9;

public class ThreadRunnable{
	public void run (){
		System.out.println("Inside Run " + Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		ThreadRunnableSukesh t1 = new ThreadRunnableSukesh();
		ThreadRunnableSunil t2 = new ThreadRunnableSunil();
		//t1.start(); //cannot call start on runnable BUT can call run() method on Runnable
//		t1.run();
		
		Thread mSukeshThread = new Thread(t1,"Sukesh");
		mSukeshThread.start();
		
		//Thread class itself implements Runnable hence following is valid
		Thread mSunilThread = new Thread(t2,"Sunil");
		mSunilThread.start(); 
		//System.out.println("Name of theread: "+t3.getName());
		
		
	}

}

class ThreadRunnableSukesh implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (Thread.currentThread().getName()) {
			System.out.println("Inside Run " + Thread.currentThread().getName());
			for (int i = 0 ; i<=14;i+=2){
				System.out.println(7*i);
				Thread.currentThread().notifyAll();
				run();
			}
		}
	}
	
}

class ThreadRunnableSunil implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		synchronized (Thread.currentThread().getName()) {
			System.out.println("Inside Run " + Thread.currentThread().getName());
			try {
				for (int i = 1 ; i<=15;i+=2){
					System.out.println(7*i);
					Thread.currentThread().wait();
					run();
				}
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(Thread.currentThread().getName()+" Throwed InterruptedException");
				e.printStackTrace();
			}
		}
	}
	
}

