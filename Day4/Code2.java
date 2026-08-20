package Day4;

import java.util.Scanner;

public class Code2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int p1 = sc.nextInt();
		int p2 = sc.nextInt();
		int p3 = sc.nextInt();
		int q = sc.nextInt();
		int e = sc.nextInt();
		int r = sc.nextInt();
		
		
		int secondcase = e - r - (p1 + p2 + p3) + q*2; // 2*q because 2times overlap hota 
		
		int single = secondcase / 3;
		int first = single + (p1 -q) + (p3 - q) + q;
		System.out.println(first);
		System.out.println(secondcase);
		
	}

}
