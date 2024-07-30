package com.sunil.com.sunil.interview.concepts;

import java.util.ArrayList;

class Consumer extends Thread{
	ConsumerProducerProblem cp1;
	public void run(){
	try	{	
			synchronized(cp1.al1){		
				int jobLocation=0;
				while (cp1.al1.size()==0){
					cp1.wait();
				}
				while (cp1.al1.size() != cp1.MIN_LENGTH){
					System.out.println("Consumer took : "+cp1.al1.remove(jobLocation));
				}
				notifyAll();
			 }
			
		}catch(Exception e1){}
	}
	
	public void setConsumerProducerProblem(ConsumerProducerProblem temp1){
		cp1=temp1;
	}
	
	public ConsumerProducerProblem getConsumerProducerProblem(){
		return cp1;
	}
}

class Producer extends Thread{
	ConsumerProducerProblem cp1;
	public void run(){
		try{
				
			synchronized(cp1.al1){
				int value=1;
			
				while (cp1.al1.size()==cp1.MAX_LENGTH){
					cp1.wait();
				}
				while (cp1.al1.size() != cp1.MAX_LENGTH){
					cp1.al1.add(""+value);
					System.out.println("Producer: put : "+ value);
					value++;
				}
				 notifyAll();
			 }
		}catch(Exception e1){}
	}
	
	public void setConsumerProducerProblem(ConsumerProducerProblem temp1){
		cp1=temp1;
	}
	
	public ConsumerProducerProblem getConsumerProducerProblem(){
		return cp1;
	}
}


public class ConsumerProducerProblem {
	ArrayList<String> al1 = new ArrayList<String>();
	int MAX_LENGTH = 10;
	int MIN_LENGTH = 0;
	
	public static void main(String[] args) {
		ConsumerProducerProblem mainObj = new ConsumerProducerProblem();
		Consumer cm1 = new Consumer();
		Producer pr1 = new Producer();
		cm1.setConsumerProducerProblem(mainObj);
		pr1.setConsumerProducerProblem(mainObj);
		
		
		pr1.start();
		cm1.start();
		
	}
}
