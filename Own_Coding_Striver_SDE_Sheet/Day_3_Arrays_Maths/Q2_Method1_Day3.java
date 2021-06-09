
public class Q2_Method1_Day3 {
	
	public int pow(int x, int n) {
		int ans = 1;
		for(int i=1; i<=n; i++) {
			ans = ans*x ;
		}
		return ans;
	}

	public static void main(String[] args) {
		 
		Q2_Method1_Day3 ob = new Q2_Method1_Day3();
		System.out.println(ob.pow(4, 4));

	}

}
