import java.util.*;
public class Q2_Check_Given_Strings_Weak_or_Strong {
	
	public static String reverse(String str) {
		
		char ch[] = str.toCharArray();
		String rev_str = "";
		
		for(int i=ch.length-1; i>= 0; i--) {
			rev_str = rev_str + ch[i];
		}
		return rev_str;
	}
	
	public static void checkString(String str) {
		
		boolean flag = true;
		for(int i=0; i<str.length(); i++) {
			if((str.charAt(i) < 65 || str.length() > 90) || 
					(str.charAt(i) < 97 || str.length() > 122)) {
				flag = false;
			}	
		}
		
		if(flag == true) {
			
			String rev_srt = reverse(str);
			
			if(str.equals(rev_srt)) {
				System.out.println("you inputted a strong string");
			}
			else {
				System.out.println("you inputted a weak string");
			}
		}
		else {
			System.out.println("you inputted a weak string");
		}
		
	}

	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
		checkString(str);
	}
}
