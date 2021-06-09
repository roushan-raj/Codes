import java.util.HashMap;
import java.util.Map;

public class Q1_Method2_MostOptimal_Day4 {
	
	public void twoSum(int[]arr, int x) {
		Map<Integer, Integer> map = new HashMap<>();
		int n = arr.length;
		int [] result = new int[2];
		
		for(int i=0; i<n; i++) {
			int remains = x-arr[i];
			if(!map.containsKey(remains))
				map.put(arr[i], i);
			else {
				result[0] = map.get(remains);
				result[1] = i;	
			}
		}
		
		System.out.print("Indices are : ");
		for(int j=0; j<result.length; j++) {
			System.out.print(result[j]+" ");
		}
		//return result;	
	}

	public static void main(String[] args) {
		 
		Q1_Method2_MostOptimal_Day4 ob = new Q1_Method2_MostOptimal_Day4();
		int[] arr = new int [] {2,6,5,8,11};
		ob.twoSum(arr, 14);
	}
}
