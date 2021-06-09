
public class Q1c_Main_Question_Method1_MostOptimal_Day11 {
	
	public int nthTimesRoot(int num, int n) {
		int start = 1;
		int end = num;
		
		while(start<=end) {
			int mid = (start+end)/2;
			int m = mid;
			int res = 1;
			int temp = n;
			
			while(temp>0) {
				if((temp&1) == 0) {
					m = m*m;
					temp = temp>>1;
				} else {
					res = res*m;
					temp= temp-1;
				}
			}
			if(res == num) {
				return mid;
			} else if(res < num) {
				start = mid+1;
			} else {
				end = mid-1;
			}
		}
		return end;
	}

	public static void main(String[] args) {
		Q1c_Main_Question_Method1_MostOptimal_Day11 ob = new Q1c_Main_Question_Method1_MostOptimal_Day11();
		System.out.println(ob.nthTimesRoot(256, 4));
	}
}
