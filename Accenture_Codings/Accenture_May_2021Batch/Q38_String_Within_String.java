import java.util.*;
public class Q38_String_Within_String {
	
	static void longestCommonSubstring(String x, String y, int n, int m){
	    
	   if(x.contains(y)) {
		   System.out.println("yes");
	   }
	   else {
		   System.out.println("no");
	   }
	}

	public static void main(String[] args) {
		String str1 = "abac";
		String str2 = "ac";
		
		longestCommonSubstring(str1, str2, str1.length(), str2.length());
			
	
	}
}
