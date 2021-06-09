
public class Q4_Method1_Day4 {
	
	public int largestSubArray(int[]arr) {
		int n = arr.length;
		int maxElement = 0;
		for(int i=0; i<n; i++) {
			int sum = 0;
			for(int j=i+1; j<n; j++) {
				if(sum + arr[i] + arr[j] == 0) {
					int elements = j-i;
					maxElement = Math.max(maxElement, elements);
				}
			}
		}
		return maxElement;
	}

	public static void main(String[] args) {
		 
		Q4_Method1_Day4 ob = new Q4_Method1_Day4();
		int [] arr = new int[] {1,-1,3,2,-2,-8,1,7,10,23};
		System.out.print(ob.largestSubArray(arr));
	}
}
