import java.util.*;
public class Q7_Number_Puzzle_MinSumDiff_AdjElement {
	
	public static int minSumDiff(int [] arr) {
		Arrays.sort(arr);
		int sum = 0;
		
		for(int i=1; i<arr.length; i++) {
			sum = sum + (arr[i] - arr[i-1]);
		}
		return sum;
	}

	public static void main(String[] args) {
		
		int [] arr = {1,3,2};
		System.out.println(minSumDiff(arr));
	}
}
