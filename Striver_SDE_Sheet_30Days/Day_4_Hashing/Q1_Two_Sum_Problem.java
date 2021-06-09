import java.util.HashMap;
import java.util.Map;

public class Q1_Two_Sum_Problem {
	
	public int[] twoSum(int [] numbers, int target) {
		int [] result = new int[2] ;
		Map<Integer, Integer> map = new HashMap <Integer, Integer>();
		for (int i=0; i<numbers.length; i++) {
			if (map.containsKey(target - numbers[i])) {
				result[1] = i;
				result[0] = map.get(target - numbers[i]);
				return result;
			}
			map.put(numbers[i], i);
		}
		System.out.println("Index pair not found");
		result[0] = -1;
		result[1] = -1;
		return result;
	}
	
	public void display(int[] result) {
		for (int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		 
		Q1_Two_Sum_Problem ob = new Q1_Two_Sum_Problem();
		int [] numbers = new int[] {2,6,5,8,11};
		int [] result = ob.twoSum(numbers, 76);
		System.out.println("The two indices are : " + result[0] + " and " + result[1]);


	}

}
