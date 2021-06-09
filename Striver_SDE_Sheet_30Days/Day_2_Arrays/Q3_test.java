import java.util.ArrayList;

public class Q3_test {				//1 3 5 4 2 

	public void nextPermut(int[] arr) {
		if(arr == null || arr.length <=1) return;
		int first, second;
		int len = arr.length; 
		for(int i = len -2 ; i>=0 ; i--) {
			boolean found = false;
			if(arr[i] < arr[i+1]) {
				first = arr[i];
				for(int j = len -1 ; j>=0; j-- ) {
					
					if(arr[j] > first) { 
						second = arr[j];
					
						System.out.println(" \n First = "+ first);
						System.out.println(second);
						System.out.println(arr[j]);
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
						found = true;
						display(arr);
					}
					//reverse(arr, i+1, len-1);
					if(found) break;
				}
				reverse(arr, i+1, len-1);
				if(found) break;
			}
			
			/*else {
				reverse(arr, 0, len-1);
			}*/
		}
	}
	public void reverse(int[] Arr, int start, int end) {
		while(start < end) {
			int temp = Arr[start];
			Arr[start] = Arr[end];
			Arr[end] = temp;
			start++;
			end--;
		}
	}
	public void display(int[] arr) {
		for (int i =0 ; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		Q3_test ob = new Q3_test();
		int[] a = {1,3,5,4,2}; 
		ob.display(a);
		ob.nextPermut(a);
		System.out.print(" \nNext Permutation = ");
		ob.display(a);
	}

}
