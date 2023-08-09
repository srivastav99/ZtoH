package OOPS_Static;


public class MemoryConCheck {
	
	String studentName; 
	 String course; 
	 String school="IT";
	// static String school1="IT";
	public static void main(String[] args) {
		
		MemoryConCheck o = new MemoryConCheck();
		
		o.withObjectNonStat();
		//o.withObjectStat();
		
		/* 
		Runtime runtime = Runtime.getRuntime();
	      long memoryMax = runtime.maxMemory();
	      long memoryUsed = runtime.totalMemory() - runtime.freeMemory();
		
	      System.out.println(memoryUsed);
	      */
		
		long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		
		long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		
		System.out.println(afterUsedMem);
	}
	
	void withObjectNonStat() {
		ExeTimeCheck obj1 = new ExeTimeCheck();
		ExeTimeCheck obj2 = new ExeTimeCheck();
		obj1.studentName = "Ihechikara";
		obj1.course = "Data Visualization";
		
        
		obj2.studentName = "John";
		obj2.course = "Data Analysis with Python";
		
		System.out.println(obj1.studentName + " " + obj1.course + " " + obj1.school + "\n");
		
		System.out.println(obj2.studentName + " " + obj2.course + " " + obj2.school + "\n");
		
	}
	
	/*
	void withObjectStat() {
		ExeTimeCheck obj3 = new ExeTimeCheck();
		ExeTimeCheck obj4 = new ExeTimeCheck();
		obj3.studentName = "Ihechikara";
		obj3.course = "Data Visualization";
		
        
		obj4.studentName = "John";
		obj4.course = "Data Analysis with Python";
		
		System.out.println(obj3.studentName + " " + obj3.course + " " + obj3.school1 + "\n");
		System.out.println(obj4.studentName + " " + obj4.course + " " + obj4.school1 + "\n");
		
	}
	*/
	
}
