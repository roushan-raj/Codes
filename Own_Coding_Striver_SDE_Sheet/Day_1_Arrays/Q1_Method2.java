
public class Q1_Method2 {
	
	public int duplicateNum(int [] arr) {
		int n = arr.length;
		
		int [] frqArray = new int[n+1] ;
		for (int i=0; i<n; i++) {
			frqArray[i] = 0;
		}
		
		for (int i =0; i<n; i++) {
			if (frqArray[arr[i]] == 0) {
				frqArray[arr[i]] = 1;
			} else
				return arr[i];
		}
		return -1;
	}
	

	public static void main(String[] args) {
		 
		Q1_Method2 ob = new Q1_Method2();
		int[] arr = new int [] {5,4,1,3,2,3};
		System.out.println(ob.duplicateNum(arr));

	}

}
