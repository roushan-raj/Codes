
public class Q4_Method1_MostOptimal {
	
	public void anagrams(String s1, String s2) {
		int n1 = s1.length();
		int n2 = s2.length();
		
		boolean flag = false;
		
		if(n1 != n2) {
			System.out.println("Not Anagrams");
			return;
		}
		
		int [] counts = new int[256];
		
		for(int i=0; i<n1; i++) {
			char c = s1.charAt(i);
			counts[c]++;
		}
		
		for(int i=0; i<n2; i++) {
			char c = s2.charAt(i);
			counts[c]--;
		}
		
	    for(int i=0; i<256; i++) {
	    	if(counts[i] != 0) {
	    		flag = true;
	    		break;
	    	}
	    }
		
		if(flag == true) {
			System.out.println("Not Anagrams");
		}
		else {
			System.out.println("Anagrams");
		}
	}

	public static void main(String[] args) {
		Q4_Method1_MostOptimal ob = new Q4_Method1_MostOptimal();
		String str1 = "aabcdaac";
		String str2 = "baaacadcs";
		ob.anagrams(str1, str2);
		String str3 = "cat";
		String str4 = "act";
		ob.anagrams(str3, str4);
	}
}





