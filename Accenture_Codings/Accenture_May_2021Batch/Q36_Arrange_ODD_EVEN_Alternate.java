import java.util.*;
public class Q36_Arrange_ODD_EVEN_Alternate {
	
	static void arrange(int arr[], int n){
       
        Arrays.sort(arr) ;
         
        Vector v1 = new Vector(); 
        Vector v2 = new Vector(); 
     
        for (int i = 0; i < n; i++)
            if (arr[i] % 2 == 0)
                v1.add(arr[i]);
            else
                v2.add(arr[i]);
     
        int index = 0, i = 0, j = 0;
     
        boolean flag = false;
     
        if (arr[0] % 2 == 0)
            flag = true;
     
        while (index < n) {
     
  
            if (flag == true) {
                arr[index] = (int)v1.get(i);
                i += 1 ;
                index += 1 ;
                flag = !flag;
            }
     
            else{
                arr[index] = (int)v2.get(j) ;
                j += 1 ;
                index += 1 ;
                flag = !flag;
            }
        }
   
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

	public static void main(String[] args) {
		
		int n = 5;
		int arr [] = {47, 49, 36, 98, 90};
		
		arrange(arr, n);
	}
}
