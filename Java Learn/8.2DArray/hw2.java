import java.util.Scanner;
public class hw2 {
    public static int sumofrow(int arr[][], int row) {
        int sum=0;
        for (int i = 0; i < arr[row].length; i++) {
            sum+=arr[row][i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] nums= {{1,4,9},{11,4,3},{2,2,3}};
        Scanner sc = new Scanner(System.in);
        System.out.println("tell me the row number");
        int row= sc.nextInt();
        System.out.print(sumofrow(nums,row));
    }
}
