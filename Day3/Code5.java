package Day3;

import java.util.Scanner;

public class Code5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		int count = 0;
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] == 0) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
