package DyanamicProgramming;

import java.util.Scanner;

public class Code4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//leetcode 643
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int k = sc.nextInt();
		
		float widAvg = 0;
		for(int i = 0; i < k; i++) {
			widAvg += arr[i];
		}
//		widAvg = widAvg / k;
		
		float maxAvg = widAvg;
		
		for(int i = k; i < n; i++) {
			widAvg = (widAvg + arr[i] - arr[i - k]);
			
			if(widAvg > maxAvg ) {
				maxAvg = widAvg;
			}
		}
		
		System.out.println(maxAvg / k);
	}

}
