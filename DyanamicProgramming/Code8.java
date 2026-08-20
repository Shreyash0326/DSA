package DyanamicProgramming;

import java.util.Scanner;

public class Code8 {

	public static int maxNum(int[] arr) {
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		
		int max = 0;
		for(int i = 0; i < k; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		for(int i = k; i < n; i++) {
			
		}
	}

}
