package Day3;

import java.util.Scanner;

public class Code6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
 
		int n = sc.nextInt();
		int m = sc.nextInt();
		int rf = sc.nextInt();
		
		int sumIncoming = 0;
		
		int sumOutgoing = 0;
		for(int i = 0; i < n; i++) {
			int ratedIncoming = sc.nextInt();		
			sumIncoming += ratedIncoming - rf;
		}

//		System.out.println(sumIncoming);
		
		for(int i = 0; i < m; i++) {
			int ratedOutgoing = sc.nextInt();
			
			sumOutgoing += ratedOutgoing - rf;
		}
//		System.out.println(sumOutgoing);
		
		int diff = sumIncoming - sumOutgoing;
//		System.out.println(diff);
		
		if(sumIncoming > sumOutgoing) {
			System.out.println("-" + (diff + rf));
		}else if(sumIncoming < sumOutgoing) {
			System.out.println("+" +  (diff + rf));
		}else {
			System.out.println("BALANCED");
		}
	}

}
