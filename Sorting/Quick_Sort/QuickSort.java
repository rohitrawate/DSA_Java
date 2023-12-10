import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        
        int[] arr = { 8,9,3,4,6,5,10 };
        int N = arr.length;

        System.out.println( " Length : "+ N);
        QuickSort.quickSort( arr, 0, N-1 );
        System.out.println( "Result : " + Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high){

        if( low < high){

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = Partition(arr, low, high);

            quickSort( arr, low, pi-1 );
            quickSort( arr, pi+1, high );
        }
    }

    public static int Partition(int[] arr, int low, int high){

        System.out.println( "LOW index : "+low + " High Index : "+ high);
        int pivot = arr[high];

        int i = low -1;  // Starting with -1th position

        for (int j = low; j < high; j++) {
            // 8,9,3,4,6,5,10
            if( arr[j] < pivot ){

                i++;
                swap( arr, i , j);
            }
        }
        swap(arr, i+1, high);
        return (i+1);
    }

    public static void swap( int[] arr, int i, int j ){
        System.out.println( "Swapping Positions : "+i +" "+ j +" \n"+Arrays.toString(arr));
        int temp = arr[i];
        arr[i]   = arr[j];
        arr[j]   = temp;
        System.out.println( Arrays.toString(arr));
    }
}
