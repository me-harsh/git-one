public class rev2{
    public static void main(String args[]){
        int n = 1098856;
        int rev = 0;
        while(n>0){
            int ld = n%10;
            rev=(rev*10)+ld;
            n/=10;
        }
        System.out.println("ur reverse no. is :"+rev);
    }
}