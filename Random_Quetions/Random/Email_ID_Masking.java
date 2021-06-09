
public class Email_ID_Masking {
	public static void stringManipulation(String str) {
		int len = str.length();
		String firstHalf = " ";
		String secondHalf = " ";
		
		for(int i=0; i<len; i++) {
			if(str.charAt(i) == '@') {
				 firstHalf = str.substring(0, i);
				 secondHalf = str.substring(i, len);
			}
		}
		
		String [] arr = firstHalf.split("[.]");
		
		String first = arr[0];
		String firstMask = first.substring(1, first.length()-1);
	
		String second = arr[1];
		String secondMask = second.substring(1, second.length()-1);
		
		for(int j=0; j<firstMask.length(); j++) {
			firstMask = firstMask.replace(firstMask.charAt(j), '*');
		}
		
		for(int k=0; k<secondMask.length(); k++) {
			secondMask = secondMask.replace(secondMask.charAt(k), '*');	
		}
		
		System.out.println(first.charAt(0) + firstMask + first.charAt(first.length()-1)
				           +'.'+second.charAt(0) + secondMask + second.charAt(second.length()-1) 
				           + secondHalf);
	}

	public static void main(String[] args) {
		
		String str1 = "abraham.lincoln@gmail.com";
		String str2 = "roushan.nsit@gmail.com";
		String str3 = "shivangi.srivastava@gmail.com";
		System.out.println(str1);
		stringManipulation(str1);
		System.out.println(str2);
		stringManipulation(str2);
		System.out.println(str3);
		stringManipulation(str3);
	}
}
