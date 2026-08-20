package Dayi;

import java.util.Scanner;

public class q {

	public static int question1(int n, int len) {
		int sum = n;
		
		if(len == 0) {
			System.out.println("invalid input");
		}else {
			for(int i = 1; i < len; i++) {
				int prev = sum - 1;
				sum = sum + prev;
			}
			return sum;	
		}
		return 0;
	}
	
	public static void one(int x) {
		x= 10;
	}
	public static void qustion2(int n) {
		int num = n;
		int fact = 1;
	
		for(int i = 1; i < n; i++) {
			int LD = n % 10;
//			System.out.println(LD);
			int factr = 1;
			for(int j = 1; j <= LD; j++) {
//				System.out.println(j);
				factr = factr * j;	
			}
//			System.out.println("factr" + factr);
			fact = fact + factr;
//			System.out.println("fact" +fact);
			n = n / 10;
		}
//		System.out.println("last fact "+fact);
		if(num == fact) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

	public static void main(String[] args) {
//		System.out.println("Hello");
		Scanner sc = new Scanner(System.in);
		
//		//take starting kind choclate
//		System.out.println("Enter mints number");
//		int n = sc.nextInt();
//		
//		//length of queue
//		System.out.println("Enter length");
//		int len =sc.nextInt();
//		
//		System.out.println(question1(n, len));
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		qustion2(num);
				
	}


}
