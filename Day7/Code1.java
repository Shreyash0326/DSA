package Day7;

import java.util.Scanner;

public class Code1 {

//	public static int sum(int x) {
//		int num = x;
//		int sum = 0;
//		
//		while(x!=0) {
//			int ld = x %10;
//			sum += ld;
//			x /= 10;
//		}
//		if(sum == num) {
//			return 1;
//		}
//		return 0;
//	}
	
	public static int findMeOut(int n) {
		int x = n;
//		int number = 1;
		int check = 1;
		while(check == 1) {
			if(x % n == 0) {
//				x = x*n;
//				check = sum(x);
				int sum = 0;
				int x1 = x;
				
				while(x1 !=0) {
					int ld = x1 %10;
					sum += ld;
					x1 /= 10;
				}
				if(sum == n && x != n) {
					check = 0;
					return x;
				}
				
				sum = 0;
			}
			x += n;
		}
		
//		System.out.println(x);
		return -1;
//		return number;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println(findMeOut(10));
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if( n == 0) {
			System.out.println("-1");
		}else {
			System.out.println(findMeOut(n));
		}
		
	}

}
