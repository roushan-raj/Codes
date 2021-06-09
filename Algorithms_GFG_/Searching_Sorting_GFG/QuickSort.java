
//////// Time Complexity = O(nlogn) - In Avg & Best /////////

///////// Time Complexity = O(n^2) - In Worst Case //////////

import java.util.*;
public class QuickSort {
	
	int partition (int arr[],int low, int high)
	{
		int pivot = arr[high];
		int i = low-1;
		for (int j=low; j<high; j++)
		{
			if(arr[j]<pivot)
			{   
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		return i+1;
	}
	
	void sort (int arr[], int low, int high)
	{
		if (low<high)
		{
			int pi = partition(arr, low, high);
			sort(arr,low,pi-1);
			sort(arr,pi+1,high);
		}
	}
	
	static void printArray(int arr[], int n)
	{
		System.out.println("Sorted Array :");
		for (int i=0; i<n; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		
		int arr[] = {8,4,9,2,22,11,56};
		int n = arr.length;
		
//		Scanner kb = new Scanner(System.in);
//		System.out.println("Enter the number of Elements you want to Sort :");
//		int n = kb.nextInt();
//		int arr[] = new int[n];
//		System.out.println("Enter Elements in Array :");
//		for (int i=0; i<n; i++)
//		  {
//			arr[i] = kb.nextInt();
//		  }
		
		QuickSort ob = new QuickSort();
		ob.sort(arr,0,n-1);
		printArray(arr,n);
	}

}
