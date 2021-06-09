import java.util.*;

public class Q2_Method1_Day4 {
	
	public Set<List<Integer>> fourSum(int[]arr, int x) {
		Set<List<Integer>> set = new HashSet<List<Integer>>();
		int n = arr.length;
		Arrays.sort(arr);
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				for(int k=j+1; k<n; k++) {
					int sum = x -(arr[i]+arr[j]+arr[k]);
					
					// Binary Search
					int l=k+1; int h=n-1;
					while(l<=h) {
						int mid = (l+h)/2;
						if(arr[mid] == sum) {
							
							// Adding quad to list
							List<Integer> quad = new ArrayList<>();
							quad.add(arr[i]);
							quad.add(arr[j]);
							quad.add(arr[k]);
							quad.add(arr[mid]);
							
							// Adding that unique quad to set
							set.add(quad);
							
						} if (arr[mid] < sum) {
							l = mid+1;
						} else {
							h = mid-1;
						}
					}
				}
			}
		}
		return set;
	}

	public static void main(String[] args) {
		
		Q2_Method1_Day4 ob = new Q2_Method1_Day4();
		int [] arr = new int [] {4,3,3,4,4,2,1,2,1,1};
		System.out.print(ob.fourSum(arr, 9));

	}
}
