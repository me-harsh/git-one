// import javax.swing.plaf.metal.MetalIconFactory.FolderIcon16;

public class Learn {
    public static void arrRev(int array[]){
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                for (int k = i; k <= j; k++) {
                    
                }
            }
        }
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10,12,14};
        arrRev(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        
    }
    
}
