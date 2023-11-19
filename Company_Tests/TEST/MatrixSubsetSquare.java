
public class MatrixSubsetSquare {

    static void printMaxSubSquare(int M[][])
    {
        int[][] resMat = new int [M.length][M[0].length];
        int ans = 0;
        int rowCount = M.length;
        int colCount = M[0].length;
        int iLoc=0;
        int jLoc=0;
        for (int i = rowCount-1; i >=0; i--){
            for (int j = colCount-1; j >= 0; j--){
                if(i == rowCount-1 || j == colCount-1){
                    resMat[i][j] = M[i][j];
                    if (resMat[i][j]> ans){
                        ans = resMat[i][j];
                    }
                }
                else if (M[i][j] == 0){
                    resMat[i][j] = 0;
                }
                else{
                    int neighbour = resMat[i][j+1];
                    int down = resMat[i+1][j];
                    int diag = resMat[i+1][j+1];
//					System.out.print("n:"+neighbour+" ");
//					System.out.print("down:"+down+" ");
//					System.out.println("diag:"+diag+" ");
                    int min = Math.min(neighbour,down);
                    min = Math.min(diag, min);
                    min = min+1;
                    resMat[i][j] = min;
                    if (min > ans){
                        ans = min;
                        iLoc = i;
                        jLoc =j;

                    }
                }

            }
        }
        int printCols =0;
        int limit = iLoc+ans;
        for(int i=iLoc;i<limit;i++) {
            for(int j = jLoc ;j<jLoc+ans;j++) {
                System.out.print(M[i][j]);
                printCols+=1;
                if(printCols==ans) {
                    System.out.print("\n");
                    printCols=0;
                }
            }
        }

        System.out.println("\n"+ans);
    }

    // Driver program
    public static void main(String[] args)
    {
        int M[][] = {{0, 1, 1, 0, 1},
                {1, 1, 1, 1, 0},
                {1, 1, 1, 1, 0},
                {1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0}};

        printMaxSubSquare(M);
    }

}

