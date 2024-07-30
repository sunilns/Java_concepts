package Chapter10;
import java.util.*;

public class Antique {
	public static void main(String[] args) {
		List<String> myList = new ArrayList<String> ();
		assert(args.length > 0);
		System.out.println("Still in main!");
	}

	static {
		System.out.println("Inside Test/Baz");
	}
}
