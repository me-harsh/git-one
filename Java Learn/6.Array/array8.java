public class array8 {
    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trappwater(height));
    }
    public static int trappwater(int arr[]){
        //left max boundary
        int leftmax[]=new int[arr.length];
        leftmax[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            leftmax[i]=Math.max(arr[i],leftmax[i-1]);
        }
        //right max boundary
        int rightmax[]=new int[arr.length];
        rightmax[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            rightmax[i]=Math.max(arr[i],rightmax[i+1]);
        }
        //loop
        int tw=0;
        for(int i=0;i<arr.length;i++){
            //waterlevel-min of lb,rb
            int wl=Math.min(rightmax[i],leftmax[i]);
            //trapped water = waterlevel - height
            tw+=wl-arr[i];
        }
        return tw;
        
    }
    
}
