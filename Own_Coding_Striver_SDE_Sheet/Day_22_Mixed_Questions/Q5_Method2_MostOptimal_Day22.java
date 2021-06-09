import java.util.*;
public class Q5_Method2_MostOptimal_Day22 {
	
	////////////////// Using Min Heap ////////////////////
	
	public void findKthLargestElementusingMinHeap(int [] nums, int k) {
		int count = 0;
		PriorityQueue<Integer> minheap = new PriorityQueue<>();
		for(int i=0; i<nums.length; i++) {
			minheap.add(nums[i]);
		}
		for(int j=0; j<nums.length-k+1; j++) {
			count++;
			if(count == nums.length-k+1) {
				System.out.println(minheap.peek());
			}
			minheap.poll();
		}
	}
	
	////////////////// Using Max Heap //////////////////////
	
	public void findKthLargestElementusingMaxHeap(int [] nums, int k) {
		int count = 0;
		
		//PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
		
		// implementing max heap using comparator
		PriorityQueue<Integer> maxheap = new PriorityQueue<>((a, b) -> b - a); 
		for(int i=0; i<nums.length; i++) {
			maxheap.add(nums[i]);
		}
		
		for(int j=0; j<k; j++) {
			count++;
			if(count == k) {
				System.out.println(maxheap.peek());
			}
			maxheap.poll();
		}
	}

	public static void main(String[] args) {
		
		Q5_Method2_MostOptimal_Day22 ob = new Q5_Method2_MostOptimal_Day22();
		int [] arr = new int[] {10, 7, 11, 5, 27, 8, 9, 45};
		int k = 3;
		ob.findKthLargestElementusingMinHeap(arr, k);
		ob.findKthLargestElementusingMaxHeap(arr, k);
	}
}
