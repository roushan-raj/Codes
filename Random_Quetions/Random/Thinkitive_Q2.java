import java.util.*;
public class Thinkitive_Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String s = sc.nextLine();
	    sc.close();
	    int res;
	    
	    if (s.length() == 0) {
	    	res = 0;
	    	System.out.println(res);
	    }
	  
	    else if (s.length() == 1) {
        	res = 1;
	    	System.out.println(res);
        }
	    
	    else {	
	        Map<Character, Integer> map = new HashMap<>(); 
	        int max = 0, counter = 0; 
	        for (int i=0; i < s.length(); i++, counter++) {
	            if (map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) > i-counter-1) { //if letter exists in current substring
	                max = Math.max(max, counter);
	                counter = i - map.get(s.charAt(i)) - 1;
	            }
	            map.put(s.charAt(i), i);
	        }
	        res = Math.max(max, counter);
	        System.out.println(res);
	    }
	}
}
