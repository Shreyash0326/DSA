package LastDay;

import java.util.Scanner;

public class Code3 {

	public static boolean checkPlaceFlower(int[] flowerbed, int n) {
		int s = flowerbed.length;
		int count = 0;
		
		for(int i =0; i < flowerbed.length; i++) {
			if(flowerbed[i]==0) {
				int left = (i==0) ? 0 : i-1;
				int right = (i == (s -1)) ? (s-1) : i+1;
				
				if(flowerbed[left] == 0 & flowerbed[right] == 0) {
					count++;
				}
			}
		}
		
		if(count >= n) {
			return true;
		}else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int f = sc.nextInt();
		int[] flowerbed = new int[f];
		
		for(int i = 0; i < f;i++) {
			flowerbed[i] = sc.nextInt();
		}
		
		int n = sc.nextInt();
		
		System.out.println(checkPlaceFlower(flowerbed, n));

	}

}
