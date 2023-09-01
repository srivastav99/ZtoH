package ExceptionHandling;

public class ExceptionHandling_Unchecked { //In this code we can comment out throw and throws still the code works
	
		public static void main(String[] args) {
			
			I o = new I();
			try {
				o.method1();
			}
			catch (IndexOutOfBoundsException e) {
				
				System.out.println("Cannot divide by 0");
			}
			
			
			catch (Exception e) {
				
				System.out.println(e.getMessage());
			}
		
		}

	

}

class I {
	void method1() throws Exception  {
		
		int a=10, b=0,c=0;
		
		try {
			c=a/b;
		} 
		catch(IndexOutOfBoundsException e) {
			
			throw new Exception(e.getMessage());
		}
		
	}
}

