import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class Josephus_Problem {

    public static void main(String[] args) throws IOException {
        System.out.println(" Josephus Problem : ");

        BufferedReader bfr = new BufferedReader( new InputStreamReader(System.in) );
        System.out.println(" Buffreader Input : Size");
        int size = Integer.parseInt( bfr.readLine() ) ;
        System.out.println(" Buffreader Input : Kill Position ");
        
        int kill = Integer.parseInt( bfr.readLine() ) ;
        kill--;       // +++++++++++++++__________********&&&&&&&&&&&&^^^@@@@@@@@@!!!!!!!!!!!!!!
        System.out.println(" Buffreader Input : Starting Pointing ");
        int start = Integer.parseInt( bfr.readLine() ) ;

        List<Integer> list = new ArrayList<>(size);

        System.out.println("Add Person as a Element...");
        for( int i=0; i< size; i++ )
        {
            int ele =  Integer.parseInt(bfr.readLine());
            list.add(ele);
        }
        System.out.println( "Ele are : ");
        list.forEach( i -> System.out.println(i));


        Josephus_Problem obj = new Josephus_Problem();
        
        int ans = obj.JoshLastFreedom( list, 0,  kill);
        System.out.println("Answer/Result :  "+ ans);

    }   
    
    public int JoshLastFreedom( List<Integer> list , int start,  int k){  // Argument k is the position to kill first person
        System.out.print("called \n[ " );
        list.forEach( ele -> System.out.print(ele + ", " ));
        System.out.println( "]");
        // for (Integer ele : list) {
        //     System.out.println("Ele : " + ele); 
        // }

        int x = Integer.MIN_VALUE;
        // for(int i=0; i<list.size(); i++){

            if(list.size() == 1)
             return list.get(0);
            // else{
                // while(list.size() == 1)
                // {

                    start = ((start + k) % list.size());
                    // int kill_position = k-1;
                    list.remove( start );

                    JoshLastFreedom(list, start, k);
                    
                // }
                x = list.get(0);
            // } 
        // }
        
        
        return x;

    }
}
