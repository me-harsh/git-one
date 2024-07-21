public class DivideConquer {
    public static void priArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,8,0,22,65,8,8,8,9};
        System.out.println("the array is: ");
        priArr(arr);
        System.out.println();
        Helper.quickSort(arr,0,arr.length-1);
        System.out.println("The sorted array is :");
        
        priArr(arr);
    }
}
class Helper{
    public static void mergeSort(int arr[], int si, int ei){
        // base case
        if(si>=ei) return;
        
        // kaam
        int mid = si + (ei-si)/2;
        mergeSort(arr, si, mid);//*we assume that calling this sort that part of the array */
        mergeSort(arr,mid+1,ei);
        merge(arr,si,mid,ei);//assuming this function merges the two

    }
    public static void merge(int arr[], int si, int mid, int ei){
        // what we do here is merge the left and right sorted array
        int temp[] = new int[ei-si+1];
        int pointer1 = si;
        int pointer2 = mid+1;
        int i=0;
        // can't make the condition to work till i<temp.length
        // as then what happens is when the right or left pointer crosses it part and increase 
        // then it will move into the other part of array which we don't want
        while(pointer1<= mid && pointer2 <=ei){// such condition because we want that it breaks as
            //*  soon as either of the array traversal completes*/
            if(arr[pointer1]<=arr[pointer2]){
                temp[i] = arr[pointer1];
                pointer1++;
            }
            else {
                temp[i] = arr[pointer2];
                pointer2++;
            }
            i++;
        }
        // left part
        while(pointer1<=mid){
            // temp[i]=arr[pointer1];
            // i++; pointer1++;
            // can do this in one line
            temp[i++] = arr[pointer1++];
        }
        // right part
        while(pointer2<=ei){
            temp[i++]=arr[pointer2++];
        }
        // copying temp to orginal array
        for(i=0, pointer1=si;i<temp.length;i++,pointer1++){
            // now since temp is starting from 0 to that number
            // but arr we have to change from si to ei
            arr[pointer1] = temp[i];
        }
    }

    // * now is the function for quick Sort
    
    public static void quickSort(int arr[], int si, int ei){
        // base case
        if(si>=ei) return;
        
        int pIdx = partition(arr,si,ei);
        quickSort(arr, si, pIdx-1);
        quickSort(arr,pIdx+1,ei);
    }
    public static int partition(int arr[], int si, int ei){
        
        int pivot = arr[ei];
        // now here we have to first do sort then call the quickSort on that
        int i = si -1;
        // i won't start always from 0 to make space
        // so initialize it from 1 space before the si index
        for(int j=si;j<ei;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // since j at the ei is the pivot itself so the last call will make bt with the loop
        // so we seperately do the swap in the last call
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;

    }
}
