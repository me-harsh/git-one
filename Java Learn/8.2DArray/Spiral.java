
public class Spiral {
    // public static void makeMatrix(int rows,int cols) {
    //     int matrix[][]=new [rows][cols];
    //     Scanner sc = new scanner(System.in);
    //     for (int i = 0; i < matrix.length; i++) {
    //         for (int j = 0; j < matrix[0].length; j++) {
    //             matrix[i][j]=sc.nextInt();
    //         }
    //     }
    // }
    public static void printmatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
                
            }
            System.out.println();
            
        }
    }
    public static void spiralMatrix(int matrix[][]) {
        int startRow=0;
        int endRow=matrix.length-1;
        int startCol=0;
        int endCol=matrix[0].length-1;
        while (startRow<=endRow && startCol<=endCol) {
            //*top 
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(matrix[startRow][i]+" ");
                
            }
            // *right
            for (int i = startRow+1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol]+" ");
                
            }
            // *bottom
            for (int i = endCol-1; i >= startCol; i--) {
                if(startRow==endRow) break;//*jo cheez fix rahti hai vo dekhte hai ki vo phir se print to nahi ho raha */
                System.out.print(matrix[endRow][i]+" ");
                
            }
            // *left
            for (int i = endRow-1; i >= startRow+1; i--) {
                if(startCol==endCol) break;
                System.out.print(matrix[i][startCol]+" ");
                
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        // System.out.print("give rows :");
        // Scanner sc=new Scanner(System.in);
        // int rows=sc.nextInt();
        // System.out.print("give columns :");
        // int cols=sc.nextInt();
        int arr [][]={{1,2,3,41},{4,5,6,42}};
        printmatrix(arr);
        System.out.println();
        
        // makeMatrix(rows, cols);
        spiralMatrix(arr);
    }
    
    
}
