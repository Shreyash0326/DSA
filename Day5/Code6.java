package Day5;

import java.util.Scanner;

public class Code6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] arr = new int[row][col];
		int n = sc.nextInt();
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();	
			}
		}
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				if(n == arr[i][j]) {
					System.out.print("(" + i + "," + j + ")");
				}
			}
		}
		
		
	}

}
