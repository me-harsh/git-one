public class staircasesearch {
    //todo: when there is a sorted array 2D given in the coloumn and row wise sorted then
    public static boolean staircaseSearch(int matrix[][], int key) {
        /* there are three methods to approch this
        *1st is the brute force in which we search all elements
            !it will take O(n^2)
        *2nd is doing binary search in each row
            !it will take O(nlogn) as each line take logn time 
        */
        
        for (int i = 0; i < matrix.length; i++) {
            int start=0, end=matrix[i].length-1;
            while (start<=end) {
                int mid=(start+end)/2;
                if(matrix[i][mid]==key) return true;
                else if(matrix[i][mid] <=key) start=mid+1;
                else end=mid-1;
            }
        }
        /* 
        *3rd is the most optimised is the two corner cells on the secondary diagonals
            !it will take O(n+m) 
        */
        int row=0, col=matrix.length-1;
        while (row<matrix.length && col >= 0) {//row 0 se start kiye isliye usko n tak jane 
            //aur col ko n se start kiye to usko 0 tak jane tak valid
            if(matrix[row][col]==key){
                System.out.println("the key was found at ("+row+","+col+")");
                return true;
            }
            else if(key< matrix[row][col]) col--;
            else if(key> matrix[row][col]) row++;
        }
        System.out.println("the key not found in the matrix");
        return false;
    }
    public static void main(String args[]) {
        
    }
}
