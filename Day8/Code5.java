package Day8;

import java.util.Scanner;

public class Code5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int small = Integer.MAX_VALUE; 
		int secondSmall = Integer.MAX_VALUE; 

		if(n < 2) {
			System.out.println("Invalid input");
		}else {
			for (int i = 0; i < n; i++) { 
			    if (arr[i] < small) { 
			        secondSmall = small; 
			        small = arr[i]; 
			    } else if (arr[i] < secondSmall && arr[i] != small) { 
			        secondSmall = arr[i]; 
			    } 
			}
			System.out.println(small + " " + secondSmall);	
		}
		
		
	}

}
