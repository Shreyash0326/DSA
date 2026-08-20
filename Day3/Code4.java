package Day3;

import java.util.Scanner;

public class Code4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		
		for(int i = num1; i <= num2; i++) {
			if(num2 > 10) {
				System.out.printf("%03d\n", i );
			}else {
				System.out.printf("%02d\n", i );
			}
				
		}
	}

}
