import java.util.*;
public class Q2_Method2_MostOptimal_Day22 {
	
	PriorityQueue<Integer> minheap = new PriorityQueue<>();
	PriorityQueue<Integer> maxheap = new PriorityQueue<>((a,b) -> b-a);
	
	public void findMedian(int nums) {
		if(maxheap.isEmpty() || maxheap.peek() > nums) {
			maxheap.add(nums);
		}
		else {
			minheap.add(nums);
		}
		
		if(maxheap.size() > minheap.size()+1) {
			minheap.add(maxheap.peek());
			maxheap.poll();
		}
		else if(minheap.size() > maxheap.size()+1) {
			maxheap.add(minheap.peek());
			minheap.poll();
		}
		
		if(maxheap.size() == minheap.size()) {
			System.out.println("Median is: "+(maxheap.peek() + minheap.peek()) / 2.0);
		}
		else if(maxheap.size() > minheap.size()) {
			System.out.println("Median is: "+maxheap.peek());
		}
		else {
			System.out.println("Median is: "+minheap.peek());
		}
	}

	public static void main(String[] args) {
		
		Q2_Method2_MostOptimal_Day22 ob = new Q2_Method2_MostOptimal_Day22();
		
		int [] arr = new int[] {5,2,3,1,6,4};
		for(int i=0; i<arr.length; i++) {
			ob.findMedian(arr[i]);
		}
	}
}
