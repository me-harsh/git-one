import java.util.*;
public class yo2 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("give me the no:");
        int a = sc.nextInt();
        int sum= 0;
        int i=1;
        while(i<=a){
            sum+=i;
            i++;
        }
        System.out.println("ur sum is:"+sum);
    }
}
