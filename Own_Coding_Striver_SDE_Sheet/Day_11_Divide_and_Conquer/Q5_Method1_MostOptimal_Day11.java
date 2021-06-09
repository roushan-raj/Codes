
public class Q5_Method1_MostOptimal_Day11 {
	
	public int median(int A [], int B []) {
		int n = A.length;
		int m = B.length;
		int totalLength = n+m;
		int k = (n+m)/2;
		int result = 0;
		
		if(totalLength % 2 == 0) {
			int num1 = findElement(A,B,k);
			int num2 = findElement(A,B,k+1);
		    result = (num1+num2)/2;
		} else {
			int num1 = findElement(A,B,k);
			result = num1;
		}
		return result;
	}
	
	public int findElement(int[] A, int[] B, int k) {
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
		Q5_Method1_MostOptimal_Day11 ob = new Q5_Method1_MostOptimal_Day11();
		int [] A = new int[] {1,5,8,10,18,20};
		int [] B = new int[] {2,3,6,7};
		System.out.println(ob.median(A, B));
	}
}
