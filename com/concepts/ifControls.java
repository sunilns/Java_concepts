package com.sunil.com.sunil.interview.concepts;

public class ifControls {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num=012;
		//int num=10.0f;
		
		if(num == 10.0f){
			System.out.println("true");
			
			int z =5;
			if(++z > 5 || z++ > 7){ //SHORT CIRCUIT operator ||( one more is &&)
				z++;
				System.out.println("Z value is : "+z);
			}

			
			z=5;
			if((++z > 5)^(++z > 7)){ //NON-SHORT CIRCUIT operator ^. EXACLY one   
		                            //test must be true 
				z++;
				System.out.println("Z value is;;;; : "+z);
			} 


		}

	}

}
