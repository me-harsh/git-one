import java.util.*;
public class Array1 {
    public static void main(String args[]) {
        
        int matrix[][]=new int[3][3];
        enterValue(matrix);
        printMatrix(matrix);
        search(matrix, 4);
        largestValue(matrix);
        
    }
    public static void enterValue(int matrix[][]) {
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
    }
    public static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean search(int matrix[][], int key){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]==key){
                    System.out.println("key found at : ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void largestValue(int matrix[][]) {
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                largest=Math.max(largest,matrix[i][j]);
            }
        }
        System.out.println(largest);
    }
}
