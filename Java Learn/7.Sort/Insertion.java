public class Insertion {
    public static void insertionSort(int arr[]){
        // array divided into sorted and unsorted parts
        for (int i = 1; i < arr.length; i++) {
            int curr=arr[i];
            int prev=i-1;//refering to sorted part last element 
            while(prev >=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        insertionSort(arr);
    }
    
}
