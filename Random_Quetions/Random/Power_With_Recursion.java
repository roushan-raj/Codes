
public class Power_With_Recursion {
	
	public int power(int p, int q) {
		if(q==0)
			return 1;
		return p*power(p, q-1);
	}

	public static void main(String[] args) {
		Power_With_Recursion ob = new Power_With_Recursion();
		System.out.println(ob.power(3, 4));
	}
}
