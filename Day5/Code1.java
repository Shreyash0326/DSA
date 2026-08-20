package Day5;

import java.util.Scanner;

public class Code1 {

	public static void productOfNumber(int[] arr, int size) {
		int multiple = 1;
		for(int i = 0; i < size; i++) {
			multiple *= arr[i];		
		}
		
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = multiple / arr[i];
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
			
		}
		productOfNumber(arr, size);
		
	}

}
