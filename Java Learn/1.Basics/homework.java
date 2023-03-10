import java.util.*;
public class homework {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the price of pencil:");
        float pc = sc.nextFloat();
        System.out.print("enter the price of pen:");
        float pe = sc.nextFloat();
        System.out.print("enter the price of eraser:");
        Float er = sc.nextFloat();
        float t1 = pc+pe+er;
        float total = 1.18f*(pc+pe+er);
        System.out.println("Your total price(not including gst):"+t1);
        System.out.println("Your total price(including gst):"+total);
    }
}
