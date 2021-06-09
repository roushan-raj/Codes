
public class Q2_Array_Slot_1_22Dec2020 {
	
	public static int findCount(int arr[], int length, int num, int diff) {
		int count = 0;
		
		for(int i=0; i<length; i++) {
			if(Math.abs(arr[i] - num) <= diff) {
				count ++;
			}
		}
		return count > 0 ? count : -1;
	}

	public static void main(String[] args) {
		int arr [] = {12, 3, 14, 12, 15, 13};
		System.out.println(findCount(arr, arr.length, 13, 2));
	}
}
