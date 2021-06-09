
public class Remove_Duplicates_from_Sorted_Array {
	
	public int removeDuplicate(int[]arr) {
		int n = arr.length;
		if(n == 0 || arr == null)
			return 0;
		
		int back = 0;
		for(int front =1; front<n; front++) {
			if(arr[back] != arr[front]) {
				back++;
				arr[back] = arr[front];
			}
		}
		return back+1;	
	}
	
	public void display(int[]arr, int back) {
		int n = arr.length;
		
		System.out.println("Original Array is: ");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("Unique elements of Array is: ");
		for(int i=0; i<back; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		
		Remove_Duplicates_from_Sorted_Array ob = new Remove_Duplicates_from_Sorted_Array();
		int[] arr = new int[] {0,0,1,1,1,1,2,2,3,4,4,5};
		int x = ob.removeDuplicate(arr);
		System.out.println("No.of unique elements are: "+x);
		ob.display(arr, x);
	}
}












