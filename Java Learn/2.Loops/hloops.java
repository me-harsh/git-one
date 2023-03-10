import java.util.*;
public class hloops{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int evns=0,ods=0;
        int n =sc.nextInt();
        for(int i=1;i<=n;i++){
            if (i%2==0){
                evns+=i;
            }else ods+=i;
        }
        System.out.println("sum of even no. :"+evns);
        System.out.println("sum of odd no. :"+ods);
    }
}