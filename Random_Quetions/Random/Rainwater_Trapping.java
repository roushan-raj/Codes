public class Rainwater_Trapping {
	
	public int rainwaterTrapped(int[]arr) {
		int n = arr.length;
		int water = 0;
		
		int left = 0;
		int right = n-1;
		
		int leftMax = 0;
		int rightMax = 0;
		
		while(left < right) {
			if(arr[left] < arr[right]) {
				leftMax = Math.max(leftMax, arr[left]);
				water += leftMax - arr[left];
				left ++;
			}else{
				rightMax = Math.max(rightMax, arr[right]);
				water += rightMax - arr[right];
				right --;
			}
		}
		return water;
	}

	public static void main(String[] args) {		
		Rainwater_Trapping ob = new Rainwater_Trapping();
		int [] arr = new int[] {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println("Total unit of water stored is: "+ob.rainwaterTrapped(arr));
	}
}
