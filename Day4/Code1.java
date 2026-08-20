package Day4;

import java.util.Scanner;

public class Code1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		int people = sc.nextInt();
		int[] enter = new int[people];
		int[] leave = new int[people];
		
		for(int i = 0; i < people; i++) {
			enter[i] = sc.nextInt(); 
		}
		
		for(int i = 0; i < people; i++) {
			leave[i] = sc.nextInt(); 
		}
		
//		int[] arr = new int[people];
		int curr = enter[0] - leave[0];
		int max = curr;
		for(int i = 1; i < people; i++) {
			
			curr += enter[i];
			curr -= leave[i];
			
			if(curr > max) {
				max = curr;
			}
			
		}
		System.out.println(max);
	}

}
