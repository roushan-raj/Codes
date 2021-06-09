import java.util.*;
public class Min_rope_cost {
	
	public int findMinCost(int [] arr) {
		int finalCost = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0; i<arr.length; i++) {
			pq.add(arr[i]);
		}
		
		while(pq.size() > 1) {
			int firstRope = pq.poll();
			int secondRope = pq.poll();
			
			int curr = firstRope + secondRope;
			
			finalCost = finalCost + curr;
			
			pq.add(curr);
		}
		
		return finalCost;
	}

	public static void main(String[] args) {
		Min_rope_cost ob = new Min_rope_cost();
		
		int [] ropes = new int [] {8, 4, 6, 12};
		System.out.println(ob.findMinCost(ropes));
	}
}
