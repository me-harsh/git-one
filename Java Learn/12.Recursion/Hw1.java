public class Hw1 {
    public static void occurence(int arr[], int key, int index) {
        if (index==arr.length) {
            return;
        }
        if (arr[index]==key) {
            System.out.print(index +" ");
        }
        occurence(arr, key, index+1);
    }
    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6,2,7,2,2};
        occurence(arr, 2, 0);


    }
}
