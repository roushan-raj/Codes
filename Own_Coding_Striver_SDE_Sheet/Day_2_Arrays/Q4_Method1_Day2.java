
public class Q4_Method1_Day2 {
	
	public int inversion(int [] arr) {
		int n = arr.length;
		int count = 0;
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				if (i<j && arr[i] > arr[j]) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		 
		Q4_Method1_Day2 ob = new Q4_Method1_Day2();
		int [] arr = new int [] {5,3,2,4,1};
		System.out.print("Total number of inversion : " + ob.inversion(arr));
	}
}
