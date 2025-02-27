public class hw {
    public static void main(String args[]) {
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        bubbleSort(arr);
        printArr(arr);
    }
    public static void bubbleSort(int arr[]) {
        for (int turn = 0; turn < arr.length-1; turn++) {
            for (int i = 0; i < arr.length-1-turn; i++) {
                if (arr[i]>arr[i+1]) {
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    }
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int minPos=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i]=arr[minPos];
            arr[minPos]=temp;
        }
    }
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr=arr[i];
            int prev=i-1;
            while (prev >= 0 && arr[prev]>curr) {
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
    public static void countingSort(int arr[]) {
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest=Math.max(largest, arr[i]);
        }
        int count[]=new int[largest+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        for (int i = 0,j=0; i < count.length; i++) {
            while (count[i]>0) {
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    
}
