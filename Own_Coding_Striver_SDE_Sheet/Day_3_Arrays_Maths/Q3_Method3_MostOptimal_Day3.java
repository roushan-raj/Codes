
public class Q3_Method3_MostOptimal_Day3 {
	
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
		 
		Q3_Method3_MostOptimal_Day3 ob = new Q3_Method3_MostOptimal_Day3();
		int [] arr = new int[] {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
		System.out.print("Majority element is: "+ob.majorityElement(arr));

	}

}
