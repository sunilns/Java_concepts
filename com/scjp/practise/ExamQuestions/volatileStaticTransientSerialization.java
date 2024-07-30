package ExamQuestions;

import java.util.*;
import java.io.*;

public class volatileStaticTransientSerialization implements Serializable {
	/*Rule:
	* Static: Will not be Serialized and written to file and Maintains its value across serialization/De-serialization 
	* Transient: Will not be Serialized and written to file and initalized to 'default' value i.e '0' for int etc
	* Volatile: Will be Serialized and written to file. 
	*/
	public transient int a = 1;
	public volatile int b = 1;
	public static int c = 1;

	public static void main(String args[]) throws Exception {
		volatileStaticTransientSerialization oba1 = new volatileStaticTransientSerialization();
		oba1.a = 2;
		oba1.b = 3;
		oba1.c = 4;
		saveObj(oba1, "DD.ser");
		volatileStaticTransientSerialization oba2 = (volatileStaticTransientSerialization) openObj("DD.ser");
		System.out.print("Sum is:" + (oba2.a + oba2.b + oba2.c));
		System.out.println("");
		
		oba1.a = 3;
		oba1.b = 7;
		oba1.c = 4;
		saveObj(oba1, "DD.ser");
		oba2 = (volatileStaticTransientSerialization) openObj("DD.ser");
		System.out.print("Sum is:" + (oba2.a + oba2.b + oba2.c));
		System.out.println("");
	}

	static void saveObj(volatileStaticTransientSerialization t1, String s1) throws Exception {
		FileOutputStream f1 = new FileOutputStream(s1);
		ObjectOutputStream o1 = new ObjectOutputStream(f1);
		o1.writeObject(t1);
	}

	static Object openObj(String s2) throws Exception {
		FileInputStream f2 = new FileInputStream(s2);
		ObjectInputStream i1 = new ObjectInputStream(f2);
		return i1.readObject();
	}
}
