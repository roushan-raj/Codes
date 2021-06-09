import java.io.*;
import java.util.*;

public class BoatBuilder_TreeWala2ndQue {
	
	 public int gcd(int x, int y)
	    {
	        if(x==0)
	            return y;
	        if(y==0)
	            return x;
	        if(x%y==0)
	            return y;
	        return gcd(y, x%y);
	    }
	    boolean flag;
	    public int gcdCalc(ArrayList<ArrayList<Integer>> adl, int x, ArrayList<Integer> val, int y)
	    {
	        int gcd=val.get(x);
	        for(int iter:adl.get(x))
	        {
	            if(iter==y)
	                flag=true;
	            int res=gcdCalc(adl, iter, val,y);
	            gcd=gcd(res,gcd);
	        }
	        return gcd;
	    }
	    
		public int gcdTree(int n, ArrayList<ArrayList<Integer> > edges, ArrayList<Integer> val , int x, int y)
		{
			// code here
			ArrayList<ArrayList<Integer>> adl=new ArrayList<>();
			int i;
			for(i=0; i<n; i++)
			    adl.add(new ArrayList<>());
			for(ArrayList<Integer> iter:edges)
			{
			    int u=iter.get(0);
			    int v=iter.get(1);
			    adl.get(u).add(v);
			}
			
			int gcd1,gcd2;
			flag=false;
			gcd1=gcdCalc(adl,x,val,y);
			gcd2=gcdCalc(adl,y,val,x);
			if(flag)
			    return -1;
			else
			    return gcd(gcd1, gcd2);
		}

	public static void main(String[] args) {
		 
		{
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    
                    ArrayList<ArrayList<Integer> > edges = new ArrayList<ArrayList<Integer> >();

                    for(int i = 1; i < n; i++)
                    {
                    	
                    	ArrayList<Integer> temp = new ArrayList<Integer>();
                    	int temp1 = sc.nextInt();
                    	int temp2 = sc.nextInt();
                        temp.add(temp1);
                        temp.add(temp2);
                    	edges.add(temp);
                    }


                    ArrayList<Integer> val = new ArrayList<Integer>();
                    for(int i = 0; i < n; i++)
                        {
                            int values = sc.nextInt();
                            val.add(values);
                        }
        	

                    int x  = sc.nextInt();
                    int y = sc.nextInt();
                    
                    sc.close();
                

                    BoatBuilder_TreeWala2ndQue ob = new BoatBuilder_TreeWala2ndQue();
                    System.out.println(ob.gcdTree(n, edges, val, x, y));

                }
            
          }

	 }

}
