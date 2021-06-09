
public class Q4a_Method1_MostOptimal_Day7 {
	
	public int removeDuplicate(int[]arr) {
		int n = arr.length;
		if(n == 0 || arr == null)
			return 0;
		
		int back = 0;
		for(int front =1; front<n; front++) {
			if(arr[back] != arr[front]) {
				back++;
				arr[back] = arr[front];
			}
		}
		return back+1;	
	}
	
	public void display(int[]arr) {
		int n = arr.length;
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public void displayAfter(int[]arr, int back) {
		for(int i=0; i<back; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		Q4a_Method1_MostOptimal_Day7 ob = new Q4a_Method1_MostOptimal_Day7();
		int[] arr = new int[] {0,0,1,1,1,1,2,2,3,4,4,5};
		ob.display(arr);
		int x = ob.removeDuplicate(arr);
		System.out.println("No.of unique elements are: "+x);
		ob.displayAfter(arr, x);
	}
}
