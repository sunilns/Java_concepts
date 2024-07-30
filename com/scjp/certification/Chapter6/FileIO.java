package Chapter6;
import java.io.*;

public class FileIO {
	public static void main(String[] args) {
		try{
			File f1=new File("test.txt");
			f1.createNewFile(); //This API checks if the file exist? if exist it doesnt do anything, 
			//If file NOT exist, it will create one.
			System.out.println("re-creating file:"+f1.createNewFile());//if file already exist, it will 
																	//return false else TRYE
			if(f1.exists()){
				System.out.println("File with name test.txt already exist...Start using it");
				System.out.println("Directory?:"+f1.isDirectory());
				System.out.println("File?:"+f1.isFile());
				System.out.println("Absolute?:"+f1.isAbsolute());
				System.out.println("Hidden File?:"+f1.isHidden());
				System.out.println("Is EXECUTE permission there for file? ?:"+f1.canExecute());
				System.out.println("Is READ permission there?:"+f1.canRead());
				System.out.println("Is WRITE permission there?:"+f1.canWrite());
				System.out.println("Absolute Path of file:"+f1.getAbsolutePath());
				System.out.println("Colonical PATH of file:"+f1.getCanonicalPath());
				System.out.println("Relative PATH:"+f1.getPath());
				
				System.out.println("List all files with same name:"+f1.listFiles());
				//System.out.println("DELETE file:"+f1.mkdir());//to make directory
				System.out.println("Make FILE writable:"+f1.setWritable(true));
				
				//System.out.println("DELETE file :"+f1.delete());
			}else {
				System.out.println("File with name test.txt DOES NOT exist...Creating one");
				f1.createNewFile();
			}
						
			FileWriter fw = new FileWriter(f1);
			/* SET of FileWritter commands to write into file
			fw.append("SUN");
			fw.write("SHETTY"); 
			fw.flush();
			fw.close();*/
			
			//SET of BufferedWritter commands to write into file
			BufferedWriter b1 = new BufferedWriter(fw);
			b1.write("Sunil Shetty"); //If the FILE already exist it's contents will be overwritten.
			b1.newLine();b1.newLine();
			b1.write("Hash Shetty");
			b1.flush();
			b1.close();
			
			//FileReader f2 = new FileReader("test.txt");
		}catch(IOException e1){
			e1.printStackTrace();
		}
	}
}