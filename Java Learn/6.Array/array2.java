public class array2 {
    public static void arrRev(int array[]){
        int temp;
        int len=array.length;
        for(int i=0;i<len/2;i++){
            temp=array[i];
            array[i]=array[len-i-1];
            array[len-i-1]=temp;
        }
        // while use for array reversal

    }
    public static void arrayRev(int array[]) {
        int temp;
        int i=0;
        while(i<array.length/2){
            temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
            i++; 
        }
        // return ;
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10,12,14};
        // arrRev(arr);
        arrayRev(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        
    }
    
}
