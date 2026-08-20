package Day6;

import java.util.Scanner;

public class Code2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int day = sc.nextInt();
		int produces = sc.nextInt();
		int[][] arr = new int[day][produces];
		
//		int max1 = 0;
//		int max2 = 0;
//		int max3 = 0;
		
		int[] max = new int[day];
		for(int i = 0; i < day; i++) {
			for(int j = 0; j < produces; j++) {
				arr[i][j] = sc.nextInt();
//				if(arr[0][j] > max1) {
//					max1 = arr[0][j];
//				}
//				
//				if(arr[1][j] > max2) {
//					max2 = arr[1][j];
//				}
//				
//				if(arr[2][j] > max3) {
//					max3 = arr[2][j];
//				}
				
				if(arr[i][j] > max[i]) {
					max[i] = arr[i][j];
				}
			}
		}
		
//		System.out.print(max1 + " ");
//		System.out.print(max2 + " ");
//		System.out.print(max3 + " ");
		
		for(int i = 0; i < day; i++) {
			System.out.print(max[i] + " ");
		}
	}

}
