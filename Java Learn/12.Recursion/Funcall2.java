public class Funcall2 {
    public static void incPrin(int n) {
    
        if(n==1) {
            System.out.print(1+" ");
            return;
        }
        incPrin(n-1);
        System.out.print(n+" ");
        return ;
    }
    public static void main(String[] args) {
        incPrin(10);
    }
}
