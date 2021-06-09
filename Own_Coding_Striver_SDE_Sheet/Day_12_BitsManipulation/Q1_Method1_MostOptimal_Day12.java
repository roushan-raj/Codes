
public class Q1_Method1_MostOptimal_Day12 {
	
	public void checkNumber(int x) {
		int a = x & (x-1);
		if(a == 0)
			System.out.println("Number is power of 2");
		else 
			System.out.println("Number is NOT power of 2");
	}

	public static void main(String[] args) {
		Q1_Method1_MostOptimal_Day12 ob = new Q1_Method1_MostOptimal_Day12();
		ob.checkNumber(17);
	}
}
