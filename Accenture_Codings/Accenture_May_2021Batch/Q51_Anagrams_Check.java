
public class Q51_Anagrams_Check {
	
	static int NO_OF_CHARS = 256;
	
	static String areAnagram(String str1, String str2){
	       
	    int[] count = new int[NO_OF_CHARS];
	    int i;
	 
	   
	    for(i = 0; i < str1.length(); i++) {
	        count[str1.charAt(i) - 'a']++;
	        count[str2.charAt(i) - 'a']--;
	    }
	 
	    if (str1.length() != str2.length())
	        return "no";
	 
	    for(i = 0; i < NO_OF_CHARS; i++)
	        if (count[i] != 0){
	        	 return "no";
	        }
	     return "yes";
	}

	public static void main(String[] args) {
		String str1 = "build";
		String str2 = "duboi";
		
		System.out.println(areAnagram(str1, str2));
	}
}
