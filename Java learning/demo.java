
public class demo {
    public static void priArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int check(int n){
        return (n==0)?1: n* check(n-1);
    }
    public static void main(String[] args) {
        int arr[] = {7,10,8,14,9,16,2,1,6,5};
        // mergeSort(arr, 0, arr.length-1);
        // priArr(arr);
        System.out.println(check(5));
        
    }
    public static void mergeSort(int arr[],int si, int ei){
        // base case
        if(si>=ei) return ;

        int mid = si +((ei-si)>>1);
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        merge(arr,si,ei,mid);
        
    }
    public static void merge(int arr[], int si, int ei, int mid){
        // now comes the merging part
        int i=si,j=mid+1;
        int temp[] = new int[ei-si+1];
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }
            else {
                temp[k++] = arr[j++];
            }
        }
        // now if left arr not completly put
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=ei){
            temp[k++] = arr[j++];
        }
        // now we have only made a temporary array 
        // todo: we also have to copy it to the original array
        for(i=si,k=0;i<=ei;i++,k++){
            arr[i] = temp[k];
        }
        return;
    }
       
    
}




