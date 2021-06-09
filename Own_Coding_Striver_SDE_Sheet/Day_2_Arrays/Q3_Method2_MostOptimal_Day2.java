
public class Q3_Method2_MostOptimal_Day2 {
	
	public void nextPermutation(int[]arr) {
		int n = arr.length;
		int ind1 = -1;
		int ind2 = -1;
		
		for(int i=n-2; i>=0; i--) {
			if (arr[i] < arr[i+1]) {
				 ind1 = i;
				 break;				
			}		
		}
		if(ind1 >= 0) {
			for (int j=n-1; j>=0; j--) {
				if (arr[ind1] < arr[j]) {
				    ind2 = j;
					break;
				}
			}
			    swap(arr, ind1, ind2);
		}
		reverse (arr, ind1+1, n-1);
	}
	
	public void swap(int [] arr, int ind1, int ind2) {
		int temp = arr[ind1];
		arr[ind1] = arr[ind2];
		arr[ind2] = temp;
	}
	
	public void reverse (int [] arr, int ind1, int n) {
		while(ind1 < n) {
			int temp = arr[ind1];
			arr[ind1] = arr[n];
			arr[n] = temp;
			ind1++; n--;
		}
	}
	
	public void display(int [] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		 
		Q3_Method2_MostOptimal_Day2 ob = new Q3_Method2_MostOptimal_Day2();
		int [] arr = new int [] {1,3,5,4,2};
		ob.nextPermutation(arr);
		ob.display(arr);
	}
}






