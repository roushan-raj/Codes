
/////////////////////////// Time Complexity = O(n^2) ////////////////////////////
///// Sorting happens from the end, Largest Element will go at the End of Array ////

public class BubbleSort {

	void bubbleSort(int arr[]) {
		
	   int n = arr.length;
	   int i,j,temp;
	   
	   for (i=0; i<n-1; i++) 
		   for (j=0; j<n-i-1; j++) 
			   if(arr[j] > arr[j+1]) {
				   
				   temp = arr[j];      // Swapping of elements
			       arr[j] = arr[j+1];
			       arr[j+1] = temp;						   
			   }   
	 }
	   void printArray (int arr[]) {
		   int n = arr.length;
		   System.out.println("Sorted Array :");
		   for (int i=0; i<n; ++i) {
			   System.out.print(arr[i] + " ");	   
		   }
	   }
		
	
	public static void main(String[] args) {
		
		int arr[] = {3,4,10,8,9,22};
		BubbleSort ob = new BubbleSort();
		ob.bubbleSort(arr);
		ob.printArray(arr);
	}
}


///////////////// 2nd Optimised Method /////////////////

/////////// Time Complexity Best case = O(n) ///////////

/////////// Time Complexity Avg Case = O(n^2) //////////

////////// Time Complexity Worst Case = O(n^2) /////////

/* 
  public class BubbleSort {

	void bubbleSort(int arr[]) {
		
	   int n = arr.length;
	   int i,j,temp;
	   
	   for (i=0; i<n-1; i++) 
	   
	   flag = 0
	   
		   for (j=0; j<n-i-1; j++) 
			   if(arr[j] > arr[j+1]) {
				   temp = arr[j+1];      // Swapping of elements
			       arr[j+1] = arr[j];
			       arr[j] = temp;	
			       
			       flag = 1					   
			   }   
			   
			   if (flag == 0) 
			       break ;
	 }
	   void printArray (int arr[]) {
		   int n = arr.length;
		   System.out.println("Sorted Array :");
		   for (int i=0; i<n; ++i) {
			   System.out.print(arr[i] + " ");	   
		   }
	   }
		
	
	public static void main(String[] args) {
		
		int arr[] = {3,4,10,8,9,22};
		BubbleSortt ob = new BubbleSortt();
		ob.bubbleSort(arr);
		ob.printArray(arr);
	}
}      
  */
