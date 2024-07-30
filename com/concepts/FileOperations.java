package com.sunil.com.sunil.interview.concepts;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class FileOperations {

	public static void main(String[] args) {
		char[] s1=new char[10];
		try{
			File f2 = new File("Suhani.txt");
			RandomAccessFile ra1 = new RandomAccessFile(f2,"rw");
			long position = ra1.getFilePointer();
			String s2=null;
			while(((s2=ra1.readLine())!=null)){
				if(s2.contains("this")){
					s2 = s2.replaceAll("this", "that");
					ra1.seek(position);
					ra1.writeChars(s2);
				}
			}
			ra1.close();
			FileOutputStream fo1 = new FileOutputStream("Text.txt");
			ObjectOutputStream os1 = new ObjectOutputStream(fo1);
			
			os1.writeObject(new String("sunil"));
			
		}catch(IOException ie1){
			ie1.printStackTrace();
			//ra1.close();
		}
		
		Scanner s3 = new Scanner(System.in);
		

		
	}

}
