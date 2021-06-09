
public class Sum_leaders {
	
	    static int printLeaders(int arr[]) {
	    	int sum = 0;
	    	int size = arr.length;
	    	
	    	int max =  arr[size-1];
	    	
	    	 sum = sum + max;
	    	 
	    	 for (int i = size-2; i >= 0; i--) {

	            if (max <= arr[i]) {           

	              max = arr[i];

	              sum = sum + max;

	            }
		    }    
	    	return sum;
	  }


	public static void main(String[] args) {
		int [] arr = {52,66,64,36,45,24,32};
		System.out.println(printLeaders(arr));
	}
}
