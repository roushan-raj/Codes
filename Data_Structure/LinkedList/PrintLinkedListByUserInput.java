import java.util.LinkedList;
import java.util.Scanner;

public class PrintLinkedListByUserInput {

	public static void main(String[] args) {
		 
		// 1st Linked List L1
        LinkedList <Integer> list1=new LinkedList <Integer> ();
        
        Scanner kb = new Scanner(System.in);
        
        System.out.print("How many elemenst do you want to add in Linked List : ");
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
        kb.close();
        System.out.println();
	}

}
