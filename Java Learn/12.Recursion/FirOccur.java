
public class FirOccur {
    public static int firstIndex(int arr[], int i, int key) {
    
        if(i==arr.length) return -1;
        if(arr[i] == key) return i;

        return firstIndex(arr, i+1, key);
    }
    public static void main(String[] args) {
        int arr[] = {2,5,3,5,6,1,2,1,6,8,8,9,6};
        System.out.println(firstIndex(arr, 0, 1));
    }
}
