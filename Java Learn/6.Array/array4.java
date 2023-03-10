public class array4 {
    public static void subarr(int array[]){
        int ts=0;
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(array[k]+" ");
                }
                System.out.println();
                ts++;
            }
            System.out.println();
        }
        System.out.println("Total subarray ="+ts);
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10,12,14};
        subarr(arr);
        
    }
    
}
