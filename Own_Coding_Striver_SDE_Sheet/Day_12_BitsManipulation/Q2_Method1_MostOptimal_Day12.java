
public class Q2_Method1_MostOptimal_Day12 {
	
	public int countSetBits(int x) {
		if (x == 0)
			return 0;
		int count = 0;
		while(x > 0) {
			x = x & (x-1);
			count ++;
		}
		return count;
	}

	public static void main(String[] args) {
		Q2_Method1_MostOptimal_Day12 ob = new Q2_Method1_MostOptimal_Day12();
		System.out.println(ob.countSetBits(32));
	}
}
