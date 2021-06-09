import java.util.*;

public class Q6_Method1_MostOptimal_Day13 {
	
	public int[] nextGreaterElement(int[]arr) {
		int [] output = new int[arr.length];
		Arrays.fill(output, -1);
		
		Stack<Integer> st = new Stack<>();
		
		for(int i=0; i<arr.length; i++) {
			while(!st.isEmpty() && arr[st.peek()] < arr[i])
				output [st.pop()] = arr[i];
			st.push(i);
		}
		return output;
	}

	public static void main(String[] args) {
		Q6_Method1_MostOptimal_Day13 ob = new Q6_Method1_MostOptimal_Day13();
		//int arr [] = {4,2,6,18,1};
		int arr [] = {4,5,2,10,8};
		int [] output = ob.nextGreaterElement(arr);
		System.out.println(Arrays.toString(output));
	}
}
