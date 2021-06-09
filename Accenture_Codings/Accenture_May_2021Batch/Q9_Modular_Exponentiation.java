
public class Q9_Modular_Exponentiation {
	
	public static int modular(int b, int e, int m) {
		int ans = aModM(b, m);
		int mul = ans;
		
		for(int i=1; i<e; i++) {
			ans = (ans * mul) % m;
		}
		return ans;
	}
	
	public static int aModM(int b, int m) {
		int num = 0;
		String str = Integer.toString(b);
		
		for(int i=0; i<str.length(); i++) {
			num = (num * 10);
			int x = (str.charAt(i) - '0');
			num = num + x;
			num = num % m;
		}
		return num;
	}

	public static void main(String[] args) {
		
		System.out.println(modular(2, 10, 1025));
	}
}
