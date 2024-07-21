public class hw3 {
    public static void main(String[] args) {
        // ?Convert uppercase characters to lower case using bits
        //  !logic is 'A'|' ' = 'a'
        for (char ch='A'; ch<='Z'; ch++) {
            System.out.println((char)(ch|' '));
            // the typecast is needed or else it spits answer in integers
        }
    }
}
