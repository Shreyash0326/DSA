package Day2;

import java.util.Scanner;

public class Code2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int i = 0;
		int j = i + 1;
		
		while (j < N -1 ) {
			if(arr[i] % 10 == 0 && arr[j] % 10 != 0) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				i++;
			}else {
				j++;
			}
			
		
	}
		for(int k = 0; k < arr.length; k++) {
			System.err.print(arr[k] + " ");
		}

}
}
