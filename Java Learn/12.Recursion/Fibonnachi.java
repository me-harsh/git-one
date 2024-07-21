public class Fibonnachi {
    public static int fibSeries(int n) {
    
        // if(n==0) return 0;
        // if(n==1) return 1;
        // * i can write this in one line
        if(n==0 || n==1) return n;
        int fn=fibSeries(n-1)+fibSeries(n-2);
        // fn = fnm1 + fnm2;
        return fn;
    }
    public static void main(String[] args) {
       System.out.println( fibSeries(5));
    }
}
