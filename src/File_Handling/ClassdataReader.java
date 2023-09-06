package File_Handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ClassdataReader {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\pc\\OneDrive\\Desktop\\file\\dataReader");

		f.mkdir();
		
		File f1 = new File("C:\\\\Users\\\\pc\\\\OneDrive\\\\Desktop\\\\file\\\\dataReader\\dataReader.txt");
		
		f1.createNewFile();
		
		FileWriter f12 = new FileWriter(f1);
		
		
		f12.write("this is a test file for dataReader\n");
		f12.write("this is a test file for dataReader\n");
		f12.flush();
		
		
		f12.write("this is a test file for dataReader\n");
		f12.write("this is a test file for dataReader\n");
		f12.write("this is a test file for dataReader\n");
		f12.flush();
		f12.write("abcde\n");
		f12.append("demo");
		f12.flush();
		
		
		Scanner dataReader = new Scanner(f1);
		
		while(dataReader.hasNextLine()) {
			String data = dataReader.nextLine();
			System.out.println(data);
		}
		
	}

}
