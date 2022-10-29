public class BubbleSort {
    public static void main(String[] args) {
        
        System.out.println("---- Bubble Sort ----");

        int[] nums = {5,7,2,8,4,9,6,1,3};
        int len  = nums.length;
        int[] ans = bubbleSort(nums, len);

        for (int i : ans) {
            System.out.print(i+" ");
        }
        System.out.println(" ");
 
    }

    static int[] bubbleSort(int[] arr, int size)
    {
        
        for(int i=0; i<= (size - 1) ; i++)
        {
            for(int j=i+1; j< size ; j++)        //  3,1,4,5,2
            {
                System.out.println("Compare : i = "+ i +" j = "+ j +" | "+arr[i]+" & "+arr[j]);
                if( arr[i] > arr[j])
                {
                    System.out.println("Swaped");
                    int temp = arr[j];
                      arr[j] =  arr[i];
                      arr[i] = temp;
                }
            }
        }
        return arr;        
    }
}


