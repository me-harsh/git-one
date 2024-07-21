public class Factor {
    public static int factorialOfNum(int num, int pow) {
    
        if(pow == 1) return num;
        // int fact = num * factorialOfNum(num, pow-1);
        // return fact;
        // * we can more easily write this
        return num * factorialOfNum(num, pow-1);
    }
    public static void main(String[] args) {
        System.out.println(factorialOfNum(-1, 5));
    }
}
