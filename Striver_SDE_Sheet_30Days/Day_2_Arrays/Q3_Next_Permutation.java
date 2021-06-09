
public class Q3_Next_Permutation {
	
	public void nextPermutation(int[] A) {
		if (A == null || A.length <= 1) return;
		int i = A.length - 2;
		
		while(i >= 0 && A[i] >= A[i+1]) {
			i--;
		}
		if (i >= 0) {
			int j = A.length-1;
			while(A[j] <= A[i]) {
				j--;
			}
			swap(A, i, j);
		}
		reverse (A, i+1, A.length-1);
	}
	
	public void swap(int [] A, int i, int j) {
		int tmp = A[i];
		A[i] = A[j];
		A[j] = tmp;
	}
	
	public void reverse (int [] A, int i, int j) {
		while(i<j) {
			swap(A, i++, j--);
		}
	}
	
	public void displayNextPermutation(int [] A) {
		for (int i=0; i<A.length; i++) {
			System.out.print(A[i]+ " ");
		}
	}

	public static void main(String[] args) {
		 
		Q3_Next_Permutation ob = new Q3_Next_Permutation();
		int [] A = new int [] {1,2,3};
		ob.nextPermutation(A);
		ob.displayNextPermutation(A);

	}

}
