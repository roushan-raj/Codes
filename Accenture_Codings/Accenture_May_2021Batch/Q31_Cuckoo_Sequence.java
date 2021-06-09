
public class Q31_Cuckoo_Sequence {
	
	public static int cuckoo(int n) {
		
		if (n==1) {
			return 0;
		}
		if (n==2) {
			return 1;
		}
		
		return cuckoo(n-1) + cuckoo(n-2)*2 + 3;
	}

	public static void main(String[] args) {
		int n = 3;
		System.out.println(cuckoo(n));
	}
}
