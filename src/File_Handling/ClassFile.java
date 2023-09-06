package File_Handling;

import java.io.File;
import java.io.IOException;

public class ClassFile {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\pc\\OneDrive\\Desktop\\file\\fileoperations");
		
		f.mkdir();
		f.delete();
		f.mkdir();
		
		File f1 = new File("C:\\\\Users\\\\pc\\\\OneDrive\\\\Desktop\\\\file\\\\fileoperations\\demofile.txt");
		
		f1.createNewFile();
		
		System.out.println("File path:"+f1.toPath());
		
		System.out.println("file exists:"+f1.exists());
		
		System.out.println("file free space:"+f1.getFreeSpace());
		
		System.out.println("file total space:"+f1.getTotalSpace());
		
		System.out.println("length of file:"+f1.length());		
		

	}

}
