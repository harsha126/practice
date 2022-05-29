package practice;

import java.awt.Desktop;
import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.zip.DataFormatException;

public class staticPractice {

	public static void main(String[] args) throws Exception {
		
		File file = new File("C:\\Users\\DELL\\Desktop\\hashcodetestcases\\a_example.txt");
//		
//		Desktop desktop = Desktop.getDesktop();
//		String path=file.getPath();
//		hashcourse ss= new hashcourse();
//		int shor =ss.hash("harsha");
//		System.out.println(shor);
		
			FileInputStream is= new FileInputStream(file);
			DataInputStream dis=new DataInputStream(is);
			boolean bc;
			int c;
			
				int count = is.available();
//				while((c=is.read())!=-1) {
//					System.out.println(c);
//				}
				
				while(count!=0) {
					c=dis.readInt();
					System.out.println(c);
					count--;
				}
				
			
			
			
		
		
	}

}
