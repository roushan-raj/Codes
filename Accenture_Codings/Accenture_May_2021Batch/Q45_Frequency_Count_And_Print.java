import java.util.Arrays;

public class Q45_Frequency_Count_And_Print {
	
	public static char freq(String str) {
		
		int [] freq = new int [256];
		Arrays.fill(freq, 0);
		
		for(int i=0; i<str.length(); i++) {
			freq[str.charAt(i)]++;
		}
		
		int max = Integer.MIN_VALUE;
		int index = 0;
		
		for(int i=0; i<freq.length; i++) {
			if(freq[i] > max) {
				max = freq[i];
				index = i;
			}
		}
		
		for(int j=0; j<freq.length; j++) {
			if(j != index) {
				if(freq[j] == max) {
					return (char)48;
				}
			}
		}

		return (char)(index);
		
	}

	public static void main(String[] args) {
		
		System.out.println(freq("abcdd"));
	}
}

