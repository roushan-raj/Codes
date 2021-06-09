import java.util.*;
public class Q5_Method2_MostOptimal_Day4 {
	
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
		 
		Q5_Method2_MostOptimal_Day4 ob = new Q5_Method2_MostOptimal_Day4();
		int [] arr = new int [] {4,2,2,6,4};
		System.out.print(ob.xorSubArray(arr, 6));
	}
}
