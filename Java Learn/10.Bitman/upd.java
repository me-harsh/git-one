public class upd {
    public static int clearIthBit(int n, int i) {
    
        int Bitmask = ~(1<<i);

        return n & Bitmask;
    }
    public static int updateIthBit(int n, int i , int newBit) {
    
        n = clearIthBit(n, i); //here the clearIthBit is the same function as in the clear.java file
        int bitMask = newBit<<i;

        return n|bitMask;
    }
}
