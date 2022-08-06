import java.util.Arrays;

public class BubbleSort2 {
    public static void main(String[] args) {
    
       System.out.println("--- Bubble Sort | Exchange | Sinking Sort ---");

       int[] nums = {5,7,2,8,4,9,6,1,3};
    //    int len  = nums.length;
       int[] ans = bubSort(nums);

       for (int i : ans) {
           System.out.print(i+" ");
       }


    }

    static int[] bubSort(int[] num)
    {
        int count =0;
        for(int i =0; i< num.length; i++ )
        {
            for(int j =1; j< num.length-i; j++)
            {
                System.out.println("i : "+i+" &  j :"+j);
                // Swap If the item is Smaller than the Previous Item
                count++;
                if( num[j-1] > num[j] )
                //    if( num[j-1] < num[j] )
                {
                    System.out.println("Swaped");
                    swap( num, j, j-1 );
                    System.out.println(Arrays.toString(num));
                }
            }
        }
        System.out.println(count);
        return num;
    }

    static int[] swap(int[] arr, int a, int b )
    {
        int temp = arr[a];
          arr[a] = arr[b];
          arr[b] = temp;

          return arr;
    }

}
