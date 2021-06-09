import java.util.*;
public class Q40_Minimize_the_Penalty {
	
	public static int minimisePenalty(int [] arr, int n) {
		Arrays.sort(arr);
		int sum = 0;
		
		for(int i=0; i<n-1; i++) {
			sum = sum + (arr[i+1] - arr[i]);
		}
		return sum;
	}

	public static void main(String[] args) {
		
		int [] arr = {1, 6, -2, 4};
		int n = arr.length;
		
		System.out.println(minimisePenalty(arr, n));
		
	}
}
