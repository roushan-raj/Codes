import java.util.*;
public class No_of_subarrays_with_given_XOR {
	
	public int xorSubArray(int[]arr, int x) {
		Map<Integer, Integer> map = new HashMap<>();
		int n = arr.length;
		int xor = 0;
		int count = 0;
		for(int i=0; i<n; i++) {
			xor = xor ^ arr[i];
			
			if(xor == x) {
				count = count + 1;
			}
			if(map.get(xor) == null) {
				map.put(xor, 1);
			} else {
				map.put(xor, map.get(xor) + 1);
			}
			if(map.get(xor ^ x) != null) {
				count = count + map.get(xor ^ x);
			}
		}
		return count;
	}

	public static void main(String[] args) {
		No_of_subarrays_with_given_XOR ob = new No_of_subarrays_with_given_XOR();
		int [] arr = new int [] {4,2,2,6,4};
		System.out.print("NO.of subarrays is: "+ob.xorSubArray(arr, 6));
	}
}

