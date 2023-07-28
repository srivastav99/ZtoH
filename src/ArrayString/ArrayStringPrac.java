package ArrayString;


public class ArrayStringPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String str = "I am a human.";
		char[] ch=str.toCharArray();
		
		String []s = {"I am human","sadaded"};
		
		
		for(int i=0;i<ch.length-1;i++) {
			
			System.out.print(ch[i]);
		}
		for(int i=0;i<s.length-1;i++) {
			
			System.out.print(s[i]);
		}
		
	*/
		//converting large to small
		
		/*
		char x='A',chLower;
		int ascii;
		ascii=x+32;
		chLower=(char)ascii;
		if(x>=65 && x<=122) { 
			if(x>=65 && x<=90) {
				
					
				System.out.println("Capital to small:"+chLower);
			}
			
		}
		*/
		
		//converting small to large
		/*
		char x='a',chUpper;
		int ascii;
		ascii=x-32;
		chUpper=(char)ascii;
		if(x>=65 && x<=122) { 
			if(x>=97 && x<=122) {
				
					
				System.out.println("Small to capital:"+chUpper);
			}
			
		}
		*/
		
		//Number of words in a string
		/*
		String str = "i am a human";
		int count=0;
		char[] ch=str.toCharArray();
		
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==' ') {
				
			}
			else {
				if((ch[i]==' ' && ch[i-1]!=' ')|| i==ch.length-1) {
					count++;
				}
			}
		}
		System.out.println("The number of words in the given string is: "+count);
		*/
		
		
		
		String s="" ;
		char c=' ';
		
		System.out.print(s);
		System.out.println(s.length());
		char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
		String helloString = new String(helloArray);
		
		helloString = helloString+"s"+"v";
		String str = ""+" ";
		System.out.println(str);
		//System.out.println(helloString);
	}

}
