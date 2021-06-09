
public class BubbleSortIterative {
	
	public void printArray(int arr[]) {
		int n = arr.length;
		for (int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public void sort(int arr[]) {
		boolean isSwapped;
		int n = arr.length;
		
		for (int i=0; i<n-1; i++) {
			isSwapped = false;
			
			for (int j=0; j<n-1-i; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					isSwapped = true;
				}
			}
			if(isSwapped == false) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		 
		int arr[] = new int [] {5,1,2,9,10};
		BubbleSortIterative ob = new BubbleSortIterative();
		ob.printArray(arr);
		ob.sort(arr);
		ob.printArray(arr);

	}

}
