package Functions;

public class Array_TwoArraysSum {

	
	/*
	//A R
	public static int[] Sum(int arr1[],int arr2[]) {
		
		int []arrSum = new int[arr1.length];
		for(int i=0;i<arr1.length;i++) {
			arrSum[i] = arr1[i]+arr2[i];
		}
		return arrSum;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3,4,5}, arr2 = {10,20,30,40,50}, arrSum = new int[arr1.length];
		
		
		
		if(arr1.length==arr2.length) {
			
			arrSum=Sum(arr1,arr2);
			System.out.println("Sum of two array:");
			
			for(int i=0;i<arrSum.length;i++) {
				System.out.print(arrSum[i]+" ");
			}
			
		}
		else {
			System.out.println("Since the size of array 1 and array 2 is not equal,addition of array is not possible.");
		}
	}
	*/
	
	
	/*
	//NA NR
		public static void Sum() {
			
			int[] arr1 = {1,2,3,4,5}, arr2 = {10,20,30,40,50}, arrSum = new int[arr1.length];
			
			
			
			if(arr1.length==arr2.length) {
				
				for(int i=0;i<arr1.length;i++) {
				arrSum[i] = arr1[i]+arr2[i];
			}
				System.out.println("Sum of two array:");
				
				for(int i=0;i<arrSum.length;i++) {
					System.out.print(arrSum[i]+" ");
				}
				
			}
			else {
				System.out.println("Since the size of array 1 and array 2 is not equal,addition of array is not possible.");
			}
			
		}
		
		
		public static void main(String[] args) {

			
			Sum();

			
		}
		*/
	
	
	/*
	//A NR
			public static void Sum(int arr1[],int arr2[]) {
				
				 int[] arrSum = new int[arr1.length];
				
				
				
				if(arr1.length==arr2.length) {
					for(int i=0;i<arr1.length;i++) {
						arrSum[i] = arr1[i]+arr2[i];
					}
					
					System.out.println("Sum of two array:");
					
					for(int i=0;i<arrSum.length;i++) {
						System.out.print(arrSum[i]+" ");
					}
					
				}
				else {
					System.out.println("Since the size of array 1 and array 2 is not equal,addition of array is not possible.");
				}
				
			}
			
			
			public static void main(String[] args) {

				int[] arr1 = {1,2,3,4,5}, arr2 = {10,20,30,40,50};
						
				Sum(arr1,arr2);

				
			}
	*/
	
	
	
	//NA R
	public static int[] Sum() {
		
		int[] arr1 = {1,2,3,4,5}, arr2 = {10,20,30,40,50}; 
		int[] arrSum = new int[arr1.length];
		
		
		
		if(arr1.length==arr2.length) {
			
			for(int i=0;i<arr1.length;i++) {
				arrSum[i] = arr1[i]+arr2[i];
			}
			return arrSum;
			
		}
		else {
			
			return null;
		}
		
		
	}
	
	
	public static void main(String[] args) {
				
		int[]arrSum= Sum();
		
		if(arrSum!=null)
		{
			System.out.println("Sum of two array:");
			
			for(int i=0;i<arrSum.length;i++) {
				System.out.print(arrSum[i]+" ");
			}
		}
		else {
			System.out.println("Since the size of array 1 and array 2 is not equal,addition of array is not possible.");
		}
		
	}


}
