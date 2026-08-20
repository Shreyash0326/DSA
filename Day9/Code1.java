package LastDay;

import java.util.Scanner;

public class Code1 {

	public static float calculateDiscount(int n) {
		float discount = 0;

		
//		int amt = n;
		if(n < 1000) {
			discount = (float)n - (n * 5 / 100);

		}else if(n >= 1000 && n < 5000) {
			discount = (float)n - (n * 10 /100);
		}else{
			discount = (float)n - (n * 15 / 100);
		}
		return discount;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.printf("%.2f", calculateDiscount(n));
		
	}

}
