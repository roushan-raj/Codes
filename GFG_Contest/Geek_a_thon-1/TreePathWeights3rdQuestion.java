import java.io.*;
import java.util.*; 

public class TreePathWeights3rdQuestion {
	
		long s[];
	    ArrayList<Integer> maximumWeight(int n, int e[][], int q, int qq[])
	    {
	    	s=new long[100001];
	        LinkedList<int []> al[]=new LinkedList[n+1];
	        for(int x=0;x<=n;x++)al[x]=new LinkedList<>();
	        LinkedList<int []> ee[]=new LinkedList[100001];
	        for(int x=0;x<=100000;x++)ee[x]=new LinkedList<>();
	        for(int a[]:e)
	        {
	        	int aa[]=new int[2];
	        	aa[0]=a[0];
	        	aa[1]=a[1];
	        	ee[a[2]].add(aa);
	        	int ar[]=new int[2];
	        	ar[0]=a[1];
	        	ar[1]=a[2];
	        	al[a[0]].add(ar);
	        	ar=new int[2];
	        	ar[0]=a[0];
	        	ar[1]=a[2];
	        	al[a[1]].add(ar);
	        }
	        int d[]=new int[n+1];
	        for(int x=0;x<=n;x++)d[x]=-1;
	        for(int x=0;x<=100000;x++)
	        {
	        	for(int el[]:ee[x])
	        	{
	        		int p1=el[0];
	        		p1=pa(p1,d);
	        		int p2=el[1];
	        		p2=pa(p2,d);
	        		if(d[p1]<=d[p2])s[x]+=u(p1,p2,d);
	        		else s[x]+=u(p2,p1,d);
	        	}	
	        }
	        for(int x=1;x<=100000;x++)s[x]+=s[x-1];
	        ArrayList<Integer> ll=new ArrayList<>(q);
	        for(int aa:qq)ll.add(aa>100000?(int)s[100000]:(int)s[aa]);
	        return ll;
	    }
	    int pa(int i,int d[])
	    {
	    	if(d[i]<0)return i;
	    	return d[i]=pa(d[i],d);
	    }
	    long u(int a,int b,int d[])
	    {
	    	int aa=0;
	    	aa+=Math.abs(d[a]);
	    	aa+=Math.abs(d[b]);
	    	int a1=Math.abs(d[a]);
	    	int a2=Math.abs(d[b]);
	    	d[a]=-aa;
	    	d[b]=a;
	    	return 1l*a1*a2;
	    }

	public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(read.readLine());

            int edges[][] = new int[n-1][3];
            for(int i = 0; i < (n-1); i++){
                String input_line[] = read.readLine().trim().split("\\s+");
                for(int j = 0; j < 3; j++){
                    edges[i][j] = Integer.parseInt(input_line[j]);
                }
            } 
            
            int q = Integer.parseInt(read.readLine());

            String input_line[] = read.readLine().trim().split("\\s+");
            int queries[]= new int[q];
            for(int i = 0; i < q; i++)
                queries[i] = Integer.parseInt(input_line[i]);

            TreePathWeights3rdQuestion ob = new TreePathWeights3rdQuestion();
            ArrayList<Integer> ans = ob.maximumWeight(n, edges, q, queries); 
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }

}
