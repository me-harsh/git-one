public class clearr {
    public static int clearRange(int n, int j, int i){
        int a = ((~0)<<(j+1));
        int b = ((1<<i)-1);
        int BitMask = a|b;

        return n & BitMask;
    }
}
