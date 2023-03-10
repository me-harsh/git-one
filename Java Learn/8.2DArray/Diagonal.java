public class Diagonal {
    public static void diagonalSum(int matrix[][]) {
        // ! ye wala bhi O(2n) complexity ka hai
        int lsum = 0;
        int rsum = 0;
        for (int i = 0; i < matrix.length; i++) {
            lsum+=matrix[i][i];
        }
        System.out.println(lsum);
        int r=0,c=matrix[0].length-1;
        while(r<matrix.length){
            rsum+=matrix[r][c];
            r++;
            c--;
        }
        /*for(int r=0,c=matrix[0].length-1;r<matrix.length;r++){
            rsum+=matrix[r][c];
            c--;
        } */
        //if our matrix is even that is no overlapping values
        System.out.println("left diagonal sum:"+lsum);
        System.out.println("right diagonal sum:"+rsum);
        if (matrix.length%2==0) {
            System.out.print("the sum of the diagonals is :"+(lsum+rsum));
            
        } else System.out.print("the sum of the diagonals is :"+(lsum+rsum-matrix[matrix.length/2][matrix.length/2]));
        
        // * best optimised is this one with O(n)
        //consider this part completely different from the above one 
        // the variables and all different 
        int sum=0;
        for (int i = 0; i < matrix.length; i++) {
            sum+=matrix[i][i];
            // now we know the condition for our secondary diagonal
            // from i=n and j=0 and i decreases and j increases 
            // but also we want is that our sum doesn't contain the repeated one that the middle one so
            if(i!=matrix.length-i-1) // as our j is defined in terms of i
                sum+=matrix[i][matrix.length-i-1];
        }
    }
    public static void main(String args[]) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        diagonalSum(matrix);
    }
}
