public class array6 {
    public static void subarr(int array[]){
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[array.length];
        prefix[0]=array[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+array[i];
        }
        int currSum;
        for(int i=0;i<array.length;i++){//start
            for(int j=i;j<array.length;j++){//end
                // int currSum=0;
                currSum = i==0 ? prefix[j] : prefix[j]-prefix[i-1];                  
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        
        System.out.println("Maximum sum is ="+maxSum);
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10,12,14};
        subarr(numbers);
    }
    
}
