
public class Q5_Method1_MostOptimal_Day15 {
	
	public String longestPrefix(String [] str) {
		if(str.length == 0) return "";
		
		String prefix = str[0];
		for(int i=1; i<str.length; i++) {
			while(str[i].indexOf(prefix) !=0) {
				prefix = prefix.substring(0, prefix.length()-1);
			}
		}
		return prefix;
	}

	public static void main(String[] args) {
		Q5_Method1_MostOptimal_Day15 ob = new Q5_Method1_MostOptimal_Day15();
		String str[] = {"flower", "flow", "flowers"};
		System.out.println(ob.longestPrefix(str));
	}
}
