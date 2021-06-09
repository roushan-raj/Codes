import java.util.Arrays;

public class Q24_String_Permutations {
	
	public static boolean checkStrings(String str1, String str2) {
		
		int [] arr1 = new int [256];
		int [] arr2 = new int [256];
		
		for(int i=0; i<str1.length(); i++) {
			arr1[str1.charAt(i)]++;
		}
		for(int i=0; i<str2.length(); i++) {
			arr2[str2.charAt(i)]++;
		}
		
		if(Arrays.equals(arr1, arr2)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
		String str1 = "zbk";
		String str2 = "zkb";
		
		if(checkStrings(str1, str2)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}
}
