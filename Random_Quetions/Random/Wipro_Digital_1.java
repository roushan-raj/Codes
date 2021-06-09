
public class Wipro_Digital_1 {
	
	public boolean backAndForwardShift(String str) {
		int len = str.length();
		String first = str.substring(0, 1);
		
		String middle_one = str.substring(1, len);
		
		String last = str.substring(len-1, len);
		
		String middle_two = str.substring(0, len-1);
		
		String backward = middle_one.concat(first);
		
		String forward = last.concat(middle_two);	
		
		if(backward.equals(forward)) {
			return true;
		}
		return false;
		
//		for(int i=0; i<len; i++) {
//			if(backward.charAt(i) == forward.charAt(i)) {
//				return true;
//			}
//		}
//		return false;
	}

	public static void main(String[] args) {
		
		Wipro_Digital_1 ob = new Wipro_Digital_1();
		String str = "abcd";
		System.out.println(ob.backAndForwardShift(str));
	}
}
