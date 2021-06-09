
public class Q3_Method1_Day4 {
	
	public void merge(int[]arr, int l, int mid, int h) {
		int n1 = mid+1-l;
		int n2 = h-mid;
		int[] a1 = new int[n1];
		int[] b1 = new int[n2];
		
		for(int i=0; i<n1; i++) {
			a1[i] = arr[l+i];
		}
		for(int j=0; j<n2; j++) {
			b1[j] = arr[mid+1+j];
		}
		
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
		
	}
	
	public void display(int[]arr) {
		for(int p=0; p<arr.length; p++) {
			System.out.print(arr[p]+" ");
		}
	}
	
	public void mergeSort(int[]arr, int l, int h) {
		if(l<h) {
			int mid = (l+h)/2;
			mergeSort(arr, l, mid);
			mergeSort(arr, mid+1, h);
			merge(arr, l, mid, h);
		}
	}
	
	public int longestSeq(int[]arr) {
		int count = 1;
		int longSeq = 0;
		int element = arr[0];
		
		for(int i=0; i<arr.length-1; i++) {
			if(element+1 == arr[i+1]) {
				count++;
				element = arr[i+1];
			    longSeq = Math.max(longSeq, count);
			} else {
				element = arr[i+1];
				count = 1;
			}
		}
		return longSeq;
	}

	public static void main(String[] args) {
		 
		Q3_Method1_Day4 ob = new Q3_Method1_Day4();
		int[] arr = new int [] {102,4,100,1,101,3,2,103,104,106,107,105,10,11,12,13,14,15,16,17,18,19,20};
		ob.mergeSort(arr, 0, arr.length-1);
		ob.display(arr);
		System.out.println();
		System.out.print(ob.longestSeq(arr));
	}
}
