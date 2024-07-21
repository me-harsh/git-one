public class PairProb {
    public static int friendPairing(int n) {
        if(n==1||n==2) return n;

        // ? choice
        //*single
        int single = friendPairing(n-1);

        // *pairs
        int pairs = (n-1)*friendPairing(n-2);

        
        return single+pairs;
    }
    // * we can write the above code in short 
    public static int pairing(int n) {
        if(n==1||n==2) return n;
    
        
        return pairing(n-1)+(n-1)*pairing(n-2);
    }
    public static void main(String[] args) {
        System.out.println("total ways are - "+ pairing(3));

    }
}
