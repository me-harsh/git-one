public class reverseno {
    public static void main(String args[]){
        int n = 2345612;
        while(n>0){
            int last=n%10;
            System.out.print(last);
            n/=10;
        }
    }
    
}
