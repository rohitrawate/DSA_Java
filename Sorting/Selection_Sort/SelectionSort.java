import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        System.out.println("--- Selection Sort ---");

        int[] nums = {5,7,2,8,4,9,6,1,3};
       // int len  = nums.length;
        int[] ans = selectSort(nums);

        for (int i : ans) {
            System.out.print(i+" ");
        }
        System.out.println(" ");
    }

    static int[] selectSort(int[] nums)
    {
        int n = nums.length;
     
        for(int i=0; i< n; i++)    // "i < nums.len -1" Coz, last Ele is Already the Biggest in arr       
        {
           int min_index = i;
          for( int j=i+1; j< n; j++)
          {
            if( nums[min_index] > nums[j] )   // If next ele is Smaller than Current Swap to Sort in Asc Order
            {  
                  min_index = j;
                  System.out.println("New Min_index : @  "+min_index);
            }
           } 
           nums =  swap(nums, min_index, i);
           System.out.println(Arrays.toString(nums));
        }
        return nums;
    }

    static int[] swap(int[] arr, int l, int r)
    {
        int temp =  arr[l];
        arr[l]   =  arr[r];
        arr[r]   =  temp;

        return arr;
    }
}

