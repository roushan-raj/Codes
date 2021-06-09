
public class Q7_Array_Slot_1_23Dec2020 {
	
	public static void afterManipulation(int [] arr) {
		
		if(arr.length == 0) {
			System.out.println("null");
		}
		
		for(int i=0; i<arr.length; i++) {
			int curr = arr[i];
			
			int sumSmaller = 0;
			int sumGreater = 0;
			for(int j=i+1; j<arr.length; j++) {
				
				if(curr > arr[j]) {
					sumGreater = sumGreater + arr[j];
				}
				else if (curr < arr[j]) {
					sumSmaller = sumSmaller + arr[j];
				}
			}
			arr[i] = sumGreater * sumSmaller;
		}
		
		for(int k = 0; k<arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}
	
	public static void main(String[] args) {
		int [] arr = {8, 4, 5, 3, 2, 6, 9, 1};
		afterManipulation(arr);
	}
}
