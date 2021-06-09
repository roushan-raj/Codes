
public class Q4b_Method1_MostOptimal_Day7 {
	
	public int removeDuplicate(int[]arr) {
		int n = arr.length;
		if (n<3)
			return n;
		
		int back = 2;
		
		for(int front =2; front<n; front++) {
			if(arr[back-2] != arr[front]) {
				arr[back] = arr[front];
				back++;
			}
		}
		return back;
	}
	
	public void display(int[]arr) {
		int n = arr.length;
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	
	public void displayAfter(int[]arr, int back) {
		for(int i=0; i<back; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		Q4b_Method1_MostOptimal_Day7 ob = new Q4b_Method1_MostOptimal_Day7();
		int[] arr = new int[] {0,0,1,1,1,1,2,3,4,4,4,5,5,5};
		ob.display(arr);
		int x = ob.removeDuplicate(arr);
		System.out.println("No.of unique elements are: "+x);
		ob.displayAfter(arr, x);
	}
}
