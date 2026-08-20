package DyanamicProgramming;

import java.util.Scanner;

public class Code3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//window sliding
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int k = sc.nextInt();
		
		int winSum = 0;
		for(int i = 0; i < k;i++) {
			winSum += arr[i];
		}
		
		int maxSum = winSum;
		
		for(int i = k ; i < n; i++) {
			winSum = winSum + arr[i] - arr[i - k];
			
			if( winSum > maxSum) {
				maxSum = winSum;
			}
		}
		
		System.out.println(maxSum);
	}

}
