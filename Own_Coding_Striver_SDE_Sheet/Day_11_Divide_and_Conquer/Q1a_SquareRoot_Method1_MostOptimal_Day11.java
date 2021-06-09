
public class Q1a_SquareRoot_Method1_MostOptimal_Day11 {
	
	public int squareRoot(int num) {
		if(num<2) {
			return num;
		}
		int start = 1;
		int end = num;
		while(start <= end) {
			int mid = (end+start) / 2;
			
			if(mid*mid == num) {
				return mid;
			} else if(mid*mid < num) {
				start = mid+1;
			} else {
				end = mid-1;
			}
		}
		return end;
	}

	public static void main(String[] args) {
		Q1a_SquareRoot_Method1_MostOptimal_Day11 ob = new Q1a_SquareRoot_Method1_MostOptimal_Day11();
	    System.out.println(ob.squareRoot(26));
	}
}
