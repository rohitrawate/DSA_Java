import java.util.Scanner;

public class Pattern1 {

    // row  =  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter num of rows ");
        // int n = sc.nextInt();

        pattern1(4);
        pattern3(4);
        pattern4(5);
        pattern5(4);
        pyramid(4);
        diamondPyramid(5);
        pattern30(5);
        pattern17(4);


    }


    public static void pattern1(int n)
    {
        System.out.println("Pattern-1");
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= row; col++) {
                
                System.out.print("* ");
            }
            System.out.println();

        }      /*
                    * 
                    * * 
                    * * * 
                    * * * * 
                */
        
    }

    public static void pattern3(int n)
    {
        System.out.println("Pattern-3");
        for (int row = 1; row <= n; row++) 
        {
            for (int col = 1; col <= n-row; col++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }           /*
                        * * * *
                        * * *
                        * *
                        *
                    */
    }

    public static void pattern4(int n)
    {
        System.out.println("--- Pattern-4 ---");
        for (int i = 1; i <= n ; i++) 
        {
            for (int j = 1; j <= i ; j++) 
            {
                System.out.print(j +" ");
            }
            System.out.println(" ");
        }           /*
                        1
                        1 2
                        1 2 3
                     */
    }

    public static void pattern5(int n) //4
    {   int j;
        System.out.println("--- Pattern-5 ---");
        for (int i = 1; i < (2*n) ; i++) 
        {
            int col =  i > n ? ( 2*n - i ) : i ;
            for ( j = 1; j <= col ; j++)   // if( j <= n/2 ? j++ : j--)
            {
                    System.out.print("* ");   
                 
            }
            System.out.println();
        }
        /* 
            * 
            * * 
            * * * 
            * * * * 
            * * * 
            * * 
            * 
         */
    }

    public static void pyramid(int n)
    {
        System.out.println("--- Pyramid ---");
        int row , col;
        for( row = 0; row <=  n  ; row++ )    //  (2*n + 1)
        {
            //int totalCol =  row > n ? row -   : row ;
            int numofSpaces =  n - row ; // ?    : ;        // row > n ? row - n : n - row   ;
            for (int s = 0; s <= numofSpaces; s++) {
                System.out.print(" ");
            }
            // System.out.println("-");
            for( col = 0; col <= row ; col++ )
            {
                 System.out.print("* ");
            }   
            System.out.println();
        }
         /*   *
             * * 
            * * * 
           * * * * 
          * * * * *  
            
         */
    }

     public static void diamondPyramid(int n)
     {
        System.out.println("--- DiamondPyramid ---");
        int row, col;
        for( row = 0; row <= (2*n); row++ )
        {
            int spaces = row > n ? row - n  : n - row;
            int totalCol = row > n ? ( 2*n )-row  : row ;
            for(int s= 0 ; s<= spaces; s++)
            {
                System.out.print(" ");
            }
            for(col= 0 ; col<= totalCol; col++)
            {
                System.out.print("* ");    
            }
            System.out.println();
        }


        /*    *
             * * 
            * * * 
           * * * * 
          * * * * *  
           * * * * 
            * * * 
             * *  
              *        
         */
    }

    public static void pattern30(int n)
    {
        System.out.println("--- Num Pyramid ---");
        for (int row = 1; row <= n; row++) 
        {
            int spaces = 2*n- row;
            for(int s=1; s <= spaces; s++)
            {
                System.out.print("- ");
            } 
            // int totalCol =  ;
            for (int lcol = row; lcol >= 1 ; lcol--) 
            {
                System.out.print(lcol+" ");    
            }
            for (int rcol = 2; rcol <= row; rcol++) 
            {
                System.out.print( rcol + " ");    
            }
            System.out.println();
            
        }
        /*
                1
              2 1 2
            3 2 1 2 3
          4 3 2 1 2 3 4 
        5 4 3 2 1 2 3 4 5

                1
               1 2
              1 2 3
             1 2 3 4 
            1 2 3 4 5
        */
    }

    public static void pattern17(int n)
    {
        System.out.println("--- Numpyramid ( NoSpace )");
        for (int row = 1; row < 2*n; row++) 
        {
            int spaces = row > n ? (row -n) : (n - row);
            for(int s=1; s <= spaces; s++)
            {
                System.out.print(" ");
            } 
            int totalCol = row > n ? 2*n - row : row ;
            for (int lcol = totalCol; lcol >= 1 ; lcol--) 
            {
                System.out.print(lcol);    
            }
            for (int rcol = 2; rcol <= totalCol; rcol++) 
            {
                System.out.print( rcol);    
            }
            System.out.println();
            
        }
        /*
                1
               212
              32123
             4321234 
              32123
               212
                1

            int spaces = row > n ? 2*(row -n) : 2*(n - row);
                1
              212
            32123
          4321234
            32123
              212
                1

        */
    }


}
