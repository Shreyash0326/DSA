package Day4;

import java.util.Scanner;

public class Code5 {

	public static int countCollez(int num) {
		int count = 1;
		
		while(num > 1) {
			if(num % 2 ==0) {
				num /= 2;
				count++;
			}else {
				num = num* 3 + 1;
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int num = sc.nextInt();
		
//		System.out.print(num + " ");
	
		int curr = 0;
		int max = 0;
		for(int i = start; i <= num; i++) {
			curr = countCollez(i);
//			System.out.println(curr);
			
			if(curr > max) {
				max = curr;
			}
		}
		System.out.print(start + " ");
		System.out.print(num + " ");
		System.out.print(max + " ");
	}

}
