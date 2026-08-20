package Day6;

import java.util.Scanner;

public class Code4 {

	public static int maxDigit(int a, int b, int c) {
		
		int max1 = 0;
		int min1 = 99999;
		while ( a != 0) {
			int ld = a % 10;
			if(ld > max1) {
				max1 = ld;
			}
			if(ld < min1){
				min1 = ld;
			}
			a /= 10;
		}
	
		int max2 = 0;
		int min2 = 99999;
		while ( b != 0) {
			int ld = b % 10;
			if(ld > max2) {
				max2 = ld;
			}
			if(ld < min2){
				min2 = ld;
			}
			b /= 10;
		}
		
		int max3 = 0;
		int min3 = 99999;
		while ( c != 0) {
			int ld = c % 10;
			if(ld > max3) {
				max3 = ld;
			}
			if(ld < min3){
				min3 = ld;
			}
			c /= 10;
		}
		
		int max = max1 + max2+ max3;
		int min = min1 + min2+ min3;
		
		return min - max;
		
//		System.out.println(min1);
//		return max1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println(maxDigit(a, b, c));
	}

}
