import java.util.Arrays;

public class LinearSearch {

    public static void main(String[] args) {
        
        int arr[] = {2,3,4,5,9,14,16,17,20};


        int target = 16;
        int index = Linear_Search( arr , target);

        if( index == -1)
          System.out.println("Element not Found");
        else  
          System.out.println("Element Found at index : "+ index);



    }

    public static int Linear_Search(int[] arr , int target) {
        System.out.println(" Linear Search Called");
        System.out.println( "Array : "+ Arrays.toString(arr) +"\n"+ " Target : "+ target );

        int steps=0;
        for (int i = 0; i < arr.length; i++) {
            steps++;
            System.out.println("Steps taken by  Linear Search : "+ steps);
            if(  arr[i] == target)
            return  i;
        }
        return -1;
        
    }

}