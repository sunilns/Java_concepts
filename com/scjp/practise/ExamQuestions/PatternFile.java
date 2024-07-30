package ExamQuestions;
import java.io.File;
import java.util.regex.*;

public class PatternFile {

	public static void main(String[] args) {
		Pattern p1 = Pattern.compile("Sun ");
		Matcher m1 = p1.matcher("Sun Certified Java Programmer");
		while(m1.find()){
			System.out.println(m1.start()+" : "+m1.group()+":");
		}
	try{	
		File f1 = new File("Trttrsdsdsd.txt");
		File f2 = new File("Test12asasasa3.txt");
		System.out.print(f1.exists()+" ");
		System.out.print(f1.createNewFile()+" ");
		f1.renameTo(f2);
		System.out.print(f1.exists()+" ");
		System.out.print(f2.exists()+" ");
		//System.out.print(f1.createNewFile()+" ");
	}catch (Exception e1){
		
	}	
	}

}
 