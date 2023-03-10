import java.util.*;
public class hey {
    
    public static void main(String args[]) {
        int matrix[][]={{0,1,2},
                        {3,4,5},
                        {6,7,8}};
        spiralMatrix(matrix);
        diagonalSum(matrix);
    }
    public static void spiralMatrix(int matrix[][]){
        int startRow=0, endRow=matrix.length-1;
        int startCol=0, endCol=matrix[0].length-1;
        while(startRow<=endRow && startCol<=endCol){
            for (int j = startCol; j <= endCol ; j++) {
                System.out.print(matrix[startRow][j]+" ");
            }
            for (int i = startRow+1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol]+" ");
            }
            for (int j = endCol-1; j >= startCol; j--) {
                System.out.print(matrix[endRow][j]+" ");
            }
            for (int i = endRow-1; i >= startRow+1; i--) {
                System.out.print(matrix[i][startCol]+" ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();
        
    }
    public static void diagonalSum(int matrix[][]) {
        int lsum = 0;
        int rsum = 0;
        for (int i = 0,c=matrix[0].length-1; i < matrix.length; i++) {
            lsum+=matrix[i][i];
            if(i!=c){//i work as row and c as col
                System.out.println(matrix[i][c]);
                rsum+=matrix[i][c];
            }
            c--;
        }
        
        System.out.println("left diagonal sum:"+lsum);
        System.out.println("right diagonal sum:"+rsum);
    }
    
    
}
