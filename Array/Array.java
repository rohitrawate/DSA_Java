// import java.util.Arrays;
import java.util.Scanner;

public class Array{

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Hello arrays");
        // syntax 
        // dtype[] variable_name = new dtype[size];
        // dtype var_name[] =  new dtype[size];
        // int arr[] = new int[5];

        int i,j,k;
        int arr[] = {1,2,3,4,5};

        for( i=0 ; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        // BufferedReader bi = new BufferedReader(
        //     new InputStreamReader(System.in));
 
            
            System.out.println("2D Array");
        String[][] stra = new String[3][2];
        for( j=0 ; j<3; j++ ){
             for( k=0 ; k< stra[j].length; k++ ){
                 System.out.print("Enter :");
                //   strNums = bi.readLine().split(" ");
                 stra[j][k] = scan.next();
            }
        }

        for( j=0 ; j<3; j++ ){
            for( k=0 ; k<2; k++ ){
              System.out.print(stra[j][k]+" ");
            }
            System.out.println("");
        }
            
            // for(int x=0 ; x)
            // System.out.println(Arrays.toString(stra));
            // for(int  name  : stra){
            //     System.out.println(name+" ");
            // }

            // String[] helloWorld = {"Hello", "World"};
            // System.out.println(helloWorld);      // Output :[Ljava.lang.String;@42a57993
            // System.out.println(Arrays.toString(helloWorld));
            
    }
}