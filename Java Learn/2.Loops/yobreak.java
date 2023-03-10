import java.util.*;
public class yobreak {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // while(true){
        //     System.out.print("Enter your no.:");
        //     int a = sc.nextInt();
        //     if (a%10==0){
        //         break;
        //     }
        //     else System.out.println(a);
        // }
        do{
            System.out.print("Enter your no.:");
            int a = sc.nextInt();
            if (a%10==0){
                break;
            }
            System.out.println("Your given no :"+a);
        }while(true);
    }
}
