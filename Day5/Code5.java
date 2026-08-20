package Day5;

import java.util.Scanner;

public class Code5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		if(str == "") {
			System.out.println("0");
		}
		int sum = 0;
		for(int i = 0; i < str.length();i++) {
			char ch = str.charAt(i);
//			System.out.println(ch);
			
			switch(ch) {
			case 'A' :
				sum += 1;
				break;
			
			case 'B':
				sum += 10;
				break;
			
			case 'C':
				sum += 100;
				break;
			
			case 'D':
				sum += 1000;
				break;
			
			case 'E':
				sum += 10000;
				break;
			
			case 'F':
				sum += 100000;
				break;
				
			case 'G':
				sum += 1000000;
				break;
			
			default:
				sum += 0;
			}
		}
		
		System.out.println(sum);

	}

}
