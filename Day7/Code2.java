package Day7;

import java.util.Scanner;

public class Code2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int v = sc.nextInt();
		int w = sc.nextInt();
		
		if(w%2 != 0) {
			System.out.println("Invalid input");
		}else {
			int fw = (w / 2) - v;
			int tw = v - fw;
			if(tw < 0 || fw < 0) {
				System.out.println("Invalid input1");
			}else {
				
				System.out.println("TW : " + tw);
				System.out.println("FW : " + fw);
			}
			
		}
	}

}
