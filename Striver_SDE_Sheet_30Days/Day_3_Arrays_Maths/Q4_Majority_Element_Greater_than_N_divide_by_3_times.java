import java.util.ArrayList;
import java.util.List;

public class Q4_Majority_Element_Greater_than_N_divide_by_3_times {
	
	public List<Integer> majorityElement(int [] nums){
		int num1 = -1, num2 = -1, c1 = 0, c2 = 0, len = nums.length;
		for (int i=0; i<len; i++) {
			if (nums[i] == num1) {
				c1++;
			}
			else if (nums[i] == num2) {
				c2++;
			}
			else if (c1 == 0) {
				num1 = nums[i];
				c1 = 1;
			}
			else if (c2 == 0) {
				num2 = nums[i];
				c2 = 1;
			}
			else {
				c1 --;
				c2 --;
			}
		}
		
		List<Integer> ans = new ArrayList<Integer>();
		c1 = 0;
		c2 = 0;
		for (int i=0; i<len; i++) {
			if (nums[i] == num1)
				c1 ++;
			else if (nums[i] == num2) 
				c2 ++;
		}
		
		if (c1 > len/3)
			ans.add(num1);
		if (c2 > len/3)
			ans.add(num2);
		return ans;
	}

	public static void main(String[] args) {
		 
		Q4_Majority_Element_Greater_than_N_divide_by_3_times ob = new Q4_Majority_Element_Greater_than_N_divide_by_3_times();
		int [] nums = new int [] {1,1,1,3,3,2,2,2};
		System.out.println("Majority Elements in Array is : " + ob.majorityElement(nums));
	}

}
