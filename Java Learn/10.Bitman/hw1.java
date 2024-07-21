public class hw1 {
    public static void main(String [] args){
        int a = 7, b=5;
        // now swapping happens
        a = a - b;
        b = b + a;
        a = b - a;

        // there is also another method to swap
        // its the XOR method

        // the XOR method: 
        a = a^b;
        b = a^b;
        a = a^b;
    }
}
