package Day4;

import java.util.Scanner;

public class Code4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.print(num + " ");
		while(num > 1) {
			if(num % 2 ==0) {
				num /= 2;
				System.out.print(num + " ");
			}else {
				num = num* 3 + 1;
				System.out.print(num + " ");
			}
		}
		
		
	}

}
