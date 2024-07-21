public class LOccur {
    public static int LastOccurance(int arr[], int i, int key) {
    
        if(i== arr.length) return -1;
        int isFound = LastOccurance(arr, i+1, key);
        if(isFound != -1) return isFound;
        if( arr[i] == key) return i;

        return isFound;
    }

    // there is a more cleaner code for this function

    public static int LOccurance(int arr[], int i, int key) {
    
        if( i == arr.length) return -1;// base case to remove the infinite case 
        int isFound = LOccurance(arr, i+1, key);// this is to traverse to last position
        if(isFound == -1 && arr[i] == key) return i;

        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = {};
        System.out.println(Helper1.lOccurence(arr, 0, 0));
    }
}
class Helper1 {
    // 2nd method
    static int loccur = -1;
    static int lOccurence( int arr[], int i, int key){
        if(i==arr.length) return loccur;
        if(arr[i]==key) {
            loccur =i;
        }
        lOccurence(arr, i+1, key);
        return loccur;

    }
    // !now the above function is TC :- O(n)

    // 3rd method
    // for a sorted array only
    // ! TC :- O(logn)
    public static int lastOcc(int arr[], int target){
        int si=0,ei=arr.length-1;
        int last = -1;
        while(si<=ei){
            int mid = si + ((ei-si)>>1);
            if(arr[mid]==target) {
                last = mid;
                // now reduce the search size with the type we want to search
                // like last occurence 
                // so we want last occurence so if we get any higher index good
                // so make search space in higher bracket
                si=mid+1;
            }
            else if(arr[mid]>target) ei=mid-1;
            else si = mid+1;
        }
        return last;
    }
    // similarily for firstOccurence
    public static int firstOcc(int arr[], int target){
        int si=0,ei=arr.length-1;
        int first =-1;
        while(si<=ei){
            int mid= si + ((ei-si)>>1);
            if(arr[mid]==target) {
                first = mid;
                // now we want the first index so we move the search space to left
                ei=mid-1;
            }
            else if(arr[mid]>target) ei=mid-1;
            else si=mid+1;
        }
        return first;
    }
}
