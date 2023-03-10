public class array5 {
    public static void subarr(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int currSum=0;
                for(int k=i;k<=j;k++){
                    currSum+=arr[k];
                }
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Maximum sum = "+maxSum);
    }

    public static void main(String args[]){
        int arr[]={2,4,6,8,10,12,14};
        subarr(arr);
    }
}
