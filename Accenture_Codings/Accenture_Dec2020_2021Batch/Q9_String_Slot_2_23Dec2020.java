import java.util.Arrays;
public class Q9_String_Slot_2_23Dec2020 {
	
	public static int checkString(String str) {
		if(str.length() == 0){
			return 0;
		}
		int [] arr = new int[10];
		Arrays.fill(arr, 0);
		
		for(int i=0; i<str.length(); i++) {
			arr[str.charAt(i) - '0']++;
		}
		
		for(int i=0; i<str.length(); i++) {
			if(arr[i] != str.charAt(i) - '0')
				return 0;
		}
		
		int count = 0;
		for(int i=0; i<10; i++) {
			if(arr[i] > 0)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		String str = "1210";
		System.out.println(checkString(str));
	}
}
