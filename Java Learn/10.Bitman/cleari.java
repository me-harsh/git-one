public class cleari {
    public static int clearIbits(int n, int i) {
    
        int BitMask = (~0)<<i;// we can also write as it is same int BitMask = (~0)<<i;

        return n & BitMask;
    }
}
