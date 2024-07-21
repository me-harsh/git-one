public class Hw3 {
    public static void main(String[] args) {
        // System.out.println(Helper1.lenString("helloHarsh", 0));
        // System.out.println("now using the other function");
        // System.out.println(Helper1.stringLen("helloHarshraj"));
        // int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        // Helper1.occur(arr, 0, 2);
        Helper1.towerOfHanoi(4, "Source", "Helper", "Destination");
    }
}

class Helper1 {

    public static int lenString(String str, int idx) {
        if (idx == str.length())
            return idx;
        else
            return lenString(str, idx + 1);

    }

    // 2nd method
    public static int stringLen(String str) {
        if (str.length() == 0)
            return 0;

        return stringLen(str.substring(1)) + 1;
    }

    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Transfering " + n + " from " + src + " to " + dest);
            return;
        }
        // now is the code
        // transfering n-1 to helper
        towerOfHanoi(n - 1, src, dest, helper);
        System.out.println("Transfering " + n + " from " + src + " to " + dest);
        towerOfHanoi(n - 1, helper, src, dest);

    }

}
