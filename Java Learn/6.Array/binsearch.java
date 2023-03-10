public class binsearch {
    public static int BinarySearch(int array[],int key){
        int start=0,end=array.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(array[mid]==key){//conforming
                return mid;
            }
            if(array[mid]<key){//right
                start=mid+1;
            }else {//left
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10,12,14};
        System.out.println("ur key is:"+BinarySearch(arr,10));
    }
}
