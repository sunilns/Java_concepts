package Chapter9;
import java.util.*;
import java.lang.Thread;
import java.lang.Thread.*;
import java.lang.Runnable;

//public class Antique implements Runnable {
public class Antique extends Thread {
	public static void main(String[] args) {
		System.out.println("In main:"+Thread.currentThread().getName());
		System.out.println("In Main:"+Thread.currentThread().getId());
		//new Antique().run();
		//new Antique().start();
		new Thread(new Antique()).start();
		//new Thread(new Antique()).run();
		//new Thread(new Antique());
		
	}
	
	
	void go(long id){
		System.out.println("In Thread Go:"+id);
	}
	@Override
	public void run() {
		System.out.println("Inside run::: calling go"+Thread.currentThread().getId());
		go(Thread.currentThread().getId());
	}
	
}
