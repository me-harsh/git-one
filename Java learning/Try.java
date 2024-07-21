import java.util.*;
public class Try {
    public static void main(String[] args) {
        
        int nums[] = {2,3,4,0,1};
        System.out.println("The position of 4 :" + positionIndex(nums,4));
        
        
    }
    
    public static int positionIndex(int arr[],int target){
        // int minpos=0;
        // // for(int i=0; i<arr.length-1; i++){
        // //     if(i==0 && arr[i]>arr[i+1]) minpos = arr.length-1-i;
        // //     else if( arr[i]>arr[i+1] && arr[i]>arr[i-1]) minpos = arr.length -1-i;
        // // }
        // for (int i = 0; i < arr.length-1; i++) {
        //     if (arr[i]>arr[i+1]) {
        //         minpos = i+1;
        //     }
        // }
        // Arrays.sort(arr);
        // int start=0,end=arr.length-1;
        // int position =-1;
        // while(start<=end){
        //     int mid = (start+end)/2;
        //     if(arr[mid]==key) position= mid;
        //     else if(arr[mid]<key) start = mid+1;
        //     else end = mid-1;
        // }
        // if(position == -1) return position;
        // else position = position - rot;
        // // after sorting we have array index i
        // // do i-rotation position
        // //  if postition is positive then its i-3 or if negative then add 7 to it.
        
        
        // return position;
        // * now the code starts
        int left =0,right=arr.length-1;
        while (left<=right) {
            int mid = (left+right)/2;
            if (arr[mid]==target) {
                return mid;
            }
            // if left sorted
            if (arr[left]<=arr[mid]){
                if (arr[left]<=target && target <=arr[mid]) {
                    right=mid-1;
                }else left = mid+1;
            }
            // if right sorted
            if (arr[mid]<=arr[right]) {
                if (arr[mid]<=target && target<=arr[right]) {
                    left = mid+1;
                }else right = mid-1;
            }
        }
        return -1;
    }

}
