
public class Q6_Method1_MostOptimal_Day11 {
	
	public int findKthElement(int [] A, int [] B, int k) {
		int n = A.length;
		int m = B.length;
		
		int i=0, j=0, x=1;
		 
		while(i<n && j<m) {
			if(A[i] < B[j]) {
				if(x == k)
					return A[i];
				x++; i++;
			} else {
				if(x == k)
					return B[j];
				x++; j++;
			}
		}
		while(i<n) {
			if(x == k)
				return A[i];
			x++; i++;
		}
		while(j<m) {
			if(x == k)
				return B[j];
			x++; j++;
		}
		return -1;
	}

	public static void main(String[] args) {
		Q6_Method1_MostOptimal_Day11 ob = new Q6_Method1_MostOptimal_Day11();
		int [] A = new int[] {1,3,7,8,9};
		int [] B = new int[] {2,4,5,6};
		System.out.println(ob.findKthElement(A, B, 5));
		
	}
}
