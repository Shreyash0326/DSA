package Day3;

import java.util.Scanner;

public class Code2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		char ch = (char)sc.next().charAt(0);
		
		int count = 0;
		for(int i = 0; i < str.length();i++) {
			if(str.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println(count);
	}

}
