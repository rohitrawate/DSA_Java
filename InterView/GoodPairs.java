import java.util.*;
import java.util.Map;
import java.util.HashMap;

/*  Hint 
    Count how many times each number appears. 
    If a number appears n times, then n * (n – 1) / 2 
    good pairs can be made with this number.
 */


// public class GoodPairs { }
/* 
    public static int numIdenticalPairs(int[] nums) {

    int res = 0;
        Map<Integer,Integer> count= new HashMap<Integer,Integer>();
        for (int a: nums)
        {
            int cur=count.getOrDefault(a,0);
            res += cur;
            count.put(a,cur+1);
        }
        return res;        
    }
}
 */
public class GoodPairs {    

    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        // int countvalue = 0;
        Map<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        // {1,2,3,1,1,3}
        for( int x=0 ; x <nums.length; x++ )
        {
            if( hmap.containsKey(nums[x])) {
               hmap.put(nums[x] , hmap.get(nums[x]) + 1);
               System.out.println(  " Hmap : "+ hmap.get(nums[x]) );
            }
            else{ 
                hmap.put(nums[x] , 1 );
                 System.out.println(" NOt : " + nums[x] );
            }

                
        }
        for( Map.Entry<Integer, Integer> entry : hmap.entrySet() )
        {
            System.out.println(entry.getKey() +" | "+ entry.getValue());
            if( entry.getValue() > 1 ) 
            {
                System.out.println("getvalu >. 1  " + entry.getValue());
                count = count + (entry.getValue() *  (entry.getValue() - 1 ))/ 2;
            } 
            System.out.println("count : "+ count);  
        }


        return count;
    }
    public static void main(String[] args) {
        System.out.println("Hello, World! : " + 0/2);
         int[] arr = {1,2,3,1,1,3};
         int ans = GoodPairs.numIdenticalPairs(arr);
         System.out.println(" ans : "+ans);
 
    }
}