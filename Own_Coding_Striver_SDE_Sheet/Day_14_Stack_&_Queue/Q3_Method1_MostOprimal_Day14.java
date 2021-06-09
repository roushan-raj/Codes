import java.util.*;
public class Q3_Method1_MostOprimal_Day14 {
	
	public int maxHistogramArea(int[]arr) {
		int n = arr.length;
		int maxArea = 0;
		Stack<Integer> st = new Stack<>();
		
		st.push(0);  // initially push 1st index in stack
		
		// when the element in array is in any order --> {2,1,5,6,2,3}
		for(int i=0; i<n; i++) {
			int curr = arr[i];
			if(curr > arr[st.peek()]) {
				st.push(i);
			}
			else {
				while(!st.isEmpty() && curr < arr[st.peek()]) {
					int temp = arr[st.pop()];
					
					if(st.isEmpty()) {
						maxArea = Math.max(maxArea, temp*i);
					}
					else {
						maxArea = Math.max(maxArea, (i-st.peek()-1)*temp);
					}
				}
				st.push(i);
			}
		}
		
		// when the element in array is in increasing order --> {4,5,6,7,8,9}
		if(!st.isEmpty()) {
			int i = arr.length;
			while(!st.isEmpty()) {
				int temp = arr[st.pop()];
				
				if(st.isEmpty()) {
					maxArea = Math.max(maxArea, temp*i);
				}
				else {
					maxArea = Math.max(maxArea, (i - st.peek() - 1)*temp);
				}
			}
		}
		
		return maxArea;
	}

	public static void main(String[] args) {
		Q3_Method1_MostOprimal_Day14 ob = new Q3_Method1_MostOprimal_Day14();
		int [] arr = new int [] {2,1,5,6,2,3};
		//int [] arr = new int [] {4,5,6,7,8,9};
		System.out.println(ob.maxHistogramArea(arr));
	}
}
