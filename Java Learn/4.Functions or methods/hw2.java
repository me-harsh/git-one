public class hw2 {
    public static boolean isEven(int a){
        if (a%2==0){
            return true;
        }else return false;
    }
    public static void main(String args[]){
        int n=5;
        System.out.println("is "+n+" even? "+isEven(n));
    }
}
