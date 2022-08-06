import java.util.Scanner;;

public class Ceiling {
    public static void main(String[] args) {
        
        int[] arr = {2,4,5,9,14,16,17,20};
        System.out.println("Enter a target to be Searched :");
        final Scanner sc = new Scanner(System.in);
         int target = sc.nextInt();

        int ans = Ceiling(arr ,target);
        if(ans !=-1)
        System.out.println("Position of Ceiling ele : "+ ans +" Ele is "+arr[ans]);
        else
         System.out.println("Ele NOT found : "+ans);


    }

     static int Ceiling(int[] arr, int target)
     {
         int n = arr.length;
        int start=0, end = n-1;
         while(start <= end){
                                                    // For array in Descending order ;
             int mid = start + (end-start)/2 ;

             if(target < arr[mid])                 
             {
                 end = mid-1;                       // start = mid+1
             }
             else if( target > arr[mid])
             {
                 start = mid+1;                     //  End = mid-1
             }
             else
              return mid;
         }
             // return find;
             return start;   
     }
}
