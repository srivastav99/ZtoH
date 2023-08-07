package OOPS;

public class mainOverride {

	
	public static void main(String[] args) {
		
		System.out.println("main");
		mainOverride o = new mainOverride(); //object of child class
		int []a= {1,2,3,4};
		String []s= {"sed","cded","dsd"};
		o.main(a);
		o.main(3);
		//o.main(s); // - gives run time error
		
	}
	
	
	public static void main(int[] args) {
		
		System.out.println("main1");

	}
	public static void main(int args) {
		
		System.out.println("main2");

	}

}


class sub extends mainOverride{
	
	public static void main(String[] args) {
		
		System.out.println("Override method");
		main(0);
	}
	void print() {
		System.out.println("print");
	}
	
}

