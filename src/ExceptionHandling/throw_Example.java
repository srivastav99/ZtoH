package ExceptionHandling;


public class throw_Example {

	public static void main(String[] args) {
		
		A o = new A();
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

class A{
	void method1() throws Exception {
		
		int a=10, b=0,c=0;
		
		try {
			c=a/b;
		} 
		catch (IndexOutOfBoundsException e) {
			
			throw new Exception(e.getMessage());
		}
		
	}
}
