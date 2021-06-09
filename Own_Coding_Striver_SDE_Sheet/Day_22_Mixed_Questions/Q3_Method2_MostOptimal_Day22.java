import java.util.*;
public class Q3_Method2_MostOptimal_Day22 {
	
	PriorityQueue<Integer> minheap = new PriorityQueue<>();
	public int addElementToMinHeap(int num, int k) {
		if(minheap.size() < k) {
			minheap.add(num);
			
		if(minheap.size() == k)
			return minheap.peek();
		else
			return -1;
		}
		
		if(num > minheap.peek()) {
			minheap.poll();
			minheap.add(num);
		}
		return minheap.peek();
	}

	public static void main(String[] args) {
		
		Q3_Method2_MostOptimal_Day22 ob = new Q3_Method2_MostOptimal_Day22();
		
		int [] arr = new int[] {10, 7, 11, 5, 27, 8, 9, 45};
		int k = 3;
		for(int i=0; i<arr.length; i++) {
			System.out.println(ob.addElementToMinHeap(arr[i], k));
		}
	}
}
