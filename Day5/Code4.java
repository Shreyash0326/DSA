package Day5;

import java.util.Scanner;

public class Code4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = 0;
		int secondLargest = 0;
		for(int i = 0; i < n ;i++) {
			if(arr[i] >= max) {
				secondLargest = max;
				max = arr[i];	
			}else if (secondLargest == 0 || arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
		System.out.println(max);
		System.out.println(secondLargest);
		
		int differ = (max - 1) * (secondLargest -1);
		System.out.println(differ);
	}

}
