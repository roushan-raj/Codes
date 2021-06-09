
public class Q29_Sum_of_Largest_and_Smallest_InArray {
	
	public static int findSum(int [] arr) {
		int n = arr.length;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<n; i++) {
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		return max+min;
	}

	public static void main(String[] args) {
		int [] arr = {9, 5, 0, 11};
		System.out.println(findSum(arr));
	}
}
