package ArrayString;

import java.util.Iterator;

import javax.xml.transform.Source;

/*
public class FindDupWord {

	public static void main(String[] args) {
		String s = "selenium tool is a software tool is a of selenium";
		String str = "";
		char[] c = s.toCharArray();
		int kcount=0;
		for(int i=0;i<c.length;i++) {
			int count=0;
			if(c[i]!=' ') {
				str=str+c[i];
			}
			if(c[i]==' ') {
				char []ch=str.toCharArray();
				
				for(int j=i+1;j<c.length;j++) {
					kcount=0;
					for(int k=0;k<ch.length;k++) {
						//System.out.println(str);
							kcount = k+1;
							if(ch[k]==c[j]) {
								count++;
								
								if(j==c.length-1 || k==ch.length-1) {
									
									break;	
								}
								else {
									j++;
								}
							}
						
						
							else {
								count=0;
								break;
							}
	
					}
					if(count!=0 &&(j==c.length-1 || c[j+1]==' ')) {
						System.out.print("Duplicate word found:");
						for(int n=0;n<ch.length;n++) {
							System.out.print(ch[n]);
						}
						System.out.println();
					}
					if(j==c.length-1) {
						str="";
						break;	
					}
				}
			}
		
		}

	}

}
*/

public class FindDupWord {

	public static void main(String[] args) {
		String s = "selenium tool is a software tool is a ";
		String str = "";
		char[] c = s.toCharArray();
		
		
		
		//To store a word in c array
		for(int i=0;i<c.length;i++) {
			int count=0;
			if(c[i]!=' ') {
				str=str+c[i];
			
			}
			
			    
			if(c[i]==' ') {
				//System.out.println(str);
				char []ch1=str.toCharArray();
				str="";
				//To store a word in ch array in order to compare with word in c array. This loop will run through entire string(from after the word stored in c array) and stores word by word in ch array
				for(int j=i+1;j<c.length;j++){
					
					if(c[j]!=' ') {
						str=str+c[j];
						//x++;
						
					}
					if(c[j]==' '|| j==c.length-1) {
						//System.out.println(str);
						char []ch2=str.toCharArray();
						if(ch1.length==ch2.length) //if both the length are equal only then both words can be equal.
						{
							for(int m=0,n=0;m<ch1.length;m++,n++) {
								if(m<ch1.length && n<ch2.length) {
									
									if(ch1[m]==ch2[n]) {
										
											count++;
											
											
									}
										
									
									else {
										count=0;
										
										str="";

										break;
									}
								}
								else {
									count=0;
									
									str="";
									break;
								}
							}
						}
						else {
							str="";
						}
						
					}
					if(count==ch1.length) {
						System.out.print("Deplicate element found:");
						for(int z=0;z<ch1.length;z++) {
							System.out.print(ch1[z]);
						}
						System.out.println();

						count=0;
	
						str="";
						
					}
				}
			}
		}
	}
}
	
