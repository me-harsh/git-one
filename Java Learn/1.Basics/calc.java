import java.util.*;
public class Calc {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("give ur 1st operand:");
        int a = sc.nextInt();
        System.out.print("give ur 2nd operand:");
        int b = sc.nextInt();
        System.out.print("give ur operant:");
        char c = sc.next().charAt(0);
        switch (c){
            case '+': System.out.println(a+"+"+b+"="+(a+b));
                break;
            case '-': System.out.println(a+"-"+b+"="+(a-b));
                break;
            case '*': System.out.println(a+"*"+b+"="+(a*b));
                break;
            case '/': System.out.println(a+"/"+b+"="+(a/b));
                break;
            case '%': System.out.println(a+"%"+b+"="+(a%b));
                break;


        }
    }
    
}
