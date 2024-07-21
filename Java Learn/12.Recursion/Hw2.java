public class Hw2 {
    static String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public static void text(int num) {
        if (num==0) return;
        int lastDigit = num%10;
        text(num/10);
        System.out.print(digits[lastDigit]+ " ");
    }

    // *non-recursive function
    private final static String []number = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    static void numToString(int n){
        int rem;
        String str ="";
        while(n>0){
            rem = n%10;
            str = number[rem] +" "+ str;
            n/=10;
        }
        System.out.println(str);
        
    }
    public static void main(String[] args) {
        int n = 1947;
        text(n);
    }

}
