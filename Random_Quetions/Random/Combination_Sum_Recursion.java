import java.util.*;
public class Combination_Sum_Recursion {
	
	private void findCombinations(int index, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
		if(index == arr.length) {
			if(target == 0) {
			    ans.add(new ArrayList<>(ds));
		    }
		    return;
		}
		if(arr[index] <= target) {
			ds.add(arr[index]);
			findCombinations(index, arr, target-arr[index], ans, ds);
			ds.remove(ds.size() - 1);
		}
		findCombinations(index+1, arr, target, ans, ds);
	}
	
	public List<List<Integer>> combinationSum(int [] arr, int target){
		List<List<Integer>> ans = new ArrayList<>();
		findCombinations(0, arr, target, ans, new ArrayList<>());
		return ans;
	}
	

	public static void main(String[] args) {
		Combination_Sum_Recursion ob = new Combination_Sum_Recursion();
		int [] arr = new int[] {2,3,6,7};
		System.out.println(ob.combinationSum(arr, 7));
	}
}
