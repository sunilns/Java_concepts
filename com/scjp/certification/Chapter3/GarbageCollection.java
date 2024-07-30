package Chapter3;

public class GarbageCollection {
	public static void main(String[] args) {
		String s1="Sunil";
		
		System.out.println("Requesting for GC() using System");
		System.gc();
		
		System.out.println("Requesting for GC()using RunTime: ");
		Runtime rt1 = Runtime.getRuntime();
		rt1.gc(); 
		System.out.println("total memory: "+rt1.totalMemory());
		System.out.println("total processors: "+rt1.availableProcessors());
		System.out.println("total FREE memory: "+rt1.freeMemory());
	}

}
