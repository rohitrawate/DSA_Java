import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KLastest_ids {
    
    public static void main(String[] args) {
        
        // String[] requests = {  "item1","item4","item1", "item2", "item2","item3"};
        List<String> req = new ArrayList<>();
        req.add("item1");
        req.add("item4");
        req.add("item1");
        req.add("item2");
        req.add("item2");
        req.add("item3");
        int K = 1;

    //    List<String>  result = Lastest_Ids( requests, K );
       List<String>  ans = Lastest_Ids( req, K );
       System.out.println( "Answer :  \t  " + ans.toString() );
    }

    public static List<String> Lastest_Ids( List<String> reqs , int K){
        List<String> ans = new ArrayList<>(K);

        String[] arr =  reqs.toArray( new String[0]);
        System.out.println( " reqs -> toStr() : " +reqs.toString() );
        System.out.println( "arr -> toStr() : "+Arrays.toString(arr) );
        
        for (int i= reqs.size()-1; i>=0; i-- ) {


            if( ans.contains( reqs.get(i) ) ){
                continue;
            }
            else{
                if( ans.size() == K)
                  return ans;
                ans.add( reqs.get(i));
            }
            System.out.println( "Ans :   => " +ans.toString() +" ");
        }
        
        
        return reqs;
    }
}
