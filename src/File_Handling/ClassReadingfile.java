package File_Handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ClassReadingfile {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\pc\\OneDrive\\Desktop\\file\\Readingfile");

		f.mkdir();
		
		File f1 = new File("C:\\\\Users\\\\pc\\\\OneDrive\\\\Desktop\\\\file\\\\Readingfile\\Readingfile.txt");
		
		f1.createNewFile();
		
		FileWriter f12 = new FileWriter(f1);
		
		
		f12.write("this is a test file for Readingfile\n");
		f12.write("this is a test file for Readingfile\n");
		f12.flush();
		
		
		f12.write("this is a test file for Readingfile\n");
		f12.write("this is a test file for Readingfile\n");
		f12.write("this is a test file for Readingfile\n");
		f12.flush();
		f12.write("abcde\n");
		f12.append("demo");
		f12.flush();
		
		
		Scanner sc = new Scanner(f1);
		
		sc.hasNextLine();
		
		while(sc.hasNextLine()) {
			String data = sc.nextLine();
			System.out.println(data);
		}
		
		//or
		
		FileReader fr = new FileReader(f1);
		int i;
		while((i=fr.read())!=-1){
			System.out.print((char)i);
		}
		fr.close();
		
		//or
		
		FileInputStream fis = new FileInputStream(f1);
		int j;
		while((j=fis.read())!=-1){
			System.out.print((char)j);
		}
		
	}

}
