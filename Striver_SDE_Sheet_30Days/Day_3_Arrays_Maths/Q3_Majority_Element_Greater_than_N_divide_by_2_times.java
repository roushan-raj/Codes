
public class Q3_Majority_Element_Greater_than_N_divide_by_2_times {
	
	public int majorityElement(int[] nums) {
		int count = 0;
		int element = 0;
		
		for (int num : nums) {
			
			if (count == 0) {
				element = num;
			}
			
			if (num == element) {
				count += 1;
			} else {
				count -= 1;
			}
		}
		return element;
	}

	public static void main(String[] args) {
		 
		Q3_Majority_Element_Greater_than_N_divide_by_2_times ob = new Q3_Majority_Element_Greater_than_N_divide_by_2_times();
		int [] nums = new int[] {7,7,5,7,5,1,5,7,5,5,5,7,7,5,5,5,5};
		System.out.println("Majority element is : " + ob.majorityElement(nums));
	}

}
