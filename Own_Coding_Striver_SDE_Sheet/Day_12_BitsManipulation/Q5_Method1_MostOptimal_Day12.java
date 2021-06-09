
public class Q5_Method1_MostOptimal_Day12 {
	
	// Position of Set bit from the right side
	
	public int msb(int n) {
		if (n == 0)
			return 0;
		int mask = 1;
		int counter = 1;
		while(n>0) {
			if((n & mask) > 0)
				return counter;
			n = n>>1;
			counter++;
		}
		return counter;
	}

	public static void main(String[] args) {
		Q5_Method1_MostOptimal_Day12 ob = new Q5_Method1_MostOptimal_Day12();
		System.out.println(ob.msb(18));
	}
}
