
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
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

import javax.swing.text.html.parser.Element;

import java.util.Set;

public class SortArrIncrFreq1636 {

    public static void main( String args[]){

        System.out.println("Using ArrayList and Create TreeSet(ArrayList) by providing ArrList in Constructor " +
        " ");

        int nums[] = { 2,1,1,1,3,3,5,5};

        SortArrIncrFreq1636 obj = new SortArrIncrFreq1636();

        int[] result = obj.frequencySort(nums);
        System.out.println( "\n"+ Arrays.toString(result) );
        // for( int num : result){
        //     System.out.println(num);
        // }

    }
    
    public int[] frequencySort(int[] arr) {

        System.out.println("Freq() Method Called "+ Arrays.toString(arr));
        ArrayList<Integer> al = new ArrayList<>();

        for (int num  : arr ) {
            al.add(num);
        }

        TreeSet<Integer> TSet = new TreeSet<>(al); // No duplicates Allowed, Just the Unique Elements
        int[] freq = new int[TSet.size()];      // Stores the counts of freq of each element
        int[] elements = new int[TSet.size()];  // Stores the unique elements of the array from TreeSet
        int counter = 0;

        for (int num : TSet) {
            elements[counter] = num;
            // System.out.println( "Elements : " + Arrays.toString(elements));
            freq[counter] = Collections.frequency(al, num);
            // System.out.println("Frequency : " + Arrays.toString(freq));
            counter++;
        }

        System.out.println( "Elements : " + Arrays.toString(elements));
        System.out.println("Frequency : " + Arrays.toString(freq));
                                                        // Ele  = [1,2,3,5]
        for (int i = 0; i < freq.length; i++) {         // Freq = [3,1,2,2]
            for (int j = i+1; j < freq.length; j++) {
                System.out.println("Comparing " + freq[i] +" & "+ freq[j]);
                if(freq[i] >= freq[j] ){           // Compare k[i] > k[j] j=i+1  ith freq with Rest alls
                    int large = freq[i];           // Swapping large nad small num
                    freq[i] = freq[j];
                    freq[j] = large;
                    System.out.println(" Swapped \nFreq : "+Arrays.toString(freq));
                    int t1 = elements[i];
                    elements[i] = elements[j];
                    elements[j] = t1;
                    System.out.println(" Ele  : " +Arrays.toString(elements));
                }
            }
            
        }

        int[ ] ans = new int[arr.length];  // Length of array from parameter.
       //  As Elements array has only Unique elements as it Is SET Array
       int index =0;
       int ele_index =0 ;
       for (int freq_num : freq ) {
          int repeat = freq_num;
          while( repeat >= 1){
            ans[index] =  elements[ele_index];
            index++;
            repeat--;
          } 
          ele_index++;
        }
        /* 
           int ans[]=new int[a.length];
			int r=0;
	    for(int i=0;i<k.length;i++){
	        int l=k[i];
	        while(l>0){
	        ans[r]=c[i];
			r++;
	        l--;
	        }
	    }
return ans;
        */
        
        for( Integer set_ele : TSet){
            System.out.print(set_ele + " " );
        }

        return ans;

    }
}
