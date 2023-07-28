package ArrayString;

public class FindSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			String s1="ztoh hi india ites pvt ltd";
			String s2="ites";
			char c[]=s1.toCharArray();
			char c1[]=s2.toCharArray();
			int flag=0,k=0;
			
			for(int i=0;i<c.length;i++) {
				k=i;
				flag=0;
				for(int j=0;j<c1.length;j++) {
					
					
					if(c[k]==c1[j]) {
						flag++;
						k++;
					}
					else {
						break;
					}
				}
				if(flag==c1.length) {
					break;
				}
			}
			if(flag==c1.length) {
				System.out.println("Substring matching");
			}
			else {
				System.out.println("Substring not matching");
			}
	}

}
