package DyanamicProgramming;

import java.util.Scanner;

public class Code7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//tapping rain water
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int lmax = 0;
		int rmax = 0;
		int total = 0;
		int l = 0;
		int r = n - 1;
		
		while(l < r) {
			if(arr[l] <= arr[r]) {
				if( lmax > arr[l]) {
					total += lmax - arr[l];
				}else {
					lmax = arr[l];
				}
				l++;
			}
			else {
				if (rmax > arr[r]) {
					total += rmax -arr[r];
				}else {
					rmax = arr[r];
				}
				r--;
			}
		}
		System.out.println(total);
		
		
	}

}
