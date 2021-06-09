
public class Q4a_Method1_MostOptimal_Day15 {
	
	public int atoi(String str) {
		if(str == null) {
			return 0;
		}
		
		int n = str.length();
		int res = 0;
		
		for(int i=0; i<n; i++) {
			char c = str.charAt(i);
			int p = c - '0';
			if(p >=0 && p <= 9) {
				if(res == 0) {
					res = p;
				}
				else {
					res = (res*10) + p;
				}
			} 
			else {
				return -1;
			}	
		}
		return res;
	}

	public static void main(String[] args) {
		Q4a_Method1_MostOptimal_Day15 ob = new Q4a_Method1_MostOptimal_Day15();
		String str = "45667";
		System.out.println(ob.atoi(str));
	}
}
