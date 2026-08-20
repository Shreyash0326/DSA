package Day8;

import java.util.Scanner;

public class Code4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		int n = (int) str.charAt(0) -'0';
		
		System.out.println(n);
		int count = 0;
		for(int i = 1; i < str.length(); i++) {
			count++;
		}
		
		if(n == count) {
			System.out.println("TRUE " + count);
		}else {
			System.out.println("FALSE " + count);
		}
		
		
	}

}
