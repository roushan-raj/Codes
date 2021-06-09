
public class Q7_Characters_Numbers_Seperators {
	
	public static void stringSeperator(String str) {
		if(str.length() == 0) {
			return;
		}
		
		String alpha = "";
		String num = "";
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) >= 48 && str.charAt(i) <= 57) {
				num = num + str.charAt(i);
			}
			else {
				alpha = alpha + str.charAt(i);
			}
		}
		System.out.println(alpha);
		System.out.println(num);
	}

	public static void main(String[] args) {
		String str = "wedft976bgf38";
		stringSeperator(str);
	}
}
