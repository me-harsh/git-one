import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("tell me income :");
        int income = sc.nextInt();
        int tax =0;
        // now comes taxing
        // for income till 500
            // tax remain 0
        income-=500;
        System.out.println(income);
        if(income<=0){
            System.out.println("your income tax is : "+tax);
            return;
        }
        // System.out.println(income);
        // after decreasing the income is reduced and is between 0 to 500
        else if(income>0 ){
            tax += (int) (income*.2);
            income-=500;
        }
        System.out.println(income);
        // System.out.println("hello");
        if(income <=0) {
            System.out.println("your income tax is : "+tax);
            return;
        }
        else if (income >0){
            tax += (int)(income*.3);
        }
        // System.out.println(income);
        System.out.println("your income tax is : "+tax);
        // System.out.println("hello2");
        // System.out.println("your income tax is : "+tax);
        return;
    }
}
