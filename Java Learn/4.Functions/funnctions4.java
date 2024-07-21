public class funnctions4 {
    public static int factorial(int a){
        int fact=1;
        for(int i=1;i<=a;i++){
            fact*=i;
        }
        return fact;
    }
    public static int bincoeff(int n, int r){
        int fac_n=factorial(n);
        int fac_r=factorial(r);
        int fac_nmr=factorial(n-r);
        int bincoeff=fac_n/(fac_r*fac_nmr);
        return bincoeff;
    }
    public static void main(String args[]){
        System.out.println(bincoeff(5,2));
        
    }
    
}
