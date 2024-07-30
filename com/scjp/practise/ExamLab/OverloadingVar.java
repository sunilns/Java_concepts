package ExamLab;

public class OverloadingVar {
	
	void invade(short s1){
		System.out.println("Inside Normal");
	}
	void invade(Short s3){
		System.out.println("Inside wrapper normal");
	}
	
	void invade (short... s2){
		System.out.println("Inside vararg version");
	}
	 
	/*void invade (short[] s2){//This declaration is DUPLICATE of invade (short... s2)
		System.out.println("Inside normal array");
	}*/
	
	void invade(Short... s3){ 
		System.out.println("Inside wrapper varargs");
	}
	
	/*void invade(Short[] s3){ //This declaration is DUPLICATE of invade(Short... s3)
		System.out.println("Inside wrapper array");
	}*/
	
	public static void main(String[] args) {
		short[] s2 = new short [] {1,2,3};
		byte b1 = 10;
		//long l1 = 100l;
		new OverloadingVar().invade((short)7);
		new OverloadingVar().invade(s2);
		new OverloadingVar().invade(b1);
		//new OverloadingVar().invade(l1);
	}
}
