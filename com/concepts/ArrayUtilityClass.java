package com.sunil.com.sunil.interview.concepts;
import java.util.Arrays;
import java.util.List;

public class ArrayUtilityClass {
	private int[] numbers;
	
	ArrayUtilityClass(){
		numbers = new int[] {1,4,2,5,7,3,9,6,8};
	}
	
	int[] getArrayNumbers(){
		return numbers;
	}
	
	public void showArray(int[] result){
		for(int a : result){
			System.out.print(a+" : ");
		}
	}
	
	public void showArray(String[] result){
		for(String a : result){
			System.out.print(a+" : ");
		}
	}
	
	public static void main(String[] args) {
		ArrayUtilityClass fObj = new ArrayUtilityClass();
		
		/*System.out.println("Array as list:"+Arrays.asList(fObj.getArrayNumbers()));
		List lObj = Arrays.asList(fObj.getArrayNumbers());
		
		int localLength=0;
		while(localLength < fObj.getArrayNumbers().length ){
			System.out.println(" : "+lObj.get(localLength));
			localLength++;
		}*/
		
		int[] localArray = fObj.getArrayNumbers();
		System.out.println("Before Sort");
		fObj.showArray(localArray);
		System.out.println("");
		System.out.println("After Sort");
		Arrays.sort(localArray);
		fObj.showArray(localArray);
		System.out.println("");
		System.out.println("Before Sort");
		fObj.showArray(fObj.numbers);
		System.out.println("After Sort");
		Arrays.sort(fObj.getArrayNumbers());
		fObj.showArray(fObj.numbers);
		System.out.println("");
		System.out.println("==============================");
		System.out.println("Index of key '5' is : "+Arrays.binarySearch(localArray, 10));
		
		System.out.println("==============================");
		String[] localStringArray = new String[]{"Sunil","Anil","Waman"};
		Arrays.sort(localStringArray);
		fObj.showArray(localStringArray);
		System.out.println("");
		System.out.println("Key found at : "+Arrays.binarySearch(localArray, 4, 9, 6));
		System.out.println("");
		int[] localArrayCopy = Arrays.copyOf(localArray, 10);
		fObj.showArray(localArrayCopy);
		System.out.println("");
		localArrayCopy= Arrays.copyOfRange(localArray, 3, 9);
		fObj.showArray(localArrayCopy);
		System.out.println("");
		int[] localArrayCopy2 = Arrays.copyOf(localArray, 9);
		fObj.showArray(localArray);
		System.out.println("");
		fObj.showArray(localArrayCopy2);
		System.out.println("");
		System.out.println("two identical arrays are equal : "+Arrays.equals(localArray, localArrayCopy2));
		System.out.println("two not identical arrays are equal? : "+Arrays.equals(localArray, localArrayCopy));
		
		Arrays.fill(localArrayCopy2, 2);
		fObj.showArray(localArrayCopy2);
		
		System.out.println("@@@"+Arrays.toString(localArray));
		
		List l1 =Arrays.asList(localArray);
		System.out.println("Size : "+l1.size());
		System.out.println(l1.get(0).toString());
		/*while(!l1.isEmpty()){
			System.out.println(l1.remove(i));
			i++;
		}*/
		
	}

}