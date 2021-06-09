
import java.util.*;

public class Q27_Second_Largest_InArray {
	
	public static int getSecondLargest(int [] arr, int k) {
		
		Set<Integer> set = new HashSet<>();
		
		for(int i=0; i<arr.length; i++) {
			set.add(arr[i]);
		}
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		Iterator<Integer> itr = set.iterator();
		
		if(set.size() >= k) {
			
			while(itr.hasNext()) {
				pq.add(itr.next());
				if(pq.size() > k) {
					pq.poll();
				}
			}
			return pq.peek();
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int [] arr = {1, 3, 6, 1, 0, 9, 8, 7, 6};
		
		System.out.println(getSecondLargest(arr, 2));
	}
}
