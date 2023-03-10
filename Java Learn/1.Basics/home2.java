import java.util.*;
public class home2 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("What is ur age=");
        byte a = sc.nextByte();
        if (a>=18){
            System.out.print("congrats ur adult!!");
        }
        else{
            System.out.print("Oono sorry u arn't an adult:(");
        }
    }
    
}
