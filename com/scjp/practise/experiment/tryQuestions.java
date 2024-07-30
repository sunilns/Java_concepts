package experiment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
class sample1 {
	int val=10;
	public void metho(){
		
	}
}
class sample2 extends sample1 {
	int val=11;
	public void metho(){
		
	}
}

class tryQuestions extends sample2 {
	public static void main(String args[]) throws Exception{
		File f1 = new File("..\\gshdgshdg\\shdghsdg");
		/*		f1.mkdir();
		File f2 = new File(f1,"ytest1");
		File f3 = new File("C:\\SunilJws\\JavaBasicConcepts","ytest2");
		f3.createNewFile();
		f3 = new File("C:\\SunilJws\\JavaBasicConcepts","ytest4");
		f3.mkdir();
		f1 = new File("testDir");
		f1.mkdir();
		f2.createNewFile(); 
		//================================
*/		/*FileReader fr = new FileReader("dfsfgdytest1");
		System.out.println(":"+fr.read());
		FileWriter fw = new FileWriter("dfsfgdytest1");*/
		//FileWriter fw = new FileWriter("d");
		FileReader fr = new FileReader("dfsfgdytest1");
		FileWriter fw = new FileWriter("d");
		/*fw.write("sunil");
		fw.write("Shetty");
		fw.flush();*/
		FileOutputStream fos = new FileOutputStream("test123");
		FileInputStream fis = new FileInputStream("test123");
		
		BufferedReader bfr = new BufferedReader(fr); 
		BufferedWriter bfw = new BufferedWriter(fw);
		ObjectInputStream ois = new ObjectInputStream(fis); 
		
		ObjectOutputStream oos = new ObjectOutputStream(fos); 
		
		//PrintWriter pr = new PrintWriter(fos);
		
		//FileWriter fw = new FileWriter(f1);
		Scanner s1 = new Scanner("Sunil");
		
	}
	
}
