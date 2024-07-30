package ExamQuestions;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

public class keySetSubSetFunctions {
	public static void main(String[] args) {

		NavigableMap<String, String> nmp = new TreeMap<String, String>();
		nmp.put("S", "Scala");
		nmp.put("E", "EJB");
		nmp.put("P", "Persistence");
		nmp.put("G", "Groovy");
		nmp.put("G", "Groovysdsd");

		NavigableSet<String> keys = (NavigableSet<String>) nmp.keySet(); // keySet() Returns set 
		NavigableSet<String> subKeys = keys.subSet("E", true, "P", false); // subSet() Returns NavigableSet
		System.out.println("");
		for (String val : subKeys) {
			System.out.print(val);
		}
		System.out.println("");
		for (String val : nmp.keySet()) {
			System.out.print(val);
		}
		System.out.println("");
		System.out.println("Size:"+nmp.size());

	}

}
