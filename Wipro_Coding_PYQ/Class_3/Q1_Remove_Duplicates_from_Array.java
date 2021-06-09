
public class Q1_Remove_Duplicates_from_Array {
	
	public int removeDuplicates(int[] arr) {
		int n = arr.length;
		if(n == 0 || arr == null)
		    return 0;

		int i=0, j=0;
		while(i<n) {
			if(arr[j] == arr[i]) {
				i++;
			} else {
				j++;
				arr[j] = arr[i];
				i++;
			}
		}
		for(int k=0; k<=j; k++) {
			System.out.print(arr[k]+" ");
		}
		return j+1;
	}

	public static void main(String[] args) {
		Q1_Remove_Duplicates_from_Array ob = new Q1_Remove_Duplicates_from_Array();
		int [] arr = new int [] {1,1,2,2,3,3,4};
		//int [] arr = new int [] {5};
		System.out.println(ob.removeDuplicates(arr));
	}
}
