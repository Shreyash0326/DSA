package Day3;

import java.util.Scanner;

public class Code3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int sum = 0;
		
//		for(int i = 0; i <= 10; i++) {
//			sum += num * i;
//		}
		int i = 1;
		while (i <= 10) {
			sum += num * i;
			i++;
		}
		System.out.println(sum);
		
		//
		System.out.println(num * 55);
	}

}
