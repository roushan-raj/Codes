
public class Q4b_Method1_MostOptimal_Day15 {
	
	public int strstr(String txt, String pat) {
		int m = txt.length();
		int n = pat.length();
		
		for(int i=0; i<= m-n; i++) {
			int j;
			for(j=0; j<n; j++) {
				if(txt.charAt(i+j) != pat.charAt(j)) {
					break;
				}
			}
			if(j == n)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		Q4b_Method1_MostOptimal_Day15 ob = new Q4b_Method1_MostOptimal_Day15();
		String str1 = "hello";
		String str2 = "ll";
		System.out.println(ob.strstr(str1, str2));
	}
}
