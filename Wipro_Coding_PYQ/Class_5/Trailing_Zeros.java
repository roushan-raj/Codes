
public class Trailing_Zeros {
	
	public int trailing(int n) {
		
		int count=0;
		int a = n;
		while((a&1) == 0) {
			count++;
			a = a >> 1;
		}
		return count;
	}

	public static void main(String[] args) {
		Trailing_Zeros ob = new Trailing_Zeros();
		System.out.println(ob.trailing(17));
		System.out.println(ob.trailing(88));
		System.out.println(ob.trailing(20));
	}
}
