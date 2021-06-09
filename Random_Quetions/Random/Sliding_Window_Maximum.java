
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
public class Sliding_Window_Maximum {
	
	public int[] maxSlidingWindows(int[]arr, int k) {
		int n = arr.length;
		int ans [] = new int [n-k+1];
		
		int i=0;
		
		Deque<Integer> dq = new LinkedList<>();
		for(; i<k; i++) {
			while(!dq.isEmpty() && arr[dq.peekFirst()] <= arr[i]) {
				dq.removeLast();
			}
			dq.addLast(i);
		}
		
		for(; i<n; i++) {
			ans[i-k] = arr[dq.peekFirst()];
			
			while(!dq.isEmpty() && dq.peekLast() <= i-k) {
				dq.removeFirst();
			}
			
			while(!dq.isEmpty() && arr[dq.peekFirst()] <= arr[i]) {
				dq.removeLast();
			}
			dq.addLast(i);
		} 
		
		ans[i-k] = arr[dq.peekFirst()];
		return ans;
	}

	public static void main(String[] args) {
		Sliding_Window_Maximum ob = new Sliding_Window_Maximum();
		int [] arr = {4,3,1,2,5,3,4,7,1,9};
		int [] ans = ob.maxSlidingWindows(arr, 4);
		System.out.println(Arrays.toString(ans));
	}
}
