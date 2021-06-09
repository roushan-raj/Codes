import java.util.Arrays;

public class Q7_Closest_Pair_Difference {
	
	public static int findClosestPair(int [] arr, int n) {
		Arrays.sort(arr);
		
		int min = Integer.MAX_VALUE;
		for(int i=1; i<n; i++) {
			min = Math.min(min, Math.abs(arr[i] - arr[i-1]));
		}
		
		return min;
	}

	public static void main(String[] args) {
		int [] arr = {10, 2, -4, 5, 29};
		System.out.println(findClosestPair(arr, arr.length));
	}
}
