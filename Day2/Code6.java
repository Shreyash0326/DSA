package Day2;

import java.util.Scanner;

public class Code6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [][] arr = new int[3][3];
		
		int rightDio = 0;
		int leftDio = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length ; j++) {
 				arr[i][j] = sc.nextInt();
			}	
		}
		
//		for(int i = 1; i <= arr.length; i++) {
//			for(int j = 1; j <= arr.length ; j++) {
//				if(i == j) {
//					rightDio += arr[i][j];
//				}
//				if(i + j == 4) {
//					leftDio += arr[i][j];
//				}
//			}	
//		}
		
		for(int i = 0; i < arr.length; i++) {
			leftDio += arr[i][i];
			rightDio += arr[i][arr.length-1-i];	
		}
		
		System.out.println(leftDio);
		System.out.println(rightDio);
		int sub = Math.abs(leftDio - rightDio) ;

		System.out.println(sub);;
	}

}
