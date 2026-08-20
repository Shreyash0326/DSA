package Day3;

import java.util.Scanner;

public class Code1 {

	public static int isPalindrome(char[] arr, int len) {
		int left = 0;
		int right = len - 1;
		
		while(left <= right) {
			if(arr[left] == arr[right]) {
				left++;
				right--;
			}else {
				return 0;
			}
		}
		return 1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int len = str.length();
		char[] arr = str.toCharArray();// string la char array madhe convert
		System.out.println(isPalindrome(arr, len));	
		
		//frequency of char
		int[] freq = new int[256];
		for(int i = 0; i < str.length(); i++) {
			freq[str.charAt(i)]++;
		}
		
		for(int i = 0; i < freq.length;i++) {
			if(freq[i] > 0) {
				System.out.println((char) i + ": " + freq[i]);
			}
		}
	}

}
