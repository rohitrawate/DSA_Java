import java.util.Arrays;
import java.util.List;

public class ForEach {
    
    public static void main(String[] args) {
        
        System.out.println("[ 3 Types of Loops ] 2 Major loop - External and Inrternal Loops" +
        "External Loops : for  loop and enhanced for loop are external as they both are Not part of Collection Framework " +
        "Internal Loop :  It is the part of Collection Frame..  \t Introduced in JAVA 1.8" );
    // }

      List<Integer> list =  Arrays.asList(2,4,35,6,8,11);

    //   for(int i=0; i<list.size(); i++ ){
    //     System.out.print(list.get(i) + " ");
    //   } 

        // for (Integer num : list) {
        //     System.out.print( num + " " );
        // }

        list.forEach( (num) -> System.out.println(num));
    }
}
