
public class Q2_Method2_MostOptimal_Day3 {
	
	public double pow(int x, int n) {
		double ans = 1.0;
		int nn = n;
		if(nn < 0)
			nn = -1*nn;
		
		while(nn>0) {
			if(nn%2 == 0) {
				x = x*x;
				nn = nn/2;
			}
			if(nn%2 == 1) {
				ans = ans*x;
				nn=nn-1;
			}
		}
		if (n < 0)
			ans = (double) (1.0) / (double) (ans);
		return ans;
	}

	public static void main(String[] args) {
		 
		Q2_Method2_MostOptimal_Day3 ob = new Q2_Method2_MostOptimal_Day3();
		System.out.print(ob.pow(4, 4));

	}

}
