public class Tiling {
    public static int tilingProb(int n) {
        // base case
        if (n==0 || n==1) return 1;

        // horizontal choice
        int fnm2 = tilingProb(n-2);
        
        // vertical choice
        int fnm1 = tilingProb(n-1);

        int TotWays = fnm1 + fnm2;

        
        return TotWays;
    }
    public static int tiling(int n) {
        if(n==0||n==1) return 1;
        
        return tiling(n-1)+tiling(n-2);
    }
    public static void main(String[] args) {
        int n=4;

        System.out.println(tiling(n));
    }
}
