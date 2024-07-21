public class extra1 {
    public static void patt(int n){
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=(2*i)-1;j++){
                if(j%2==0){
                    System.out.print(" ");
                }else System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void patt2(int n){
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        patt(5);
        System.out.println();
        patt2(7);
    }
    
}
