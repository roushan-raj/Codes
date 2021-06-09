import java.util.*;
public class Q2_Method2_MostOptimal {
	
	private void findCombinations(int index, int [] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
		if(target == 0) {
			ans.add(new ArrayList<>(ds));
			return;
		}
		
		for(int i=index; i<arr.length; i++) {
			
			if(i > index && arr[i] == arr[i-1])
				continue;
			
			if(arr[i] > target)
				break;
				
			ds.add(arr[i]);
			findCombinations(i+1, arr, target-arr[i], ans, ds);
			ds.remove(ds.size()-1);
		}
	}
	
	public List<List<Integer>> combinations(int [] arr, int target){
		List<List<Integer>> ans = new ArrayList<>();
		Arrays.sort(arr);
		findCombinations(0, arr, target, ans, new ArrayList<>());
		return ans;
	}

	public static void main(String[] args) {
		Q2_Method2_MostOptimal ob = new Q2_Method2_MostOptimal();
		int [] arr = new int [] {10,1,2,7,6,1,5};
		System.out.println(ob.combinations(arr, 8));
	}
}
