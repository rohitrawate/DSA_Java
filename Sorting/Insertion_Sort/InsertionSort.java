import java.util.Arrays;

public class InsertionSort {
    
    public static void main(String[] args) {
        System.out.println("--- Insertion Sort ---");

        int[] arr =  {5,3,0,4,2,88,33,22,44};//55,66,77,11,45,75,99,234,56,57,35,87,54,67,32,13,17,39,41,50,37
        System.out.println(" Array : "+Arrays.toString(arr));
        int[] result = insertionSort( arr, arr.length );

        System.out.println(" Result : "+Arrays.toString(result));

    }

    static int[] insertionSort(int[] num , int n)
    { 
        int count=0;
        for (int i = 0; i < num.length -1; i++) 
        { 
            for (int j = i+1; j > 0 ; j--) 
            {
                System.out.println("Compare : "+ num[j-1] +" "+num[j]);
                count++;
                if( num[j] < num[j-1] ) // Ascending  
                {    // Swap
                    swap(num, j, j-1);
                     System.out.println("Swaped : "+num[j] +" & "+ num[j-1]);
                }
                else{
                    break;
                }   
            }
            System.out.println(Arrays.toString(num) +"\n Count: "+ count);
        }
        return num;
    }

    static int[] swap(int[] arr, int j, int  i) // i = j-1;
    {
        int temp = arr[j];
          arr[j] = arr[i]; 
        arr[i] = temp;

        return arr;
    }
}
