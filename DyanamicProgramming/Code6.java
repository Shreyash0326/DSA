package DyanamicProgramming;

import java.util.HashSet;
import java.util.Scanner;

public class Code6 {

	public static boolean conatinsNearbyDuplicate(int[] nums,int k) {
		HashSet<Integer> set = new HashSet<>();
		
		for(int i = 0; i < nums.length;i++) {
			if(set.contains(nums[i])) {
				return true;
			}
			set.add(nums[i]);
			if(set.size() > k) {
				set.remove(nums[i-k]);
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int k = sc.nextInt();
		
		System.out.println(conatinsNearbyDuplicate(arr, k));

	}

}
