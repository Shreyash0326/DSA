package Day6;

import java.util.Scanner;

public class Code1 {

	public static int digit(int a, int b, int c) {
		int arr[] = new int[10];
		
		while(a != 0) {
			int ld = a%10;
			a/= 10;
			arr[ld]++;
		}
		
		while(b != 0) {
			int ld = b%10;
			b/= 10;
			arr[ld]++;
		}
		
		while(c != 0) {
			int ld = c%10;
			c/= 10;
			arr[ld]++;
		}
		
		for(int i = 1; i < arr.length;i++) {
			if(arr[i] == 3) {
				return i;
			}
		}
		
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		
		
		System.out.println(digit(a, b, c));
//		
//		
		
	}

}
