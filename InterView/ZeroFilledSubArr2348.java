
//     2348. Number of Zero-Filled Subarrays
/* ----> https://leetcode.com/problems/number-of-zero-filled-subarrays/description/
 *   Given an integer array nums, return the number of subarrays filled with 0.

    A subarray is a contiguous non-empty sequence of elements within an array.

    Example 2:
    Input: nums = [0,0,0,2,0,0]
    Output: 9
    Explanation:
    There are 5 occurrences of [0] as a subarray.
    There are 3 occurrences of [0,0] as a subarray.
    There is 1 occurrence of [0,0,0] as a subarray.
    There is no occurrence of a subarray with a size more than 3 filled with 0. Therefore, we return 9.
    Note : // end of array so Cannot access else part


 */
public class ZeroFilledSubArr2348 {

    public static long zeroFilledSubarray(int[] nums) {
        int streak = 0;
        long ans = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if( nums[i] == 0)
            {
                streak++;
                ans  += streak;
            }
            else{
                streak = 0;
            }  
        }
        return ans;
    }

    public static long zeroFilledSubarray2(int[] nums) {
        int streakof0 = 0;
        long result = 0;
        int maxCount = 0;
        for(int i = 0; i < nums.length; i++)
        {
            System.out.println(" for : nums[ "+i+" ] = "+ nums[i] );
            if( nums[i] == 0)
            {
                streakof0++ ;
                System.out.println("streak : "+ streakof0);
                
            }
            else {                // end of array so Cannot access else part
                // maxCount = streakof0;
                //  count = 0;
                // maxCount = Math.max( maxCount , streakof0);
                result +=  ( streakof0 * (streakof0 + 1)) / 2;   // n*(n+1)/2
                System.out.println("max  : "+maxCount + " result : "+result);
                
                streakof0 = 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
         
        int[] arr = {0,0,0,2,0,0};    // 9
        int[] arr1 = {1,3,0,0,2,0,0,4};    // 6
        long ans = ZeroFilledSubArr2348.zeroFilledSubarray(arr);
        System.out.println(" ans : "+ ans);
    }
    
}
