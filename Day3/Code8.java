package Day3;

import java.util.Scanner;

public class Code8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		int positive = 0;
		int negative = 0;
		int zero = 0;
		
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
			
			if(arr[i] > 0) {
				positive++;
			}else if(arr[i]  < 0) {
				negative++;
			}else {
				zero++;
			}
		}
		
		double ratioPositive = (double) positive / size;
		System.out.printf("%.6f\n" , ratioPositive);
		
		double rationNegative =(double) negative / size;
		System.out.printf("%.6f\n" , rationNegative);
		
		double rationZero = (double) zero / size;
		System.out.printf("%.6f\n" , rationZero);

	}

}
