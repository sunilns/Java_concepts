package com.sunil.com.sunil.interview.concepts;

public class CodeCoverageEx {
	private int localVar;

	public CodeCoverageEx(int a) {
		localVar = a;
	}

	public CodeCoverageEx() {
		localVar = 0;
	}

	public int returnSum(int b) {
		return (localVar + b);
	}

	public int returnSum(int b, int c) {
		return (localVar + b + c);
	}

	public int returnSum(int b, int a, int c) {
		return (a + b + c);
	}

	public void switchCheck(int a) {
		switch (a) {
			case 1:
				System.out.println("1");
				break;
			case 2: 
				System.out.println("2");
				break;
			case 3: 
				System.out.println("3");
				break;				
			default: 
				System.out.println("Default");
				break;
		}
	}
}
