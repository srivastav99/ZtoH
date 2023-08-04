package OOPS;

public class mainOverride {

	public static void main(String[] args) {
		
		System.out.println("main");
		mainOverride o = new mainOverride();
		int []a= {1,2,3,4};
		o.main(a);
		o.main(0);
		//o.main(args); - gives run time error
		
		
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
	}
	void print() {
		System.out.println("print");
	}
	
}

