import java.util.HashMap;
import java.util.Map;

public class TwoSumQuestionInArray {
	
	public int [] twoSum (int [] arr, int target) {
		int [] result = new int [2];
		Map <Integer, Integer> map = new HashMap<>();
		
		for (int i=0; i<arr.length; i++) {
			if (!map.containsKey(target - arr[i] )) {
				map.put(arr[i], i);
			} else {
				result [1] = i;
				result [0] = map.get(target - arr[i]);
			}	
		}
		return result;
		
		//throw new IllegalArgumentException("Two numbers not found");
		//System.out.println("Two numbers not found");
	}
  
	public static void main(String[] args) {
		
		TwoSumQuestionInArray TwoSum = new TwoSumQuestionInArray();
		 
		int [] arr = new int [] {2,11,5,10,7,8};
		//int [] arr = new int [] {1,2,3,4,5,6,7,8,9};
		int [] result = TwoSum.twoSum(arr, 9);
		System.out.println("The two indices are : " + result[0] + " and " + result[1]);

	}

}
