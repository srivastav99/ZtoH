
package ExceptionHandling;



public class Exe_Han_Practice {

	public static void main(String[] args) {
		
		int a=10,b=0;
		
		try {	
			int c=a/b;
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmatic exception : cannot be divided by 0");
			
		}
		
	}

}

