public class hw3 {
    public static void main(String args[]){
        int n=4;
        for(int line=1; line<=n; line++){
            int a = n-line;
            for(int j=1;j<=a;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=line;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    
}
