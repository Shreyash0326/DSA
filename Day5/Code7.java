package Day5;

import java.util.Scanner;

public class Code7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int n1 = 0, n2 = 1;
		int sum = 0;
		for(int i = 0; i < n; i++) {
			System.out.print(n1 + " ");
			sum += n1;
			int n3 = n1 + n2;
			n1 = n2;
			n2= n3;
			
		
		}
		System.out.println("sum : " + sum);
	}

}
