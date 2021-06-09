import java.util.*;
public class Thinkitive_Coding_Que {

	  public static int smallestMissingPositiveNumber(int[] arr) {
	    if(arr.length == 0) {
	      return 1;
	    }
	    int i = 0;
	    while(i < arr.length) {
	      if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[arr[i] - 1]) {
	        int otherIndex = arr[i] - 1;
	        
	        int x = arr[i];
	        arr[i] = arr[otherIndex];
	        arr[otherIndex] = x;
	      } else {
	        i++;
	      }
	    }
	    
	    for(i = 0; i < arr.length; i++) {
	      if(arr[i] != i + 1) {
	          return i + 1;
	      }
	    }
	    return arr.length + 1;
	  }
	  
	  public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter length of array");
		  int n = sc.nextInt();
		  int [] arr = new int[n];
		  System.out.println("Enter elements of arrays");
		  for(int i=0; i<n; i++) {
			  arr[i] = sc.nextInt();
		  }
		  sc.close();
	   // int[] arr = {-2, 11, 1, -3, 2, 10, 4};
	    System.out.println(Thinkitive_Coding_Que.smallestMissingPositiveNumber(arr));
	  }
}
