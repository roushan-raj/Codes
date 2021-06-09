import java.util.*;
public class Q3_Method2_MostOptimal_Day4 {
	
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
		 
		Q3_Method2_MostOptimal_Day4 ob = new Q3_Method2_MostOptimal_Day4();
		//int [] arr = new int[] {102,4,100,1,101,3,2};
		int[] arr = new int [] {102,4,100,1,101,3,2,103,104,106,107,105,10,11,12,13,14,15,16,17,18,19,20,99};
		System.out.print("Longest consecutive sequence is :- "+ob.longestSeq(arr));
	}
}
