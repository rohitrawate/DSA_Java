
public class MultiDarray {
    public static void main(String[] args) {
        

        // Two dimensional array:
    // int[][] arr2D = new int[3][3];     // stores a total of (3*3) = 9 elements.
    int [][]  arr2D = { 
         { 1, 2, 3, 3 }, 
         { 4, 5, 6, 8 }, 
         {7, 8, 9, 8 }
       };

       System.out.println("Length of arr2D: "+arr2D.length );  //Returns only the row size
        
        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         System.out.print(arr2D[i][j] + " ");
        //     }
        //     System.out.println("");
        // }
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println("");
        }

        //  TWO D Jagged Arrays
        int j2Darr[][] = new int[3][];

        // Making the above array Jagged
        j2Darr[0] = new int[3];              // First row has 3 columns

        j2Darr[1] = new int[2];           // Second row has 2 columns
        j2Darr[2] = new int[4];         // Thiird row has  4 cols

        // Input in Jagged Array
        int count = 0;
        for (int rows = 0; rows < j2Darr.length; rows++)
            for (int cols = 0; cols < j2Darr[rows].length; cols++)
                j2Darr[rows][cols] = count++;

                System.out.println("Contents of 2D Jagged Array");
                for (int i = 0; i < j2Darr.length; i++) {
                    for (int j = 0; j < j2Darr[i].length; j++)
                        System.out.print(j2Darr[i][j] + " ");
                    System.out.println();
                }
            }



        // Three dimensional array:
        int[][][] arr3D = new int[3][2][3];    // stores a total of (3*2*2) = 12 elements.

        // System.out.println("Length of arr3D: "+arr3D.length());  //Returns only the row size

        

    
}
