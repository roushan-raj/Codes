
public class Q2_Array_count_digits_Slot2_24April2021 {
	
	public static int countDigits(int [] arr, int k) {
		if(arr.length == 0) {
			return -1;
		}
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			String str = Integer.toString(arr[i]);
			
			if(str.length() == k) {
				count ++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		 int [] arr = {332, 1, 302, 41, 44, 95, 122, 85, 65, 3221, 775, 12};
		 System.out.println(countDigits(arr, 3));
	}
}
