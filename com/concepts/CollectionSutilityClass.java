package com.sunil.com.sunil.interview.concepts;

import java.util.*;
import java.util.Collections;
import java.util.regex.*;

public class CollectionSutilityClass {
	private ArrayList<String> classArrayList;
	private LinkedList<String> classLinkedList;
	
	
	public void setClassArrayList(ArrayList<String> temp){
		classArrayList = temp;
	}
	
	public ArrayList<String> getClassArrayList(){
		return classArrayList; 
	}
	
	public void setClassLinkedList(LinkedList<String> temp){
		classLinkedList = temp;
	}
	
	public LinkedList<String> getClassLinkedList(){
		return classLinkedList; 
	}
	
	ArrayList<String> buildArrayList(){
		ArrayList<String> temp = new ArrayList<String> ();
		temp.add("Sunil");temp.add("Anil");temp.add("Sanil");
		temp.add("Hash");temp.add("Shetty");temp.add("Suhani");
		return temp;
	}
	
	LinkedList<String> buildLinkedList(){
		LinkedList<String> temp = new LinkedList<String> ();
		temp.add("Sunil");temp.add("Anil");temp.add("Sanil");
		temp.add("Hash");temp.add("Shetty");temp.add("Suhani");
		return temp;
	}
	
	public static void main(String[] args) {
		CollectionSutilityClass cuObj = new CollectionSutilityClass(); 
		cuObj.setClassArrayList(cuObj.buildArrayList());
		
		System.out.println("Before Sort : "+cuObj.getClassArrayList().toString());
		Collections.sort(cuObj.getClassArrayList());
		System.out.println("After Sort : "+cuObj.getClassArrayList().toString());
		System.out.println("Binary Search Result:"+Collections.binarySearch(cuObj.getClassArrayList(), "Suhani"));

		//Reverse the String but Words should NOT be reversed... 
		
		String name = "My Name is        Sunil    Shetty"; 
		String result="";
		String word="";
		int first=0;
		for (int i = 0; i<name.length();i++){
			if((name.charAt(i) == ' ') && first!=1){
				result = " "+word+result;
				word="";
				first=1;
			}else if(first==1 && (name.charAt(i) == ' ')){
				result =name.charAt(i)+result;
			}else {
				word=word+name.charAt(i);
				first=0;
			}
		}
		result =word+result;
		System.out.println("Final Result:|"+result+"|");
		
		StringTokenizer st1 = new StringTokenizer("My name is Sunil");
		
		while(st1.hasMoreTokens()){
			System.out.print(":"+st1.nextToken());
		}
		System.out.println("");
		System.out.println("");
		Pattern p1= Pattern.compile("Sunil");
		Matcher m1 = p1.matcher("My Name Is Sunil");
		
		while(m1.find()){
			System.out.println(""+m1.group());
		}	
		
		
	}

}
