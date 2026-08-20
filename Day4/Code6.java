package Day4;

import java.util.Scanner;

public class Code6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String keyboard ="1234567890-qwertyuiop[]asdfghjkl;'zxcvbnm,./";

		String str = sc.nextLine();
		
		String result = "";
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			int index = keyboard.indexOf(ch) - 1;
//			System.out.println(keyboard.charAt(index));
			if(ch == ' '){
				result += " ";
			}
			else {
				result += keyboard.charAt(index);
			}
		}
		System.out.print(result);
		
	}

}
