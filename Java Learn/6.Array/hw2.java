public class hw2 {
    public static void main(String args[]){
        int height[]={4,2,0,3,2,5};
        System.out.println(trappedWater(height));
        
    }
    public static int trappedWater(int[] arr){
        int n=arr.length;
        int leftMax[]= new int [n];
        int rightMax[]= new int [n];
        leftMax[0]=arr[0];
        rightMax[n-1]=arr[n-1];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(arr[i],leftMax[i-1]);
        }
        for (int i = n-1; i>=0; i--) {
            rightMax[i]=Math.max(arr[i],rightMax[i+1]);
        }
        int twater=0;
        for (int j = 0; j < rightMax.length; j++) {
            int waterLevel=(Math.min(leftMax[j],rightMax[j]))-arr[j];
            twater+=waterLevel;   
        }
        return twater;
    }
    
}
