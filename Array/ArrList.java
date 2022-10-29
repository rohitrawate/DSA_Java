import java.util.ArrayList;
import java.util.Scanner;

public class ArrList {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Started...");
        ArrayList<Integer> list = new ArrayList<>(5);

        list.add(7);
        list.add(3);
        list.add(13);
        list.add(99);
        list.add(1);
        System.out.println(list);

        System.out.println("Does List Contains 13 ?");
        System.out.println(list.contains(13));
        System.out.println("Get element 3 of list");
       Integer ele = list.get(3);
    //    System.out.println(ele);
       System.out.println(" Ele index "+ele);
        list.set(4, 111);
        // list.remove(4);   // Provide Index of ele to be removed
        
        System.out.println("Enter num for the List");
        for (int i = 0; i < 5; i++) 
        {
            list.add(in.nextInt());
        }
        System.out.println(list);

          while(in.hasNextLine())
          {
            list.add(in.nextInt());
            System.out.println(list);
          }
        // if (in.nextLine() == null)
        //  System.exit(0);  
        // for(int element :list){
        //    System.out.println(element);
        // }
    }
}
