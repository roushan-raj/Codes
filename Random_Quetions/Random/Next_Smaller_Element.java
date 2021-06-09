
import java.util.Arrays;
import java.util.Stack;
public class Next_Smaller_Element {
	
	public int[] nextSmallerElement(int[]arr) {
		int [] output = new int[arr.length];
		Arrays.fill(output, -1);
		Stack<Integer> st = new Stack<>();
		
		for(int i=0; i<arr.length; i++) {
			while(!st.isEmpty() && arr[st.peek()] > arr[i]) {
				output[st.pop()] = arr[i];
			}
			st.push(i);
		}
		return output;
	}

	public static void main(String[] args) {
		Next_Smaller_Element ob = new Next_Smaller_Element();
		int arr [] = {4,5,2,10,8};
		int [] output = ob.nextSmallerElement(arr);
		System.out.println(Arrays.toString(output));
	}
}
