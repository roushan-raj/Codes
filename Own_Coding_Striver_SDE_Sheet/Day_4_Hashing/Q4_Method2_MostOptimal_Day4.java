import java.util.*;
public class Q4_Method2_MostOptimal_Day4 {
	
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
		 
		Q4_Method2_MostOptimal_Day4 ob = new Q4_Method2_MostOptimal_Day4();
		int [] arr = new int[] {1,-1,3,2,-2,-8,1,7,10,23};
		System.out.println("Largest sub-array length is: "+ob.largestSubArray(arr));
	}
}
