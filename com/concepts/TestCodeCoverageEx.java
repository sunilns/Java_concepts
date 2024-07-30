package com.sunil.com.sunil.interview.concepts;

public class TestCodeCoverageEx {
	
	public void testReturnSum(){
		
		CodeCoverageEx e1 = new CodeCoverageEx();
		
		e1.returnSum(10);
		
		e1.returnSum(5, 15);
		
		e1.returnSum(1, 2, 3);
		
		CodeCoverageEx e2 = new CodeCoverageEx(3);
		
		e2.returnSum(10);
		
		e2.returnSum(5, 15);
		
		e2.returnSum(1, 2, 3);
	}
	
	public void testCheckSwitch(){
		CodeCoverageEx e1 = new CodeCoverageEx();
		
		e1.switchCheck(1);
		
		e1.switchCheck(10);
	}
	
	public static void main(String arg[]){
		TestCodeCoverageEx t1 = new TestCodeCoverageEx();
		t1.testReturnSum();
		t1.testCheckSwitch();
		
	}
}
