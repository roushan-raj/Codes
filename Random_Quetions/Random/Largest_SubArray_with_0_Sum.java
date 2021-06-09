import java.util.HashMap;
import java.util.Map;

public class Largest_SubArray_with_0_Sum {
	
	public int largestSubArray(int[]arr) {
		int sum = 0;
		int maxi = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			sum = sum+arr[i];
			if(sum == 0) {
				maxi = i+1;
			}
			else {
				if (map.get(sum) == null) {
					map.put(sum, i);
				} else {
					maxi = Math.max(maxi, i-map.get(sum));
				}
			}
		}
		return maxi;
	}

	public static void main(String[] args) { 
		Largest_SubArray_with_0_Sum ob = new Largest_SubArray_with_0_Sum();
		int [] arr = new int[] {1,-1,3,2,-2,-8,1,7,10,23};
		System.out.println("All Elements in Longest sub-array is: "
		                                       +ob.largestSubArray(arr));
	}
}
