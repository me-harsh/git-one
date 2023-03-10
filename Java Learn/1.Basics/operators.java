import java.util.*;
public class operators {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("put ur marks here:");
        int marks = sc.nextInt();
        String value = (marks>=33)?"yes":"no";
        System.out.println("Did u pass? :"+value);
    }
    
}
