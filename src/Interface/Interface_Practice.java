package Interface;

interface A{
	
	void method1();
	void method2();
	void method3();
	//void method4();
	
}

public class Interface_Practice implements A {

	public static void main(String[] args) {
		
		Interface_Practice o = new Interface_Practice();
		o.method1();

	}
	
	public void method1() {
		System.out.println("Method 1");
	}
	
	public void method2() {
		System.out.println("Method 2");
	}
	
	public void method3() {
		System.out.println("Method 3");
	}
	
	public void method5() {
		System.out.println("Method 5");
	}

}

class SubClass implements A{

	
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	
	public void method3() {
		// TODO Auto-generated method stub
		
	}
	public void method6() {
		System.out.println("Method 6");
	}
	
	
}
