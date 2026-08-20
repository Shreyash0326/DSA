package Day3;

import java.util.Scanner;

public class Code7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int [] arr = new int[size];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < size - 1; i++) {
			for(int j = 0; j < size - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
	                // Swap arr[j] and arr[j+1]
	                int temp = arr[j];
	                arr[j] = arr[j + 1];
	                arr[j + 1] = temp;
	            }
			}
		}
		
		for(int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		
		int multiply1 = arr[0] * arr[1] * arr[size-1];
		int multiply2 = arr[size-1] * arr[size - 2] * arr[size - 3];
		
		if(multiply1 > multiply2) {
			System.out.println(multiply1);
		}else {
			System.out.println(multiply2);
		}

	}

}
