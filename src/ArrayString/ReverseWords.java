package ArrayString;

public class ReverseWords {

	public static void main(String[] args) {
		
		String s = "Hi Hello";
		String str = "";
		
		char []ch=s.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--) {
			if(ch[i]!=' ') {
				str = str+ch[i];
			}
			
			if(ch[i]==' '|| i==0) {
				
				char []c = str.toCharArray();
				
				for(int j=c.length-1;j>=0;j--) {
					System.out.print(c[j]);
				}
				System.out.print(" ");
				str="";
			}
		}

	}

}
