
import java.util.*;

class Q35_Nth_Char_In_DecryptedString{

	static char encodedChar(char[] str, int k){
		int i, j;
	
		int n = str.length;
	
		int len;
	
		int num;
	
		int freq;
	
		i = 0;
	
		while (i < n){
			j = i;
			len = 0;
			freq = 0;
	
			while (j < n && Character.isAlphabetic(str[j])){
				j++;
				len++;
			}
	
			while (j < n && Character.isDigit(str[j])){
			 	freq = freq * 10 + (str[j] - '0');
				j++;
			}
	
			num = freq * len;
	
			if (k > num){
				k -= num;
				i = j;
			}
	
			else{
				k--;
				k %= len;
				return str[i + k];
			}
		}
		
		return str[k - 1];
	}


	public static void main(String[] args){
		String str = "ab4c2ed3";
		int k = 9;
	
		System.out.println(encodedChar(str.toCharArray(), k));
	}
}

