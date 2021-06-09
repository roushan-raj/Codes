
public class LinearSearchh {
	
	public int Search(int arr[], int n, int x) {
		for(int i=0; i<n; i++) {
			if(arr[i] == x) {
				return i;
			} 
		}
		return -1;
	}

	public static void main(String[] args) {
		 
		LinearSearchh ob = new LinearSearchh();
		int arr [] = {20,48,24,19,67,82,90};
		System.out.print(ob.Search(arr, arr.length, 90));

	}

}
