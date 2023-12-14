import java.util.Scanner;

public class BinarySearch_Class {
    public static void main(String[] args) {
        
        System.out.println(" Binary Search");

        int[] arr = {2,3,4,5,9,14,16,17,20};
        System.out.println("Enter a target to be Searched :");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        int ans = binSearch(arr ,target);
        if(ans !=-1)
        System.out.println("Position of ele : "+ ans);
        else
        System.out.println("Ele NOT found : "+ans);
    }

    public static int binSearch(int[] nums, int target ){
        System.out.println("Binary Search ");
        int steps =0;
        // int n = nums.length;
        int left = 0;
        int right = nums.length -1;

        while ( left <= right) {
            steps++;
            int mid = (left + right) /2;

            if ( nums[mid] == target) {
                // System.out.println();
                System.out.println("Steps taken by  Binary Search : "+ steps);
                return mid;
            }
            else if( nums[mid] < target){
                left = mid +1;
            }
            else
                right = mid -1;
            
        }
            System.out.println("Steps taken by  Binary Search : "+ steps);
        return -1;
    }
    
}
