package Day2;

import java.util.Scanner;

public class Code3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int rev = 0;
		
		while(n >30) {
			int digit = n % 10;
			rev =rev * 10 + digit;
			n /= 10;
		}
		System.out.println(rev);

	}

}
