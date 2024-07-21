public class Pow {
    // can also be done in this way
    // this is basic fast binary exponential
    static int ans=1;
    static int power(int a, int n){
        if(n==0) return ans;
        if((n&1)==1) ans*=a;
        return power((a*a),(n>>1));
        
    }

    public static int powOfNumber(int n, int i) {
    
        if(i== 0) return 1;
        int power = powOfNumber(n, i/2);
        int fact = power * power; 
        // int fact = powOfNumber(n, i/2) * powOfNumber(n, i/2);

        if(i%2!=0) {
            fact = n * fact;
        } 
        return fact;
    }
    public static void main(String[] args) {
        int n = 2, i = 25;
        System.out.println(powOfNumber(n,i));
    }
}
