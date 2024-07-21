public class oddeven {
    public static void oddoreven(int n) {
    
        int bitmask = 1;
        if ((n & bitmask) != 0) {
            System.out.println("odd");
            
        } else {
            System.out.println("even");
            
        }
        // return ;
    }
}
