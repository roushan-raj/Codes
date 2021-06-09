
public class Q3_MaxElementInArray {
	
	public static void findMaximum(int [] arr) {
		if(arr.length == 0) {
			return;
		}
		
		int max = Integer.MIN_VALUE;
		int Index = -1;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				Index = i;
			}
		}
		System.out.println(max+" "+Index);
	}

	public static void main(String[] args) {
		int [] arr = {12, 4, 90, 23, 8, 40, 6};
		findMaximum(arr);
	}
}
