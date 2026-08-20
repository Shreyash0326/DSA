package Day8;

import java.util.Scanner;

public class Code2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[4];
		for(int i = 0 ; i < 4; i++) {
			arr[i]= sc.nextInt();
		}
		
		for(int i = 0; i < 4; i++) {
			if(arr[i] % 3 == 0 && arr[i] % 5 == 0) {
				System.out.print("THREEFIVE ");
			}else if(arr[i] % 5 == 0) {
				System.out.print("FIVE ");
			}else if(arr[i] % 3 == 0) {
				System.out.print("THREE ");
			}else {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
