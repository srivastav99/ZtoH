package Basic;

import java.util.Scanner;

public class Armstrong2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, count = 0, digit = 0;

		Scanner sc = new Scanner(System.in);
		 

		
		System.out.println("Enter range to check for armstrong numbers:");
		n = sc.nextInt();
		int m;
		m = n;
		
		System.out.print("List of Armstrong numbers from 0 to "+n+" :");
		for (int j = 1; j <= m; j++) {
			
			count = 0;
			int k=j;
			int l=j;
			while (l != 0) {

				l = l / 10;
				count++;
			}
			int sum=0;
			int mul=0;
				while (k != 0) {

					
					digit = k % 10; // Gives last digit of the number
					mul=1;
					for (int i = 1; i <= count; i++) {
						 
						mul = mul*digit; //gives power of value of a digit
						
					}
					sum=sum+mul;
					k = k / 10; // Eliminates the last digit as it is no longer required.
				}
			
			if (j == sum) {
				System.out.print(sum+" ");
			}

		}
		
	}

}
