package Arrays;

import java.util.Scanner;

public class IndexAtLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,n,random;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to add at the last index:");
		random=sc.nextInt();
		System.out.println("Enter size of array:");
		
		
		size=sc.nextInt();
		
		int[] arr1 = new int[size], arr2 = new int[size+1];
		
		
		System.out.println("Enter "+size+" elements:");
		for(int i=0;i<arr1.length;i++) {
			
			n=sc.nextInt();
			arr1[i]=n;
		}
		
		for(int i=0;i<arr1.length;i++) {
			
			arr2[i]=arr1[i];
			/*if(i==(arr2.length-2)) {
				arr2[arr2.length-1]=random;
			}*/
		}
		//arr2[arr2.length-1]=random;
		System.out.println("Array after addition of a value in the last index:");
		for(int i=0;i<arr2.length;i++) {
			
			System.out.print(arr2[i]+" ");
		}
		
	}

}
