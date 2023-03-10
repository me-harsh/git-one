public class array7 {
    public static void kadanes (int arr[]){
        int cs=0;
        int ms=0;
        
        for(int i=0;i<arr.length;i++){
            cs+=arr[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("max subarray sum is = "+ms);
    }
    public static void main(String args[]){
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        chec(arr);
    }
    /*now if all element are negative then kadanes doesn't follow
    what we can do then is we can first pass it through a fuction which checks if even 
    one +ve comes it directs it to kadanes else it chooses the least -ve no for max
    of array.*/
    public static void chec(int array[]){
        boolean what=false;
        for (int i=0; i<array.length;i++){
            if (array[i]>0){
                what=true;
            }
        }
        if(what ==true){
            kadanes(array);
        }
        else {
            int maxS=Integer.MIN_VALUE;
            for(int i=0;i<array.length;i++){
                maxS=maxS<array[i]?array[i]:maxS;
            }
            System.out.print("max sum is ="+maxS);
        }
    }
    
}
