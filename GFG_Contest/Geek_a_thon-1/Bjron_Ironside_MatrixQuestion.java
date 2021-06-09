import java.io.*;
import java.util.*;

public class Bjron_Ironside_MatrixQuestion {
	
		int mod=1000000007;
	    public int count(char mat[][], int i, int n, int marked, int dp[][])
	    {
	        if(i==n)
	            return 1;
	        if(dp[i][marked]!=-1)
	            return dp[i][marked];
	        int j;
	        int res=0;
	        for(j=0; j<n; j++)
	        {
	            if(mat[i][j]=='#' && (((1<<j)&marked)==0))
	            {
	                marked|=1<<j;
	                res=(res+count(mat, i+1, n, marked,dp))%mod;
	                marked^=1<<j;
	            }
	        }
	        dp[i][marked]=res;
	        return res;
	    }
		public int numberOfWays(int n, char mat[][])
		{
			// Your code goes here
			int dp[][]=new int[n][1<<17];
			for(int x[]:dp)
			    Arrays.fill(x,-1);
			int count=count(mat, 0, n, 0,dp);
			return count;
		}


	public static void main(String[] args) {
		 
		{
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    
                    char mat[][] = new char[n][n];
                    
                    for(int i = 0;i<n;i++){
                    	
                        mat[i] = sc.next().trim().toCharArray();
                    	
                    }
                    sc.close();

                    Bjron_Ironside_MatrixQuestion ob = new Bjron_Ironside_MatrixQuestion();
                    System.out.println(ob.numberOfWays(n,mat));

                }
        }

	}

}
