
/*
 Given an array of integers nums, sort the array in increasing order based on the frequency of the values. If multiple values have
 the same frequency, sort them in decreasing order.
 Return the sorted array.
 Example 1:
 Input: nums = [1,1,2,2,2,3]
 Output: [3,1,1,2,2,2]
 Explanation: '3' has a frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3. 
 */

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Set;

public class SortArrIncrFreq1636 {

    public static void main( String args[]){

        System.out.println("Using ArrayList and Create TreeSet(ArrayList) by providing ArrList in Constructor " +
        " ");

        int nums[] = { 2,3,1,2,3,3,5,5};

        SortArrIncrFreq1636 obj = new SortArrIncrFreq1636();

        int[] result = obj.frequencySort(nums);
        System.out.println( result.toString() );

    }
    
    public int[] frequencySort(int[] arr) {

        ArrayList<Integer> al = new ArrayList<>();

        for (int num  : arr ) {
            al.add(num);
        }

        Set<Integer> Set = new TreeSet<>(al);

        for( Integer set_ele : Set){
            System.out.println(set_ele + " " );
        }

        // set

        int ans[] = {0};
        return ans;

    }
}
