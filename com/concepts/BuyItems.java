package com.sunil.com.sunil.interview.concepts;


public class BuyItems {
	int[] items = { 100, 89, 75, 50,45, 35, 11,5 };
	int[] itemsBack = items.clone();
	int[] setBit = new int[items.length];
	
	public static void main(String[] args) {		
		BuyItems i1= new BuyItems();
		//Arrays.sort(i1.items);
		
		int availableCredit = 150;
		
		for (int i=0;i<i1.items.length;i++){
			if(availableCredit >= i1.items[i]){
				availableCredit = availableCredit-i1.items[i];
				i1.setElement(i1,i1.items[i]);
			}
			if(availableCredit == 0){
				break;
			}
		}
		
		System.out.println("Elements needed are");
		for(int i=0;i<i1.itemsBack.length;i++){
			if(i1.setBit[i] == 1){
				System.out.print(i1.itemsBack[i] + " : ");
			}
			
		}
	}
	
	void setElement(BuyItems i1, int a){
		int i=0;
		while(!(i1.itemsBack[i] == a)){
			i++;
		}
		setBit[i]=1;
	}
	
}
