import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class RelativeSortArr1122 {
    public static void main(String[] args) {
        
        int[] arr1  = { 26,21,11,20,50,34,1,18 };
        int[] arr2  = { 21,11,26,20 };

        int[] result = relativeSortArray(arr1, arr2);

        System.out.println(Arrays.toString(result));

    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        Map<Integer, Integer> hmap = new TreeMap<>();

        for( int ele : arr1 ){
            hmap.put(ele, hmap.getOrDefault(ele,0) + 1 ); 
        }
        System.out.println( " EntrySet() : "+ hmap.entrySet() );

        int[] ans = new int[ arr1.length ];
        int counter = 0;
        for(int i=0; i<=arr2.length-1; i++){
           for(int j=0; j<=arr1.length-1; j++){
               if( arr1[j] == arr2[i]){
                   int repeat = hmap.get(arr1[j]);
                   while( repeat > 0){
                       ans[counter++] = arr2[i];
                       repeat--;
                   }
                //   hmap.put(arr1[j],0 );
                    hmap.remove(arr1[j]);
                   break;
                }
           }
        }

        for ( Map.Entry<Integer, Integer> entry : hmap.entrySet() ){
	        System.out.println( entry.getKey() +" -> "+ entry.getValue() );
	    // }
        // for ( Map.Entry<Integer,Integer> entry : hmap.entrySet() ) {
        //   System.out.println( entry.getValue() + " --> " + entry.getKey() );
            if( entry.getValue() != 0){
                int repeat = entry.getValue();
                while( repeat > 0){
                       ans[counter++] = entry.getKey();
                       repeat--;
                   }
                // System.out.println( entry.getKey() );
            }
        }
        // System.out.println( Arrays.toString(arr1) );
        return ans;
    }

}
