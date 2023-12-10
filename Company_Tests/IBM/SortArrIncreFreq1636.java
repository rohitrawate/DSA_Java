import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;


/* Hints/ Points to Remember : 
    While using Generis check for type conversion  Here treeMap is Useless
 * 
 */

public class SortArrIncreFreq1636 {
    
    public static void main( String[] agrs){
        System.out.println("Using HashMap , List<Entry<>> of Entry-Set \n LinkedHashMap (For sorted Entries) and  Collection.sort( o1.compareTo(o2) of Comparable Interface) Sort Ele in ArrayList \n  ");

        int[] nums = { 2,1,1,1,3,3,5,5};
        // int[] nums = {2,3,1,3,2};
        // int[] nums = {-1,1,-6,4,5,-6,1,4,1};
        // int[] result = frequencySort(nums);
        HashMap<Integer, Integer> result = frequencySort(nums);
        // System.out.println(Arrays.toString(result));
        for ( Map.Entry<Integer, Integer> entry : result.entrySet() ){
        
            // if( entry.get)
            System.out.println( entry.getKey() +" : "+ entry.getValue());
        }

    }

    public static HashMap<Integer, Integer> frequencySort(int[] nums) {
        
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

        for( int key : nums){
            if( hmap.containsKey(key)){
                hmap.put( key, hmap.get(key)+1);
            }
            else{
                hmap.put(key , 1);
            }
        }

        // Comparator<Integer, Integer> compa =  new Comparator<Integer>() {
        //     public int compare( int num1, int num2){
        //         if( )
        //     }
        // };
        
        
        // HashMap<Integer, Integer> linkedMap = hmap.entrySet()
        //       .stream()
        //       .sorted(Map.Entry.<Integer, Integer> comparingByValue())
        //       .collect(Collectors.toMap(Map.Entry::getKey , Map.Entry::getValue , (e1, e2) -> e1, LinkedHashMap::new));
        
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(hmap.entrySet());
        Collections.sort(entryList, (e1, e2) -> {
            int cmp = e1.getValue().compareTo(e2.getValue()); // Sort by values in descending order
            if (cmp == 0) {
                return e2.getKey().compareTo(e1.getKey()); // If values are equal, sort keys in descending order
            }
            return cmp;
        });

        // Create a LinkedHashMap to maintain the order of sorted entries
        LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();

        for (Map.Entry<Integer, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        
        for ( Map.Entry<Integer, Integer> entry : sortedMap.entrySet() ){
        
            // if( entry.get)
            System.out.println( entry.getKey() +" : "+ entry.getValue());
        }
        
        int totalSize = sortedMap.values().stream().mapToInt(Integer::intValue).sum();

        // Create the int array
        int[] resultArray = new int[totalSize];

        int index =0;
        for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            for (int i = 0; i < value; i++) {
                resultArray[index++] = key;
            }
        }

        System.out.println("Resulting int array:");
        for (int num : resultArray) {
            System.out.print(num + " ");
        }

        System.out.println(" ENDED \n");

        // return nums;
        return sortedMap;

    }

    // public static <K, V extends Comparable<? super V>> Map<K, V> sortMapByValueDescending(Map<K, V> map) {
    //         return map.entrySet()
    //           .stream()
    //           .sorted(Map.Entry.<K, V>comparingByValue().reversed())
    //           .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    //     }
        
}
