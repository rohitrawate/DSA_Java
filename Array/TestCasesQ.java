import java.util.Scanner;


public class TestCasesQ{
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        int totalTestCases, eachTestCaseValues;
        System.out.println("Enter num of totalTestCases : ");
        totalTestCases = scan.nextInt();
        
        int[][] arrayMain = new int[totalTestCases][];   //2D array has length= num of Rows
        
        // Input the num of cloumns in each Row and then take all the inputs
        for(int i=0 ; i<totalTestCases ; i++)
        { 
            System.out.println("Enter num of Columns in for each row(testCase) in array: ");
           eachTestCaseValues = scan.nextInt();
            arrayMain[i] = new int[eachTestCaseValues];
            System.out.println("Enter the Test Case values");
            for (int j = 0; j < arrayMain[i].length; j++) {
                arrayMain[i][j] =  scan.nextInt();
            }
        }
        //  Printing All the Output Values & count the Even and Odd Num
        System.out.println("Printing All  Values");
        for(int row=0; row<arrayMain.length ; row++){
            int evenCount=0, oddCount = 0;

               System.out.println("Test Case"+ row +"");
                for(int col=0 ; col<arrayMain[row].length; col++){
                    
                   if(arrayMain[row][col] %2 == 0 ){
                       System.out.println(arrayMain[row][col]+ " is Even");
                        evenCount++;
                    }
                   else{
                        System.out.println(arrayMain[row][col]+" = Odd");
                        oddCount++;
                    }
                }
                System.out.println();
            

            System.out.println(
                "Total Even numbers: " + evenCount + ", Total Odd numbers: " + oddCount);
        }
        scan.close();
    }
}