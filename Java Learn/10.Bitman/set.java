public class set {
    public static int setIthBit(int n, int i) {
    
        int bitmask = 1<<i;
        
        return n|bitmask ;
    }
}
