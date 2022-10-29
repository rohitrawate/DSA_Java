import java.util.Arrays;

public class Sep_SelectionSort {
    public static void main(String[] args) {
        System.out.println("--- Separate functionality Selection Sort ---");

        int[] num = {4,6,1,9,2,5,3,0,7};
        int[] result=  Solution.selectionSort(num, num.length);


        System.out.println(Arrays.toString(result));
    }
}


class Solution
{
	static int select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        System.out.println("In Select Min index");
          int min =i;
        for(int j=i+1 ; j< arr.length; j++)
        {
            // int min = j;      min is i from parameter
            if( arr[min] > arr[j])
                min = j;
        }
        return min;
	}
	
	static int[] selectionSort(int arr[], int n)
	{
	    System.out.println("In selection sort");
	    int N = arr.length;
	    for(int i =0 ; i< N; i++)
	    {
	       // int min_index = i;
	       // for(int j = i+1; j< N; j++)
	       // {
	         int min_dex = select( arr, i);
	           int temp = arr[i];
                arr[i]   = arr[min_dex];
                arr[min_dex] = temp;
	       // }
	    }
        return arr;
	}
}