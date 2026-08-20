package DyanamicProgramming;

import java.util.Scanner;

public class Code2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		int k = sc.nextInt();
		
		int max = 0;
		
		for(int i = 0; i < n;i++) {
			arr[i] = sc.nextInt();
			
			
			switch(k) {
			case 1:
				if(arr[i] > max) {
					max = arr[i];
				}
				break;
			
			case 2:
				
			}
		}
	}

}
