import java.util.*;
public class Longest_Consecutive_Sequence {
	
	public int longestSeq(int[]arr) {
		int n = arr.length;
		Set<Integer> set = new HashSet<>();
		
		for(int i=0; i<n; i++) {
			set.add(arr[i]);
		}
		int longSeq = 0;
		for(int i=0; i<n; i++) {
			if(!set.contains(arr[i]-1)) {
			    int count = 1;
				int element = arr[i]; 
				
				while (set.contains(element+1)){
					count = count+1;
					element = element+1;
				}
				longSeq = Math.max(longSeq, count);
			}
		}
		return longSeq;
	}

	public static void main(String[] args) {	 
		Longest_Consecutive_Sequence ob = new Longest_Consecutive_Sequence();
		int [] arr = new int[] {102,4,100,1,101,3,2,6};
		System.out.print("Longest consecutive sequence is :- "+ob.longestSeq(arr));
	}
}
