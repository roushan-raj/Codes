
public class Q2_Method2 {
	
	public void arrange0_1_2(int [] arr) {
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		
		for(int i=0; i<arr.length; i++) {
			if (arr[i] == 0) {
				count0++;
			}
			else if (arr[i] == 1) {
				count1++;
			}
			else if (arr[i] == 2)
				count2++;
		}
		
		for (int i=0; i<count0; i++) {
			arr[i] = 0;
		}
		for (int i=count0; i<count1+count0; i++) {
			arr[i] = 1;
		}
		for (int i=count1+count0; i<arr.length; i++) {
			arr[i] = 2;
		}
		
	}
		
		public void display(int[]arr) {
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		}
	

	public static void main(String[] args) {
		 
		Q2_Method2 ob = new Q2_Method2();
		int [] arr = new int [] {0,1,1,0,1,2,1,2,0,0,0,1};
		ob.arrange0_1_2(arr);
		ob.display(arr);

	}

}
