import java.util.*;

public class TCS_NQT_MAY_Q2 {
	
    public static void checkStrings(String str1, String str2) {
		
		int [] arr1 = new int [256];
		
		for(int i=0; i<str1.length(); i++) {
			arr1[str1.charAt(i)]++;
		}
		for(int i=0; i<str2.length(); i++) {
			arr1[str2.charAt(i)]--;
		}
		
		boolean flag = true;
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i] != 0) {
				flag = false;
			}
		}
		if(flag == true) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		checkStrings(str1, str2);
	}
}
