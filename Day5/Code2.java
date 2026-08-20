package Day5;

import java.util.Scanner;

public class Code2 {

	public static float standardDeviation(int[] arr, int size) {
//		int sum = 0;
//		int A = 0;
//		
//		for(int i = 0; i < size; i++) {
//			sum += arr[i];	
//		}
//		A = sum / size;
//		
//		float sd;
//		float result = 0;
//		for(int i = 0 ; i < arr.length;i++) {
//			result = (float)Math.pow((arr[i] - A), 2); 
//		}
//		sd = (float) Math.sqrt(result);
////		System.out.println(result);
////		System.out.println(sd);
//		return sd;
		
		float avg = 0;
		float sd = 0;
		
		for(int i = 0; i < size; i++) {
			avg += arr[i];
		}
		avg /= size;
		
		for(int i = 0; i < size; i++) {
//			sd += (arr[i] - avg) * (arr[i] - avg);
			sd += (float)Math.pow((arr[i] - avg), 2);
		}
		sd /= size;
		sd = (float) Math.sqrt(sd);
		return sd;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();	
		}
		
		System.out.printf( "%.2f",standardDeviation(arr, size));

		
	}

}
