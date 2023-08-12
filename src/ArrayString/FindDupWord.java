package ArrayString;

public class FindDupWord {

	public static void main(String[] args) {
		String s = "selenium tool is a software tool a is of selenium";
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
