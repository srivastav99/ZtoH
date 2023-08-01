package OOPS;

public class FinalExample {

	public static void main(String[] args) {
		
		final int a=1;
		//a=5; // gives error as it is given final keyword and thus the value cannot be changes
		
		Child o = new Child();
		o.m1();
		o.m2();
		 
	}	
}

class Parent{
	
	void m1() {
		System.out.println("Parent method 1");
	}
	final void m2() {
		System.out.println("Parent method 2");
	}
}

class Child extends Parent{
	
	void m1() {
		System.out.println("Child method 1");
	}
	/*
	void m2() { // gives error as in parent class the method has been already given final and thus cannot be overridden
		System.out.println("Child method 2");
	}
	*/
}

final class Non_Herit_P{
	
	void print(){
		System.out.println("Method of Non-heritable class.");
	}
}
/*
class Child12 extends Non_Herit_P{ // gives error as the parent class in given final and thus making it non-heritable.
	
	void print(){
		System.out.println("Method of Non-heritable child class.");
	}
}
*/



