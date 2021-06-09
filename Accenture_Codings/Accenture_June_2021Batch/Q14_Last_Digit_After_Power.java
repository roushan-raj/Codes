
public class Q14_Last_Digit_After_Power {
	
//	public static int LastDigit(int input1, int input2) {
//		int val = (int)Math.pow(input2, input1);
//		System.out.println(val);
//		
//		int temp = 0;
//		return temp = val % 10;
//		
//	}
	
	static int ModCalculator(int a, char b[]) {
       
        int mod = 0;
 
        for (int i = 0; i < b.length; i++)
            mod = (mod * 10 + b[i] - '0') % a;
 
        return mod; 
    }
 
   
    public static int helper(char arr1[], char arr2[]) {
        int len1 = arr1.length, len2 = arr2.length;

        if (len1 == 1 && len2 == 1 && arr2[0] == '0' && arr1[0] == '0')
            return 1;
 
        if (len2 == 1 && arr2[0] == '0')
            return 1;
        
         if (len1 == 1 && arr1[0] == '0')
            return 0;
 
        int exp = (ModCalculator(4, arr2) == 0) ? 4 : ModCalculator(4, arr2);
 
        int answer = (int)(Math.pow(arr1[len1 - 1] - '0', exp));
 
        return answer % 10;
    }
    
    public static int findLastDigit(int exp, int base) {
    	String temp1 = Integer.toString(exp);
    	String temp2 = Integer.toString(base);
    	
    	char [] arr2 = temp1.toCharArray();
    	char [] arr1 = temp2.toCharArray();
    	
    	return helper(arr1, arr2);
    }
	

	public static void main(String[] args) {
		int exp = 3;
		int base = 2;
		
		System.out.println(findLastDigit(exp, base));
	}

}
