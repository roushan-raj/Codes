
/////// This is Dutch National Flag Algorithm, with low, mid and high concept ///////
//////////////// Solve with time complexity of O(n) //////////////////
/////////////// Solve with space complexity of O(1) //////////////////

public class Q2_Sort_an_array_of_0s_1s_2s_without_using_extra_space_or_sorting_algo {
	
	public void sortArray(int [] nums) {
		int n = nums.length;
		int low = 0;
		int mid = 0;
		int high = n-1;
		int temp;
		
		while (mid <= high) {
			switch (nums[mid]) {
			case 0: {
				temp = nums[low];
				nums[low] = nums[mid];
				nums[mid] = temp;
				low++;
				mid++;
				break;
			}
			
			case 1: {
				mid++;
				break;
			}
			
			case 2: {
				temp = nums[mid];
				nums[mid] = nums[high];
				nums[high] = temp;
				high--;
				break;
			  }		
		   }
	    }	
	}
	
	public void printArray(int [] nums) {
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		Q2_Sort_an_array_of_0s_1s_2s_without_using_extra_space_or_sorting_algo ob = new Q2_Sort_an_array_of_0s_1s_2s_without_using_extra_space_or_sorting_algo(); 
		int [] nums = new int[] {0,1,1,0,1,2,1,2,0,0,0,1};
		// System.out.println("Sorted array is :- " + ob.sortArray(nums));
		ob.sortArray(nums);
		ob.printArray(nums);

	}

}
