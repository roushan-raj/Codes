
public class Q2_Method3_MostOptimal {
	
	public void dutchNationalFlag(int[]arr) {
		int low=0; int mid = 0; int high = arr.length-1;
		
		while(mid <= high) {
			switch (arr[mid]) {
			
			case 0: {
				int temp = arr[mid];
				arr[mid] = arr[low];
				arr[low] = temp;
				mid++;
				low++;
				break;
			  }
			
			case 1: {
				mid ++;
				break;
			  }
			
			case 2: {
				int temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high--;
				break;
		      }
			}
		}
	}
	
	public void display(int[]arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		 
		Q2_Method3_MostOptimal ob = new Q2_Method3_MostOptimal();
		int [] arr = new int [] {0,1,1,0,1,2,1,2,0,0,0,1};
		ob.dutchNationalFlag(arr);
		ob.display(arr);

	}

}
