
public class ResizeArray {
	
	public void printArray(int[] arr) {
		int n = arr.length;
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public int [] resizeArray(int[] arr, int capacity) {
		int n = arr.length;
		int [] temp = new int [capacity];
		for (int i = 0; i<n; i++) {
			temp[i] = arr [i];
		}
		arr = temp;
		return arr;
	}

	public static void main(String[] args) {
		 
		ResizeArray r = new ResizeArray();
		int [] original = new int [] {5,2,7,9,8};
		r.printArray(original);
		System.out.println("Length of Array before Resize : " + original.length);
		original = r.resizeArray(original, 10);
		System.out.println("Length of Array after Resize : " + original.length);

	}
}
