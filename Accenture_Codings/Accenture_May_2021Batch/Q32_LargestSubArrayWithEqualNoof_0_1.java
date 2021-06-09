import java.util.*;
public class Q32_LargestSubArrayWithEqualNoof_0_1 {
	
	public static int largestSubArray(int arr[], int n) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		int sum = 0;
		int maxl = 0;
		int e_ind = -1;
		
		for (int i = 0; i < n; i++) {
			arr[i] = (arr[i] == 0) ? -1 : 1;
		}

		for (int i = 0; i < n; i++) {
			
			sum += arr[i];

			if (sum == 0) {
				maxl = i + 1;
				e_ind = i;
			}

			if (map.containsKey(sum)) {
				if (maxl < i - map.get(sum)) {
					maxl = i - map.get(sum);
					e_ind = i;
				}
			}
			else 
				map.put(sum, i);
		}

		for (int i = 0; i < n; i++) {
			arr[i] = (arr[i] == -1) ? 0 : 1;
		}

		return maxl > 0 ? maxl : -1;
	}

	public static void main(String[] args) {
		int arr[] = {0, 1, 0, 1};
		int n = arr.length;
		
		System.out.println(largestSubArray(arr, n));
	}
}

