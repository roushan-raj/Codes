import java.util.*;
public class Q4_Method1_MostOptimal_Day22 {
	
	public List<Integer> distinctElementInWindow(int[] arr, int k) {
		
		List<Integer> list = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<k-1; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) +1);
		}
		
		for(int j=0, i=k-1; i<arr.length; i++,j++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+ 1); // Acquire next of array
			
			list.add(map.size());          // Add size of map into output list
			
			// Release the 1st element of the window
			int freq = map.get(arr[j]);
			if(freq == 1) {
				map.remove(arr[j]);
			}
			else {
				map.put(arr[i], freq-1);
			}
		}
		return list;
	}

	public static void main(String[] args) {
		
		Q4_Method1_MostOptimal_Day22 ob = new Q4_Method1_MostOptimal_Day22();
		
		int [] arr = new int[] {3,4,3,2,2,3};
		int k = 3;
		System.out.print(ob.distinctElementInWindow(arr, k) + " ");
	}
}
