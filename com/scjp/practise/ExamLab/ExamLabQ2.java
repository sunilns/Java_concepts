package ExamLab;
import java.lang.Thread;

public class ExamLabQ2 implements Runnable{
    public void run(){
         try
         {    System.out.println("A");
      //   		this gives compile time error
         	   Thread.sleep(1000);
              	this.wait();
         
         		Thread.sleep(1000); //When com.sunil.interview.programs.thread sleeps and No one interrupt the Thread then it will not throw
         		//InterruptedException exception. InterruptedException thrown only in case com.sunil.interview.programs.thread is interrupted.
              System.out.println("B");
        }catch(InterruptedException ie){
        	System.out.print("Thread Interrupted");
        }catch(IllegalMonitorStateException ie1){
        	System.out.print("IllegalMonitorStateException Occured");
        }
    }
    public static void main(String args[]){
         Thread t=new Thread(new ExamLabQ2());
         t.start(); 
         //t.interrupt();
    } 
}
