import java.util.Scanner;
public class Factorial {
    public static int fac(int n) {
        if (n<0) {
            System.out.println("give a positive number");
            
            return -1;
        }
        if (n==1 || n==0) return 1;

        // int fnm1 = ;
        int fn = n * fac(n-1);
        return fn;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("give a positive number");
        
        System.out.println(fac(sc.nextInt()));
        // * we can even handle the case when we give a negative number as our input in the function
    }
}
