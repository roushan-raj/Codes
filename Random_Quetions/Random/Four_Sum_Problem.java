
import java.util.*;

public class Four_Sum_Problem {
	
	public Set<List<Integer>> fourSum(int[]arr, int x){
		Set<List<Integer>> set = new HashSet<>();
		int n = arr.length;
		Arrays.sort(arr);
		
		if(arr == null || arr.length == 0) {
			return set;
		}
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				int twoNum = x - (arr[i]+arr[j]);
				
				int left = j+1;
				int right = n-1;
					
				while(left<right) {
					
					if(twoNum < arr[left]+arr[right]) {
					    right--;
					}
					else if(twoNum > arr[left]+arr[right]) {
						left++;
					}
					else {
						List<Integer> quad = new ArrayList<>();
						quad.add(arr[i]);
						quad.add(arr[j]);
						quad.add(arr[left]);
						quad.add(arr[right]);
						set.add(quad);
					
					while(left<right && arr[left] == quad.get(2)) ++left;
					while(left<right && arr[right] == quad.get(3)) --right;
				}
				}
				while(j+1 < n && arr[j+1] == arr[j]) ++j;
			}
			while(i+1 < n && arr[i+1] == arr[i]) ++i; 
		}	
		return set;
	}

	public static void main(String[] args) {
		 
		Four_Sum_Problem ob = new Four_Sum_Problem();
		int [] arr = new int [] {4,3,3,4,4,2,1,2,1,1};
		System.out.print(ob.fourSum(arr, 9));
	}
}




