
public class Q1b_CubeRoot_Method1_MostOptimal_Day11 {
	
	public int cubeRoot(int num) {
		if(num<8) {
			return 1;
		}
		int start = 1;
		int end = num;
		
		while(start<=end) {
			int mid = (start+end)/2;
			
			if(mid*mid*mid == num) {
				return mid;
			}
			else if(mid*mid*mid < num) {
				start = mid+1;
			}
			else {
				end = mid - 1;
			}
		}
		return end;
	}

	public static void main(String[] args) {
		Q1b_CubeRoot_Method1_MostOptimal_Day11 ob = new Q1b_CubeRoot_Method1_MostOptimal_Day11();
		System.out.println(ob.cubeRoot(26));
	}
}
