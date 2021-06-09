import java.util.Arrays;

public class Sum_X_in_Array {
	
	public int findSum(int[]arr, int X) {
		int n = arr.length;
		int l=0; int r=n-1;
		Arrays.sort(arr);
		
		while(l<r) {
			if(arr[l]+arr[r] == X)
				return 1;
			else if (arr[l]+arr[r] < X)
				l++;
			else
				r--;
		}
		return 0;
	}

	public static void main(String[] args) {
		Sum_X_in_Array ob = new Sum_X_in_Array();
		int [] arr = new int[] {0,-1,2,-3,1};
		System.out.println(ob.findSum(arr, -2));
	}
}
