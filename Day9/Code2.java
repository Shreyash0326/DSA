package LastDay;

import java.util.Arrays;
import java.util.Scanner;

// greedy - assign maximaum tasks
public class Code2 {

	public static int maxTaaks(int[] tasks, int[] worker) {
		Arrays.sort(tasks);
		Arrays.sort(worker);
		
		int t = tasks.length;
		int w = worker.length;
		
		int i = 0;
		int j = 0;
		
		int count = 0;
		
		while(j < w) {
			if(tasks[i] <= worker[j]) {
				count++;
				i++;
				j++;
			}else {
				j++;
			}
		}
		
		return count;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] tasks = new int[t];
		
		for(int i = 0 ; i < t; i++) {
			tasks[i] = sc.nextInt();
		}
		int w = sc.nextInt();
		int[] worker = new int[w];
		
		for(int i = 0 ; i < w; i++) {
			worker[i] = sc.nextInt();
		}
		
		System.out.println(maxTaaks(tasks, worker));
	}

}
