import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Q2_Four_Sum_Problem {

	public static Set<List<Integer>> fourSum(int[] arr , int target) {
		Set<List<Integer>> res = new HashSet<List<Integer>>();
		
		if (arr == null || arr.length == 0) {
			return res;
		}
		int n = arr.length;
		Arrays.sort(arr);
		
		for(int i=0; i< n ; i++) {
			for(int j =i+1 ; j <n ; j++) {
				
				int target_2 = target - arr[i] - arr[j];	 			
				int left = j+1; 
				int right = n-1;
				
				while(left < right) {
					int two_sum = arr[left] + arr[right];
					if(two_sum < target_2) {
						left++;
					}
					else if(two_sum > target_2) {
						right--;
					}
					else {
						List<Integer> quad = new ArrayList<>();
						quad.add(arr[i]);
						quad.add(arr[j]);
						quad.add(arr[left]);
						quad.add(arr[right]);
						res.add(quad);
					
					while(left < right && arr[left] == quad.get(2)) ++left;
					while(left < right && arr[right] == quad.get(3)) --right;
				} // else closes
				}// while closes
				
				while(j+1<n && arr[j+1]==arr[j] ) ++j;
			}// j for loop closes
			while(i+1<n && arr[i+1]==arr[i] ) ++i;
			}// i for loop closes
		return res;
		}
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {4,3,3,4,4,2,1,2,1,1};
		System.out.println(fourSum(arr, 9));
		
		//ArrayList<List<Integer>> q = fourSum(arr, 9);
		//System.out.println(q);
	}

}
