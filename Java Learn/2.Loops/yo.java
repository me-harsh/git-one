import java.util.*;
public class yo {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("give your range:");
        int range = sc.nextInt();
        int counter = 1;
        while(counter<=range){
            System.out.println(counter+" ");
            counter++;
        }
    }
    
}
