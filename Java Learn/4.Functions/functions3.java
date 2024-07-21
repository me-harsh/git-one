public class functions3 {
    public static int factorial(int a){
        int fact=1;
        for(int i=1;i<=a;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String args[]){
        // int n=4;
        // int fact=factorial(n);
        // System.out.println("factorial of n is :"+fact);
        //another way is
        System.out.println("factorial of n is :"+factorial(4));
    }
    
}
