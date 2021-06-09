
public class Majority_Elements_1 {
	
	public int majorityElement(int[]arr) {
		int count = 0;
		int element = 0;
		for(int i=0; i<arr.length; i++) {
			if (count==0)
				element = arr[i];
			
			if (element == arr[i])
				count++;
			else
				count--;	
		}
		return element;
	}

	public static void main(String[] args) {
		 
		Majority_Elements_1 ob = new Majority_Elements_1();
		int [] arr = new int[] {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
		System.out.print("Majority element (>N/2 times) is: "
		                                 +ob.majorityElement(arr));
	}
}
