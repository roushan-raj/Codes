import java.util.*;
public class Q5_Method2_MostOptimal {
	
	 public List<List<Integer>> subsetsWithDup(int[] nums) {
	        Arrays.sort(nums);
	        List<List<Integer>> resList = new ArrayList<>();
	        findSubsets(0, nums, new ArrayList<>(), resList);
	        return resList;
	    }
	    
	    public void findSubsets(int index, int[] nums, List<Integer> elements, List<List<Integer>> resList) {
	        resList.add(new ArrayList<>(elements));
	        for(int i = index; i < nums.length; i++) {
	            if(i != index && nums[i] == nums[i-1]){
	                continue;
	            } 
	            elements.add(nums[i]);
	            findSubsets(i+1, nums, elements, resList);
	            elements.remove(elements.size() - 1);
	        }
	    }

	public static void main(String[] args) {
		Q5_Method2_MostOptimal ob = new Q5_Method2_MostOptimal();
		int [] arr = new int[] {1,2,2};
		System.out.println(ob.subsetsWithDup(arr));
	}
}
