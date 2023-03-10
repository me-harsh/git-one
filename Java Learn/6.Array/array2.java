public class array2 {
    public static void arrRev(int array[]){
        int temp;
        int len=array.length;
        for(int i=0;i<len/2;i++){
            temp=array[i];
            array[i]=array[len-i-1];
            array[len-i-1]=temp;
        }
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10,12,14};
        arrRev(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        
    }
    
}
