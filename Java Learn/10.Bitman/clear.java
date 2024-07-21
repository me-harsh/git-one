public class clear {
    public static int clearIthBit(int n, int i) {
    
        int Bitmask = ~(1<<i);

        return n & Bitmask;
    }
}
