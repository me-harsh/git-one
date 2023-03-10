public class array3 {
    public static void pairs(int array[]){
        int tp=0;
        for(int i=0; i<array.length;i++){
            int curr=array[i];
            for(int j=i+1; j<array.length;j++){
                System.out.print("("+curr+","+array[j]+")"+" ");
                tp++;
            }
            System.out.println();
        }
        
        System.out.println("Total pairs ="+tp);
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10,12,14};
        pairs(arr);
        
    }
    
}
