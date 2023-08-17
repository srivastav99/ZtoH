package OOPS;

class  Area {
	//constructor
	Area() {
		
		System.out.println("Parent class constructor.");
	}
	Area(int a){
		System.out.println("Parent class constructor with arguments.");
	}
		
}
class SubClass3 extends Area{
	//Normal method
	void method1() {
		
		//super(); //gives error - Constructor call must be the first statement in a constructor and this is not a constructor just a method
		//Area();//gives error - Constructor call must be the first statement in a constructor
		//super();//gives error - Constructor call must be the first statement in a constructor
		System.out.println("Normal method");
	}
	
	//constructor
	public SubClass3() {
		// System.out.println("Child class constructor before super call");//super must be first line so this line has to be commented out.
		super(23); // Calls constructor of immediate parent class with arguments(overloaded constructor of parent class).If we comment out this line then default constructor of parent is called by default.
		System.out.println("Child class constructor after super call");
	}
}

public class SuperMethod {

	public static void main(String[] args) {
		
		SubClass3 obj = new SubClass3();
		obj.method1();

	}
	
}

