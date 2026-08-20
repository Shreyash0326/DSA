package Day6;

import java.util.Scanner;

public class Code3 {

	public static boolean palindrome(int n) {
		return n == rev(n);
	}
	
	public static int rev(int n) {
		int num = n;
		int rev = 0;
		while(n > 0) {
			int digit = n % 10;
			rev = (rev * 10) + digit;
			n /=10;
		}
		
		return rev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
	

		while(!palindrome(n)) {
			n = n + rev(n);
		}
		
		System.out.println(n );
	}

}
