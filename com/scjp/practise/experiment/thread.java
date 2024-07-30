package experiment;

public class thread implements Runnable{
    public void run(){
         try
         {
              System.out.println("A");
              Thread.sleep(1000);//Sleep is Static method
              System.out.println("B");
        }catch(InterruptedException ie){
              System.out.println("Thread Interrupted");
         }
    }
    public static void main(String args[]){
    	System.out.printf("12%1$s","13%1$s","14%1$s"); 
    	
    	Thread t=new Thread(new thread());
         t.start(); t.interrupt();
    }
}