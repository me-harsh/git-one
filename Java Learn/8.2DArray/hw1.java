public class hw1 {
    public static int findthekey(int arr[][],int key) {
        int i=0,count=0;
        while (i<2) {
            int j=0;
            while (j<3) {
                if(arr[i][j]==key) count++;
                j++;
            }
            i++;
        }
        return count;
    }
    public static void main(String args[]) {
        int arr[][] = {{4,7,8},{8,8,7}};
        System.out.print(findthekey(arr,8));
        

    }
}
