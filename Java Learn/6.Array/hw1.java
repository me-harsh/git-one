import java.util.HashSet;

public class hw1 {
    public static void main(String args[]){
        int num[]={1,2,3,4};
        System.out.println(containsDuplicate(num));
    }
    //(O(n^2))
    public static boolean chec(int arr[]){
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    } 
    //2nd approach (o(n))
    public static boolean containsDuplicate(int[] num){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<num.length;i++){
            if(set.contains(num[i])){
                return true;
            }else set.add(num[i]);
        }
        return false;
    }
}
