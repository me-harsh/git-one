public class hw3 {
    public static void transpose(int arr[][]) {
    
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[j][i]);
                
            }
            System.out.println();
            
        }
        return ;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6}};
        System.out.println("the actual array is :");
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]);
                
            }
            System.out.println();
    
        }
        System.out.println("the transposed array is: ");
        transpose(arr);
    }
}
