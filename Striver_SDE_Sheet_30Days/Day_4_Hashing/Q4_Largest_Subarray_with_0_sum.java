import java.util.HashMap;

public class Q4_Largest_Subarray_with_0_sum {
	
	public int maxLen (int A[], int n) {
		HashMap <Integer, Integer> mpp = new HashMap<Integer, Integer>();
		int maxi = 0;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += A[i];
			if (sum == 0) {
				maxi = i + 1;
			}
			else {
				if (mpp.get(sum) != null) {
					maxi = Math.max(maxi, i - mpp.get(sum));
				}
				else {
					mpp.put (sum , i);
				}
			}
		}
		return maxi;
	}

	public static void main(String[] args) {
		 
		Q4_Largest_Subarray_with_0_sum ob = new Q4_Largest_Subarray_with_0_sum();
		int A[] = new int [] {1, -1, 3, 2, -2, -8, 1, 7, 10, 23};
		System.out.println("Largest Sub-array length is : " + ob.maxLen(A, 9));

	}

}
