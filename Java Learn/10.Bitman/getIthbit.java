public class getIthbit {
    public static void ithBit(int n, int i) {
    
        int bitmask = 1<<i;
        if ((n & bitmask)!=0) {
            System.out.println("ith bit is 1");
        } else {
            System.out.println("ith bit is 0");
        }
        return ;
    }
}