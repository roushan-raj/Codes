
public class Palindrome_Partitioning_DP {
	
static int palindromicPartition(String str) {
        
        int [][] mem = new int [501][501];
        for(int i=0; i<mem.length; i++){
            for(int j=0; j<mem[0].length; j++){
                mem[i][j] = -1;
            }
        }
        int i = 0;
        int j = str.length()-1;
        
        int ans = helper(str, i, j, mem);
        
        return ans;
    }
    
    static int helper(String s, int i, int j, int [][] mem){
        int min_cut = Integer.MAX_VALUE;
        
        if(i == j){
            return 0;
        }
        
        if(isPalindrome(s, i ,j)){
            return 0;
        }
        
        if(mem[i][j] != -1){
            return mem[i][j];
        }
        int left;
        int right;
        for(int k=i; k<=j-1; k++){
            
            if(mem[i][k] != -1){
               left = mem[i][k];
            }
            else{
                left = helper(s, i, k, mem);
                mem[i][k] = left;
            }
            if(mem[k+1][j] != -1){
               right = mem[k+1][j];
            }
            else{
                right = helper(s, k+1, j, mem);
                mem[k+1][j] = right;
            }
            min_cut = Math.min(min_cut, (1+left+right));
        }
       return min_cut;
    }
    
    static boolean isPalindrome(String s, int i, int j){
        if(i==j){
            return true;
        }
        if(i>j){
            return true;
        }
        while(i<j) {
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

	public static void main(String[] args) {
		String str = "nitik";
		System.out.println(palindromicPartition(str));
	}

}
