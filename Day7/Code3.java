package Day7;

import java.util.Scanner;

public class Code3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		String str2 = sc.next();
		
		int x = str1.length() + 1;
		int y = str2.length() + 1;
		
		int[][] arr = new int[str1.length()+ 1][str2.length() + 1];
		for(int i = 0; i < x; i++) {
			for(int j = 0 ; j < y; j++) {
				System.out.print("0 ");
			}
			System.out.println();
		}
		System.out.println();
//		for(int i = 0 ; i < x; i++) {
//			arr[i][0] = 0;
//		}
//		
//		for(int i = 0 ; i < y; i++) {
//			arr[0][i] = 0;
//		}
//		
//		for(int i = 0; i < x; i++) {
//			for(int j = 0 ; j < y; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
//		System.out.println();
		
		for(int i = 1; i < x; i++) {
			for(int j = 1; j < y; j++) {
				if(str1.charAt(i - 1) == str2.charAt(j - 1)) {
					arr[i][j] = arr[i-1][j -1] + 1;
				}else if(arr[i][j -1] > arr[i-1][j]) {
					arr[i][j] = arr[i][j-1];
				}else {
					arr[i][j] = arr[i-1][j];
				}
			}
		}
		
		for(int i = 0; i < x; i++) {
			for(int j = 0 ; j < y; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
