package Day2;

import java.util.Scanner;

public class Code5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		int num = 0;
		int power = 0;
		while(n != 0) {
			int LD = n % 10;
			LD = LD + x;
			int DLD = LD % 10;
			num += DLD * Math.pow(10, power);
			power++;
			n /= 10;
		}
		System.out.println(num);
	}

}
