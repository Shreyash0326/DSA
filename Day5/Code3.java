package Day5;

import java.util.Scanner;

public class Code3 {

	public static int hiringCar(int r1, int n , int r2, int x) {
		int h = 0;
		
		if( x % 60 == 0) {
			h = x / 60;
		}
		
		else {
			h = (x / 60) + 1;
		}
		
		int result = 0;
		if( h < n) {
			result = h * r1;
		}else {
			int rate1 = n * r1;
			int rate2 = (h - n) * r2;
			result = rate1 + rate2;
		}	
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r1 = sc.nextInt();
		int n = sc.nextInt();
		int r2 = sc.nextInt();
		int x = sc.nextInt();
		
		System.out.println(hiringCar(r1, n, r2, x));
		
		
	}

}
