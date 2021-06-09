
import java.util.*;
public class Q3a_Method1_MostOptimal_Day15 {
	
	// Convert Roman to Integer
	public int romanToInteger(String s) {
		if(s == null)
			return 0;
		
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int result = 0;
		
		for(int i=0; i<s.length(); i++) {
			if(i>0 && map.get(s.charAt(i)) > map.get(s.charAt(i-1))) {
				result = result + map.get(s.charAt(i)) - 2*map.get(s.charAt(i-1)); 
			}
			else {
				result = result + map.get(s.charAt(i));
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Q3a_Method1_MostOptimal_Day15 ob = new Q3a_Method1_MostOptimal_Day15();
		//String str = "CCXLVIII";
		String str = "MMMCMXCIX";
		System.out.print("Integeral value of " + str + " is: "+ob.romanToInteger(str));
	}
}
