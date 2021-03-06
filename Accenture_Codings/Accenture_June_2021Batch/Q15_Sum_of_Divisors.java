import java.util.*;
public class Q15_Sum_of_Divisors {
	
	static ArrayList<Integer> list = new ArrayList<>();
	
	public static int findSum(int n) {
		for(int i=1; i<= Math.sqrt(n); i++) {
			if(n % i == 0) {
				if(n / i == i) {
					list.add(i);
				}
				else {
					list.add(i);
					list.add(n/i);
				}
			}
		}
		
		int sum = 0;
		for(int i=0; i<list.size(); i++) {
			sum = sum + list.get(i);
		}
		
		return sum;
	}

	public static void main(String[] args) {
		int n = 36;
		System.out.println(findSum(n));
	}
}
