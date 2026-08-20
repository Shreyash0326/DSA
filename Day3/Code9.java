package Day3;

import java.util.Scanner;

public class Code9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] arr = new int[size];
		
		int sum = 0;
		
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();

			sum += arr[i];	
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0 ; i < size; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min){
				min = arr[i];
			}
		}
//		System.out.println("max" + max);
//		System.out.println("min" + min);
		int minSum = sum - max;
		int maxSum = sum - min;
		
		System.out.println("max : " + maxSum);
		System.out.println("min : " + minSum);
	}

}
