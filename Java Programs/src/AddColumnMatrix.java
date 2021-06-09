import java.util.*;
import java.lang.*;
class AddColumnMatrix 
{
   public static void main(String [] args)
 {
   int i,j,m,n;
   Scanner kb=new Scanner(System.in);
   System.out.println("Enter the row of matrix");
   m=kb.nextInt();
   System.out.println("Enter the column of matrix");
   n=kb.nextInt();
   int a[][]=new int[m][n];
   System.out.println("Enter the elements of the matrix");
  
   for(i=0;i<m;i++)
   {
	   for(j=0;j<n;j++)
	   {
		 a[i][j]=kb.nextInt();  
	   }
   }
   System.out.println("Entered matrix is");
   for(i=0;i<m;i++)
   {
	   for(j=0;j<n;j++)
	   {
		   System.out.printf("%d\t",a[i][j]);
	   }
   }
   int sum []=new int  [i];
   for(i=1;i<=3;i++)
   {
	   sum[i]=0;
	   for(j=1;j<=3;j++)
	   {
		   sum[i]=sum[i]+a[j][i];
		   System.out.println("Sum is: "+sum[i]);
	   }
   }
 } 
   
}
