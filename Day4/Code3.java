package Day4;

import java.util.Scanner;

public class Code3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		int sum = 0;
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
//		System.out.println(sum);
		for(int i = 0; i < arr.length; i++) {
			sum -= arr[i];
			System.out.print(sum + " ");
		}
		
		
	} 

}
