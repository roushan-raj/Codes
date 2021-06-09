
public class Cloud_Jump_Game {
	
	public int path(int [] arr) {
		int n = arr.length;
		if (n == 1)
			return 0;
		
		int count = 0;
		int x = 0;
		while(x != n-1) {
			if(x<n-2 && arr[x+2]==0) {
				x = x+2;
				count++;
			}
//			else if(arr[x+1] == 1) {
//				x = x+2;
//				count++;
//			}
			else {
				x = x+1;
				count++;
			}
		}
		
//		for(int i=0; i<n-1; i++) {
//			if(arr[i] == 0) {
//				i++;
//			} 
//			count++;
//		}
		return count;
	}

	public static void main(String[] args) {
		Cloud_Jump_Game ob = new Cloud_Jump_Game();
		//int [] arr = new int[] {0,0,1,0,0,1,0};
		//int [] arr = new int[] {0,0,0,1,0,1,0,1,0,0};
		//int [] arr = new int[] {0,0,0,0,0,0,1,0};
		int [] arr = new int[] {0,0,0,0,1,0};
		System.out.println(ob.path(arr));
	}
}
