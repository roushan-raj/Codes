import java.util.Arrays;

public class Q1_Method1 {
	
	public int duplicateNum(int [] arr) {
		Arrays.sort(arr);
		int n = arr.length;
		
		for (int i = 1; i<n; i++) {
			if (arr[i-1] == arr[i]) {
				return arr[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		Q1_Method1 ob = new Q1_Method1();	
		int[] arr = new int [] {5,4,1,3,2,3};
		System.out.println(ob.duplicateNum(arr));

	}

}
