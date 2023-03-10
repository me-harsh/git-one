import java.util.*;
public class functions {
    public static int calculateSum(int num1,int num2){
        int sum= num1+num2;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("give ur 1st operand :");
        int a = sc.nextInt();
        System.out.print("give ur 2nd operand :");
        int b = sc.nextInt();
        int sum=calculateSum(a,b);
        System.out.println("sum is :"+sum);
    }
    
}
