import java.util.*;

public class NthLargestNumInArray {
	
	public void findKthLargestElementusingMaxHeap(int [] nums, int k) {
		int count = 0;
		
		PriorityQueue<Integer> maxheap = new PriorityQueue<>((a, b) -> b - a); 
		for(int i=0; i<nums.length; i++) {
			maxheap.add(nums[i]);
		}
		
		if(k > nums.length) {
			System.out.println("INVALID");
			return;
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
		NthLargestNumInArray ob = new NthLargestNumInArray();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			 arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		sc.close();
		ob.findKthLargestElementusingMaxHeap(arr, k);
	}
}
