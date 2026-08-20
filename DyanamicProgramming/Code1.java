package DyanamicProgramming;

import java.util.Scanner;

public class Code1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] dp = new int[row][col];
		
		for(int i = 0; i < row; i++) {
			for(int j = 0 ; j< col; j++) {
				System.out.print("0 ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 0; i < row; i++) {
			dp[i][0] = 1;
		}
		
		for(int j = 0; j < col; j++) {
			dp[0][j] = 1;
		}
		
		for(int i = 0; i < row; i++) {
			for(int j = 0 ; j< col; j++) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 1; i < row; i++) {
			for(int j = 1; j < col; j++) {
				dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
			}
		}
		
		for(int i = 0; i < row; i++) {
			for(int j = 0 ; j < col; j++) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println(dp[row-1][col-1]);
		
	}

}
