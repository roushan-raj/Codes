
public class Q6_Method2_MostOptimal_Day3 {
	
	public int merge(int[]arr, int l, int mid, int r) {
		int rev = 0;
		int n1 = mid-l+1;
		int n2 = r-mid;
		int[] a1 = new int[n1];
		int[] b1 = new int[n2];
		
		for(int i=0; i<n1; i++)
			a1[i] = arr[l+i];
		
		for(int j=0; j<n2; j++)
			b1[j] = arr[mid+1+j];
		
		// Code for typical merge sorting
		int i=0; int j=0; int k=l;
		
		while(i<n1 && j<n2) {
			if(a1[i] < b1[j]) {
				arr[k] = a1[i];
				k++; i++;
			} else {
				arr[k] = b1[j];
				k++; j++;
			}	
		}
		while(i<n1) {
			arr[k] = a1[i];
			k++; i++;
		}
		while(j<n2) {
			arr[k] = b1[j];
			k++; j++;
		}
		
		// Code for finding reverse pair
		i=0;  j=0;
		
		while(i<n1 && j<n2) {
			if((long)a1[i] > (long)2*b1[j]) {
				 //System.out.println(a1[i] +" "+b1[j]);
				 rev += n1-i;
				 j++;
			} else {
				 i++;
			}
		}
		return rev;
	}
	
	public int mergeSort(int [] arr, int l, int r) {
		int rev = 0;
		if(l<r) {
			int mid = (l+r)/2;
			rev = mergeSort(arr, l, mid);
			rev += mergeSort(arr, mid+1, r);
			rev += merge(arr, l, mid, r);
		}
		return rev;
	}

	public static void main(String[] args) {
		 
		Q6_Method2_MostOptimal_Day3 ob = new Q6_Method2_MostOptimal_Day3();
		int arr[] = new int [] {40, 25, 19, 12, 9, 6, 2};
		 //int arr[] = new int [] {1,3,2,3,1};
		// int arr[] = new int [] {2,4,3,5,1};
		System.out.print("Total no.0f Reverse pairs: " + ob.mergeSort(arr, 0, arr.length-1));

	}

}
