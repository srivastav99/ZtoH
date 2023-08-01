package OOPS_AccessModifier1;

import OPPS_AccessModifier.ProtectedClass;

public class ProtectedAnotherPackage extends ProtectedClass{

	public static void main(String[] args) {
		
		
	}
	
	void printAnotherPackage() {
		
		ProtectedClass obj = new ProtectedClass();
		//obj.printMain();
		System.out.println("Method of another package, another file,another class, non-inherited");
	}
	 

}


