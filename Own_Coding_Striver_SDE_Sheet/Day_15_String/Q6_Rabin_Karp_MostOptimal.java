
public class Q6_Rabin_Karp_MostOptimal {
	
	int prime = 119;
	
	public long createHash(String str, int n) {
		long result = 0;
		for(int i=0; i<n; i++) {
			result = result + (long) (str.charAt(i)*(long)(Math.pow(prime, i)));
		}
		return result;
	}
	
	public long reCalculateHash(String str, int oldIndex, int newIndex, long oldHash, 
			                                                              int patLength) {
		long newHash = oldHash - str.charAt(oldIndex);
		newHash = newHash / prime;
		newHash = newHash + (long) (str.charAt(newIndex) * (long)(Math.pow(prime, patLength-1)));
		
		return newHash;
	}
	
	public boolean checkLettersEqual(String txt, String pat, int start1, int end1, 
			                                                              int start2, int end2) {
		if((end1 - start1) != (end2 - start2)) {
			return false;
		}
		while(start1 <= end1 && start2 <= end2) {
			if(txt.charAt(start1) != pat.charAt(start2)) {
				return false;
			}
			start1++;
			start2++;
		}
		return true;
	}
	
	public int starterFun(String txt, String pat) {
		long txtHash = createHash(txt, pat.length());
		long patHash = createHash(pat, pat.length());
		
		for(int i=0; i <= txt.length() - pat.length(); i++) {
			if(txtHash == patHash && checkLettersEqual(txt, pat, i, i+pat.length()-1, 
					                                                       0, pat.length()-1)) {
				return i;
			}

			if(i < txt.length() - pat.length()) {
				txtHash = reCalculateHash(txt, i, i+pat.length(), txtHash, pat.length());
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Q6_Rabin_Karp_MostOptimal ob = new Q6_Rabin_Karp_MostOptimal();
		String txt = "abacbabac";
		String pat = "baba";
		System.out.println("Pattern Matches form index: "+ob.starterFun(txt, pat));	
	}
}
