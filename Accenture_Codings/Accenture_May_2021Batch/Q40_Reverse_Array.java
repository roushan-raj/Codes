
public class Q40_Reverse_Array {
	
	public static void reverseArray(int [] arr, int n) {
		int i = 0;
		int j = n-1;
		
		while(i <= j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		for(int k : arr) {
			System.out.print(k + " ");
		}
	}

	public static void main(String[] args) {
		int [] arr = {1, 3, 2, 5, 8};
		int n = arr.length;
		
		reverseArray(arr, n);
	}
}
