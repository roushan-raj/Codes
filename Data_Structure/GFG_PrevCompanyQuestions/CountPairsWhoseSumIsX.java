
///////////////////// LinkedList by taking User's input /////////////////////

import java.util.*;

class CountPairsWhoseSumIsX
{
	
	   public int countPairs(LinkedList <Integer> list1,LinkedList <Integer> list2, int sum) { 
	        int count = 0;
	        for (int i=0; i<list1.size(); i++) {
	        	for (int j=0; j<list2.size(); j++) {
	        		if (list1.get(i) + list2.get(j) == sum) {
	        			count++;		
       		 }
       	  }
       }
	        return count;
   } 
	   
    public static void main(String[] args) 
    {
        
    	// 1st Linked List L1
        LinkedList <Integer> list1=new LinkedList <Integer> ();
        
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the Sum value : ");
        int sum = kb.nextInt();
        
        System.out.print("How many elemenst do you want to add for L1: ");
        int s1 = kb.nextInt();
        
        for(int i=0; i<s1; i++){
            System.out.print("Add Element: ");
            //int element = kb.nextInt();
            list1.add(kb.nextInt());
        }
        
        System.out.println();
        System.out.println("LinkedList elements are: ");
        
        for(int i=0; i<list1.size(); i++){
         System.out.print(list1.get(i) + " --> ");
        }
        System.out.println();
        
        // 2nd Linked List L2
        LinkedList <Integer> list2=new LinkedList <Integer> ();
     
        System.out.print("How many elemenst do you want to add for L2: ");
        int s2 = kb.nextInt();
        
        for(int i=0; i<s2; i++){
            System.out.print("Add Element: ");
            //int element = kb.nextInt();
            list2.add(kb.nextInt());
        }
        
        System.out.println();
        System.out.println("LinkedList elements are: ");
        
        for(int i=0; i<list2.size(); i++){
         System.out.print(list2.get(i) + " --> ");
        }
        System.out.println();
        kb.close();
        
        CountPairsWhoseSumIsX n = new CountPairsWhoseSumIsX();
        int res = n.countPairs(list1, list2, sum);
        System.out.println("Result is "+ res);
     
   }
}