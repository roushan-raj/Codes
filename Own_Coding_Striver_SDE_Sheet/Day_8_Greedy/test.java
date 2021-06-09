
public class test {
	
	public int minCoin(int[]arr, int value) {
		int amount = value;
		int count = 0;
		int n = arr.length-1;
		
		for(int k=n; k>=0; k--) {
			if(arr[k] <= amount) {
				count = count + amount/arr[k];
				amount = amount % arr[k];
				n = k;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		test ob = new test();
		int [] arr = new int [] {1,2,5,10,20,50,100,200,500,2000};
		System.out.println(ob.minCoin(arr, 65));
	}
}
