package Day2;

import java.util.Scanner;

public class Code {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of interior wall");
		int intWall = sc.nextInt();
		
		System.out.println("Enter the number of exterior wall");
		int extWall = sc.nextInt();
		
//		int costInt = 18;
//		int costExt = 12;
		float totalInt = 0;
		float totalExt = 0;
		
		for(int i = 0; i < intWall; i++) {
			float value1 = sc.nextFloat();
			totalInt += value1 * 18;
		}
//		System.out.println(totalInt);
		
		for(int i = 0; i < extWall; i++) {
			float value2 = sc.nextFloat();
			totalExt += value2 * 12;
		}
		
		float result = totalInt + totalExt;
		System.out.println(result);
	}

}