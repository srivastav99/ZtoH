package Arrays;

import java.util.Scanner;

public class RemoveNumAtLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,n;
		System.out.println("Enter size of array:");
		
		Scanner sc = new Scanner(System.in);
		size=sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter "+size+" elements:");
		for(int i=0;i<size;i++) {
			
			n=sc.nextInt();
			arr[i]=n;
		}
		arr[arr.length-1]=0;
		System.out.println("Array after removing a number at ending position:");
		for(int i=0;i<arr.length;i++) {

			System.out.print(arr[i]+" ");
			
		}

	}

}
