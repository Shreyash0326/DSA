package DyanamicProgramming;

import java.util.Scanner;

public class Code5 {
	
	public static boolean isVowel(char ch) {
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//leetcode 1456
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		int k = sc.nextInt();
		
		int count = 0;
		for(int i = 0; i < k; i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'|| str.charAt(i) == 'o'|| str.charAt(i) == 'u') {
				count++;
			}
		}
		
//		System.out.println(count);
		
		int maxCount = count;
		
		for(int i = k ; i <str.length(); i++) {
			if(isVowel(str.charAt(i))) {
				count++;
			}
			if(isVowel(str.charAt(i - k))) {
				count--;
			}	
			
			if(count > maxCount) {
				maxCount = count;
			}
		}
		
		System.out.println(maxCount);
		
	}

}
