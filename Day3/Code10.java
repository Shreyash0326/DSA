package Day3;

import java.util.Scanner;

public class Code10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arrA = new int[3];
		int[] arrB = new int[3];
		
		for(int i = 0; i < arrA.length; i++) {
			arrA[i] = sc.nextInt();
		}
		
		for(int i = 0; i < arrB.length; i++) {
			arrB[i] = sc.nextInt();
		}
		
		int bob = 0;
		int alice = 0;
		
		for(int i = 0; i < 3; i++) {
			if(arrA[i] > arrB[i]) {
				alice++;
			}
			else if(arrA[i] < arrB[i]) {
				bob++;
			}else {
				continue;
			}
		}
		
		System.out.print(alice);
		System.out.print(bob);
	}

}
